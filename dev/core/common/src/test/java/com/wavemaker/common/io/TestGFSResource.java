/*
 *  Copyright (C) 2007-2011 VMWare, Inc. All rights reserved.
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

package com.wavemaker.common.io;

import java.io.StringBufferInputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.MongoDbFactory;

import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;
import com.wavemaker.infra.WMTestCase;

/**
 * @author Ed Callahan
 * 
 */

public class TestGFSResource extends WMTestCase {

	private static GridFS mygridfs;
	private static MongoDbFactory mongoFactory;

	@Before
	public void setUp() throws Exception {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				TestMongoConfig.class);
		mongoFactory = (MongoDbFactory) ctx.getBean("mongoFactory");
		this.info("Connected to: " // use factory to ensure mongo is running
				+ mongoFactory.getDb().getMongo().getAddress().getHost());
		mygridfs = new GridFS(mongoFactory.getDb());
	}

	@After
	public void tearDown() throws Exception {
		mongoFactory.getDb().dropDatabase();
	}

	@Test
	public void testGetPath() {
		String newPath = "/project/testOne/WEB-INF/classes/";
		GFSResource gfsRes = new GFSResource(mygridfs, newPath);
		assertEquals(newPath, gfsRes.getPath());
	}


	@Test 
	public void testCreateRelative() { 
		GFSResource newRes = null;
		String relPath = "WEB-INF/";
		String s = "Hello World <br> ! Good bye for now.";
		byte[] testData = s.getBytes();
		String fn = "foo.js";
		String path = "/wavemaker/projects/Project1/webapproot/";
		GridFSInputFile file = mygridfs.createFile(testData);
		file.setFilename(fn);
		GFSResource gfsres = new GFSResource(mygridfs, path);
		try{
			newRes = gfsres.createRelative(mygridfs, relPath );
		} catch (Exception e) { }
		assertEquals(newRes.getPath(), path + relPath );		 
	}
	

}
