package com.so.smorphia.core;

import org.junit.Assert;
import org.junit.Test;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;
import com.so.smorphia.model.Prop;
/**
* Copyright (C) 2010 SarathOnline.com.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/


public class MorphiaTest extends Assert{
	@Test
	public void testMorphia() throws Exception {
		Morphia m = new Morphia();
		m.map(Prop.class);
		Datastore ds = m.createDatastore(new Mongo(), "sar");
		Prop p = new Prop();
		p.setEtag(System.currentTimeMillis());
		ds.save(p);
	}
	

}
