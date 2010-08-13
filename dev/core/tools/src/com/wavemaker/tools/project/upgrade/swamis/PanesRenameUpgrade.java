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
package com.wavemaker.tools.project.upgrade.swamis;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.wavemaker.common.WMRuntimeException;
import com.wavemaker.tools.project.Project;
import com.wavemaker.tools.project.ProjectConstants;
import com.wavemaker.tools.project.upgrade.UpgradeInfo;
import com.wavemaker.tools.project.upgrade.UpgradeTask;

/**
 * Rename the old 'panes' directory to 'pages'.
 * 
 * @author small
 * @version $Rev$ - $Date$
 *
 */
public class PanesRenameUpgrade implements UpgradeTask {
    
    private static final String OLD_PANES_DIR = "panes";

    /* (non-Javadoc)
     * @see com.wavemaker.tools.project.upgrade.UpgradeTask#doUpgrade(com.wavemaker.tools.project.Project, com.wavemaker.tools.project.upgrade.UpgradeInfo)
     */
    public void doUpgrade(Project project, UpgradeInfo upgradeInfo) {
        
        try {
            File oldPanesDir = new File(project.getWebAppRoot(), OLD_PANES_DIR);
            
            // if the project doesn't contain any panes, don't do the upgrade
            if (!oldPanesDir.exists()) {
                return;
            }
            
            FileUtils.copyDirectory(oldPanesDir,
                    new File(project.getWebAppRoot(), ProjectConstants.PAGES_DIR));
            FileUtils.forceDelete(oldPanesDir);
        } catch (IOException e) {
            throw new WMRuntimeException(e);
        }
        
        upgradeInfo.addMessage("Moved old "+OLD_PANES_DIR+" to new "+ProjectConstants.PAGES_DIR+
                "; static references to "+OLD_PANES_DIR+" will have to be updated");
    }
}
