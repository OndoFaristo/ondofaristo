/*
 *  Copyright (C) 2008-2011 VMWare, Inc. All rights reserved.
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

package com.wavemaker.runtime.data.task;

import org.hibernate.Session;

import com.wavemaker.common.util.ObjectUtils;
import com.wavemaker.runtime.data.DataServiceMetaData;
import com.wavemaker.runtime.data.Task;
import com.wavemaker.runtime.data.util.SystemUtils;

/**
 * @author Simon Toens
 * @version $Rev$ - $Date$
 *
 */
public class MergeForInsertTask extends BaseTask implements Task {

    public Object run(Session session, String dbName, Object... input) {

        if (ObjectUtils.isNullOrEmpty(input)) {
            return input;
        }

        Object[] rtn = new Object[input.length];

        DataServiceMetaData metaData = getMetaData(dbName);

        for (int i = 0; i < input.length; i++) {

            rtn[i] = SystemUtils.serverMergeForInsert(input[i], session,
                    metaData);

        }
        
        return rtn;

    }

    public String getName() {
        return "Built-in MergeForInsert Task";
    }    
    
}