/*
 *  Copyright (C) 2012-2013 CloudJee, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wavemaker.tools.io.store;

import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.util.Assert;

import com.wavemaker.tools.io.AbstractFileContent;
import com.wavemaker.tools.io.File;
import com.wavemaker.tools.io.FileContent;
import com.wavemaker.tools.io.Folder;
import com.wavemaker.tools.io.exception.ResourceDoesNotExistException;
import com.wavemaker.tools.io.exception.ResourceExistsException;

/**
 * A {@link File} that is backed by a {@link FileStore}. Allows developers to use the simpler {@link FileStore}
 * interface to provide a full {@link File} implementation. Subclasses must provide a suitable {@link FileStore}
 * implementation via the {@link #getStore()} method.
 * 
 * @see FileStore
 * @see StoredFolder
 * 
 * @author Phillip Webb
 */
public abstract class StoredFile extends StoredResource implements File {

    private final StoredFileContent content = new StoredFileContent();

    @Override
    protected abstract FileStore getStore();

    @Override
    public long getSize() {
        return getStore().getSize();
    }

    @Override
    public long getLastModified() {
        return getStore().getLastModified();
    }

    @Override
    public void touch() throws ResourceDoesNotExistException {
        ensureExists();
        getStore().touch();
    }

    @Override
    public FileContent getContent() {
        return this.content;
    }

    @Override
    public File rename(String name) throws ResourceExistsException {
        return (File) super.rename(name);
    }

    @Override
    public void delete() {
        if (exists()) {
            getStore().delete();
        }
    }

    @Override
    public File moveTo(Folder folder) {
        Assert.notNull(folder, "Folder must not be null");
        ensureExists();
        File destination = folder.getFile(getName().toString());
        destination.getContent().write(getContent().asInputStream());
        getStore().delete();
        return destination;
    }

    @Override
    public File copyTo(Folder folder) {
        Assert.notNull(folder, "Folder must not be null");
        ensureExists();
        File destination = folder.getFile(getName().toString());
        destination.getContent().write(this);
        return destination;
    }

    @Override
    public File copyToIfNewer(Folder folder) {
        Assert.notNull(folder, "Folder must not be null");
        ensureExists();
        File destination = folder.getFile(getName().toString());
        if (this.getLastModified() > destination.getLastModified() || !destination.exists()) {
            destination.getContent().write(this);
            return destination;
        } else {
            return null;
        }
    }

    @Override
    public void createIfMissing() {
        if (!exists()) {
            createParentIfMissing();
            getStore().create();
        }
    }

    /**
     * Called to write the contents of another file to this file. This method is can optionally be implemented by
     * subclasses to implement custom file copy strategies.
     * 
     * @param file the file being written to this one
     * @return if the write operation has been handled. Return <tt>false</tt> for standard stream based writes.
     */
    protected boolean write(File file) {
        return false;
    };

    private class StoredFileContent extends AbstractFileContent {

        @Override
        public InputStream asInputStream() {
            return getStore().getInputStream();
        }

        @Override
        public OutputStream asOutputStream() {
            createParentIfMissing();
            return getStore().getOutputStream();
        }

        @Override
        public void write(File file) {
            createParentIfMissing();
            if (!StoredFile.this.write(file)) {
                super.write(file);
            }
        }
    }
}
