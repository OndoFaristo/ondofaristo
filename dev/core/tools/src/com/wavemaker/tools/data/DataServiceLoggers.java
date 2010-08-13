/*
 *  Copyright (C) 2007-2010 WaveMaker Software, Inc.
 *
 *  This file is part of the WaveMaker Server Runtime.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.wavemaker.tools.data;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * @author Simon Toens
 * @version $Rev$ - $Date$
 * 
 */
public class DataServiceLoggers {

    private DataServiceLoggers() {}

    
    public static final Log parserLogger = 
        LogFactory.getLog("com.wavemaker.tools.data.parser");
    
    public static final Log importLogger = LogFactory
    .getLog("com.wavemaker.tools.data.importdb");
    

}
