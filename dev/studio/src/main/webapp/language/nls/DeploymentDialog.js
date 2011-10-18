/*
 *  Copyright (C) 2011 VMware, Inc. All rights reserved.
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
{
HSQLDB_DATABASE_NAME_CAPTION: "File name",
DATABASE_BOX_TITLE: "Database: ${databaseName}",
CONFIRM_DELETE_HEADER: "Are you sure you want to delete this deployment?",
SYNOPSIS_NAME: "Name:",
SYNOPSIS_TARGET: "Target:",
SYNOPSIS_TYPE: "Type:",
SYNOPSIS_HOST: "Host:",
CONFIRM_DEPLOY_HEADER: "Please confirm that you want to deploy using the following settings:",
WAIT_SAVE: "Saving...",
WAIT_DEPLOY: "Deploying ${deploymentName}; this may take a few minutes...",
TOAST_SAVE_SUCCESS: "Deployment saved",
TOAST_SAVE_FAILED: "Error saving deployment: ${error}",
ALERT_DEPLOY_SUCCESS: "<center>Project deployed to<br/><br/><a target='_NewWindow' href='${url}'>${url}</a><br/><br/><b>Version</b>: ${version}</center>",
ALERT_FILE_DEPLOY_SUCCESS: "<center>Project files should now download in your browser<br/><br/><b>Version</b>: ${version}",
TOAST_DEPLOY_FAILED: "Error deploying: ${error}",
TOAST_FILE_GENERATION_SUCCESS: "Your files have been generated and will not be downloaded by your browser.",
WAIT_LOGGING_IN: "Logging in...",
ALERT_CF_NAME_TAKEN:  "${name} is already in use by another user; please pick a new name",
ALERT_INVALID_DB_TYPE: "Deployment of ${name} databases to CloudFoundry is not supported",
DELETING: "Deleting...",
INVALID_USER_PASS: "The username or password was invalid",
WAIT_UNDEPLOY: "Undeploying...",
ALERT_CF_OUT_OF_MEMORY: "CloudFoundry only allows ${memory} of running applications.  Your application has been deployed, but won't run until you shutdown some of your CloudFoundry applications and redeploy",
CHECKBOX_UPDATE_SCHEMA: "Update database schemas?",
CHECKBOX_UPDATE_SCHEMA_HELP: "If checked, we will attempt to update your CloudFoundry database schemas.  If your database is used by other applications, you may want to think carefully about whether this is safe.",
DBBOX_HSQLDB_HTML: "While you can deploy HSQLDB databases, there is no good way to update your databases when you deploy updates/fixes to your application. Each time you redeploy, all data in the old database is overwritten/lost and replaced with your current data.  We only recommend using HSQLDB to help design, develop and demo, and not to deploy finished applications",
DBBOX_CONNECTION_CAPTION: "Database Connection",
DBBOX_CONNECTION_HELPTEXT: "<ul><li>Settings: Setup the settings just as you do when importing databases</li><li>JNDI: The Java Naming and Directory Interface is a Java API for a directory service that allows Java clients to discover and lookup data and objects via a name</li></ul>",
DBBOX_TYPE_CAPTION: "Type",
DBBOX_USERNAME_CAPTION: "User name",
DBBOX_PASSWORD_CAPTION: "Password",
DBBOX_HOST_CAPTION: "Host/IP Address",
DBBOX_PORT_CAPTION: "Port",
DBBOX_NAME_CAPTION: "Database Name",
DBBOX_URL_CAPTION: "Connection URL",
DBBOX_JNDINAME_CAPTION: "JNDI Name",
DBBOX_CFTYPE_CAPTION: "Type",
DBBOX_CFNAME_CAPTION: "Database Name",
CF_DB_NODATA_WARNING: "Please note: WaveMaker will create the database schema in CloudFoundry.  No data will be included.  Your database will be available but empty.  If your using database security, this will mean nobody can login.  To copy data into your database, go to <a target='docs' href='http://dev.wavemaker.com/wiki/bin/wmdoc_6.4/Deploying#HPopulatingCloudFoundryDatabase'>Deployment Documentation</a>.",
CF_DB_NODATA_WARNING_HEIGHT: "65px",
"CF_MULTIPLE_DB_WARNING": "<div class='DeploymentWarning'>WARNING: Multiple databases may not work reliably on CloudFoundry</div>"
}