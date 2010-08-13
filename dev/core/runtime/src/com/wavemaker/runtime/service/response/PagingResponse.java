/*
 *  Copyright (C) 2008-2010 WaveMaker Software, Inc.
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
package com.wavemaker.runtime.service.response;

/**
 * Denotes paged responses.
 * 
 * @author small
 * @version $Rev$ - $Date$
 *
 */
public interface PagingResponse extends RootServiceResponse {

    public static final long PAGING_NOT_USED = -1;
    
    /**
     * Get the dataSetSize; {@value #PAGING_NOT_USED} indicates that no paging
     * was used.
     */
    public long getDataSetSize();
}