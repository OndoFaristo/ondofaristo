
package com.wavemaker.io.filesystem.mongo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

import org.springframework.util.Assert;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import com.wavemaker.io.ResourceException;
import com.wavemaker.io.filesystem.FileSystem;
import com.wavemaker.io.filesystem.FileSystemPath;
import com.wavemaker.io.filesystem.ResourceType;

/**
 * {@link FileSystem} implementation backed by a Mongo database.
 * 
 * @author Phillip Webb
 */
public class MongoFileSystem implements FileSystem<MongoFileSystemKey> {

    private static final String PARENT = "parent";

    private static final String RESOURCE_TYPE = "resourceType";

    private final GridFS fs;

    public MongoFileSystem(DB db, String bucket) {
        Assert.notNull(db, "DB must not be null");
        Assert.notNull(bucket, "Bucket must not be null");
        this.fs = new GridFS(db, bucket);
    }

    @Override
    public MongoFileSystemKey getKey(FileSystemPath path) {
        return new MongoFileSystemKey(path);
    }

    @Override
    public FileSystemPath getPath(MongoFileSystemKey key) {
        return key.getPath();
    }

    @Override
    public ResourceType getResourceType(MongoFileSystemKey key) {
        GridFSDBFile file = this.fs.findOne(getFilename(key));
        if (file == null) {
            return ResourceType.DOES_NOT_EXIST;
        }
        String name = (String) file.get(RESOURCE_TYPE);
        return ResourceType.valueOf(name);
    }

    @Override
    public void createFile(MongoFileSystemKey key) {
        GridFSInputFile file = create(key, ResourceType.FILE);
        touch(file);
    }

    @Override
    public void createFolder(MongoFileSystemKey key) {
        GridFSInputFile file = create(key, ResourceType.FOLDER);
        touch(file);
    }

    private void touch(GridFSInputFile file) {
        try {
            file.getOutputStream().close();
        } catch (IOException e) {
            throw new ResourceException(e);
        }
    }

    @Override
    public Iterable<String> list(MongoFileSystemKey key) {
        BasicDBObject query = new BasicDBObject(PARENT, key.getPath().toString());
        final DBCursor list = this.fs.getFileList(query);
        return new FileListIterable(list);
    }

    @Override
    public long getSize(MongoFileSystemKey key) {
        return getFile(key).getLength();
    }

    @Override
    public long getLastModified(MongoFileSystemKey key) {
        return getFile(key).getUploadDate().getTime();
    }

    @Override
    public byte[] getSha1Digest(MongoFileSystemKey key) {
        // FIXME
        return null;
    }

    @Override
    public InputStream getInputStream(MongoFileSystemKey key) {
        return getFile(key).getInputStream();
    }

    @Override
    public OutputStream getOutputStream(MongoFileSystemKey key) {
        delete(key);
        GridFSInputFile file = create(key, ResourceType.FILE);
        return file.getOutputStream();
    }

    @Override
    public void delete(MongoFileSystemKey key) {
        this.fs.remove(getFilename(key));
    }

    private GridFSInputFile create(MongoFileSystemKey key, ResourceType type) {
        Assert.notNull(type, "Type must not be null");
        Assert.state(type != ResourceType.DOES_NOT_EXIST);
        GridFSInputFile file = this.fs.createFile(getFilename(key));
        FileSystemPath parent = key.getPath().getParent();
        if (parent != null) {
            file.put(PARENT, parent.toString());
        }
        file.put(RESOURCE_TYPE, type.name());
        return file;
    }

    private GridFSDBFile getFile(MongoFileSystemKey key) {
        GridFSDBFile file = this.fs.findOne(getFilename(key));
        Assert.state(file != null, "File " + key.getPath() + " does not exist");
        return file;
    }

    private String getFilename(MongoFileSystemKey key) {
        return key.getPath().toString();
    }

    private static class FileListIterable implements Iterable<String> {

        private final DBCursor list;

        public FileListIterable(DBCursor list) {
            this.list = list;
        }

        @Override
        public Iterator<String> iterator() {
            return new FileListIterator(this.list.iterator());
        }
    }

    private static class FileListIterator implements Iterator<String> {

        private final Iterator<DBObject> iterator;

        public FileListIterator(Iterator<DBObject> iterator) {
            this.iterator = iterator;
        }

        @Override
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override
        public String next() {
            DBObject next = this.iterator.next();
            String filename = (String) next.get("filename");
            FileSystemPath path = new FileSystemPath().get(filename);
            return path.getName();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
