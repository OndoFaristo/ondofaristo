dojo.declare("WidgetExamples", wm.Application, {
	"dialogAnimationTime": 350, 
	"disableDirtyEditorTracking": false, 
	"eventDelay": 0, 
	"i18n": false, 
	"isSecurityEnabled": false, 
	"main": "Main", 
	"manageHistory": true, 
	"manageURL": true, 
	"name": "", 
	"phoneGapLoginPage": "Login", 
	"phoneMain": "", 
	"projectSubVersion": 2, 
	"projectVersion": "3", 
	"saveCounter": 311, 
	"showIOSPhoneGapBackButton": false, 
	"studioVersion": "6.5.0.M4", 
	"tabletMain": "", 
	"theme": "wm_coolblue", 
	"toastPosition": "br", 
	"touchToClickDelay": 500, 
	"touchToRightClickDelay": 1500,
	"widgets": {
		silkIconList: ["wm.ImageList", {"colCount":39,"height":16,"iconCount":90,"url":"lib/images/silkIcons/silk.png","width":16}, {}], 
		departmentLiveView1: ["wm.LiveView", {"dataType":"com.sampledatadb.data.Department","service":"sampledataDB","view":[{"caption":"Deptid","sortable":true,"dataIndex":"deptid","type":"java.lang.Integer","displayType":"Number","required":true,"readonly":true,"includeLists":true,"includeForms":true,"order":0,"subType":null},{"caption":"Name","sortable":true,"dataIndex":"name","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":1,"subType":null},{"caption":"Budget","sortable":true,"dataIndex":"budget","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":2,"subType":null},{"caption":"Q1","sortable":true,"dataIndex":"q1","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":3,"subType":null},{"caption":"Q2","sortable":true,"dataIndex":"q2","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":4,"subType":null},{"caption":"Q3","sortable":true,"dataIndex":"q3","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":5,"subType":null},{"caption":"Q4","sortable":true,"dataIndex":"q4","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":6,"subType":null},{"caption":"Deptcode","sortable":true,"dataIndex":"deptcode","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":7,"subType":null},{"caption":"Location","sortable":true,"dataIndex":"location","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":8,"subType":null},{"caption":"Tenantid","sortable":true,"dataIndex":"tenantid","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":9,"subType":null}]}, {}], 
		deptLiveView: ["wm.LiveView", {"dataType":"com.sampledatadb.data.Department","related":["employees"],"service":"sampledataDB","view":[{"caption":"Deptid","sortable":true,"dataIndex":"deptid","type":"java.lang.Integer","displayType":"Number","required":true,"readonly":true,"includeLists":true,"includeForms":true,"order":2000,"subType":null,"widthUnits":"px"},{"caption":"Name","sortable":true,"dataIndex":"name","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":2001,"subType":null,"widthUnits":"px"},{"caption":"Budget","sortable":true,"dataIndex":"budget","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":2002,"subType":null,"widthUnits":"px"},{"caption":"Q1","sortable":true,"dataIndex":"q1","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":2003,"subType":null,"widthUnits":"px"},{"caption":"Q2","sortable":true,"dataIndex":"q2","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":2004,"subType":null,"widthUnits":"px"},{"caption":"Q3","sortable":true,"dataIndex":"q3","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":2005,"subType":null,"widthUnits":"px"},{"caption":"Q4","sortable":true,"dataIndex":"q4","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":2006,"subType":null,"widthUnits":"px"},{"caption":"Deptcode","sortable":true,"dataIndex":"deptcode","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":2007,"subType":null,"widthUnits":"px"},{"caption":"Location","sortable":true,"dataIndex":"location","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":2008,"subType":null,"widthUnits":"px"},{"caption":"Tenantid","sortable":true,"dataIndex":"tenantid","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":2009,"subType":null,"widthUnits":"px"},{"caption":"Firstname","sortable":true,"dataIndex":"employees.firstname","type":"java.lang.String","displayType":"Text","required":false,"widthUnits":"px","includeLists":true,"includeForms":true,"order":3001},{"caption":"Lastname","sortable":true,"dataIndex":"employees.lastname","type":"java.lang.String","displayType":"Text","required":false,"widthUnits":"px","includeLists":true,"includeForms":true,"order":3002}]}, {}], 
		empLiveView: ["wm.LiveView", {"dataType":"com.sampledatadb.data.Employee","related":["employee","department","vacations","employees"],"service":"sampledataDB","view":[{"caption":"Eid","sortable":true,"dataIndex":"eid","type":"java.lang.Integer","displayType":"Number","required":true,"readonly":true,"includeLists":true,"includeForms":true,"order":6000,"subType":null,"widthUnits":"px"},{"caption":"Firstname","sortable":true,"dataIndex":"firstname","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":6001,"subType":null,"widthUnits":"px"},{"caption":"Lastname","sortable":true,"dataIndex":"lastname","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":6002,"subType":null,"widthUnits":"px"},{"caption":"Street","sortable":true,"dataIndex":"street","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":6003,"subType":null,"widthUnits":"px"},{"caption":"City","sortable":true,"dataIndex":"city","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":6004,"subType":null,"widthUnits":"px"},{"caption":"State","sortable":true,"dataIndex":"state","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":6005,"subType":null,"widthUnits":"px"},{"caption":"Zip","sortable":true,"dataIndex":"zip","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":6006,"subType":null,"widthUnits":"px"},{"caption":"Birthdate","sortable":true,"dataIndex":"birthdate","type":"java.util.Date","displayType":"Date","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":6007,"subType":null,"widthUnits":"px"},{"caption":"Picurl","sortable":true,"dataIndex":"picurl","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":6008,"subType":null,"widthUnits":"px"},{"caption":"Twitterid","sortable":true,"dataIndex":"twitterid","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":6009,"subType":null,"widthUnits":"px"},{"caption":"Tenantid","sortable":true,"dataIndex":"tenantid","type":"java.lang.Integer","displayType":"Number","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":6010,"subType":null,"widthUnits":"px"},{"caption":"Firstname","sortable":true,"dataIndex":"employee.firstname","type":"java.lang.String","displayType":"Text","required":false,"widthUnits":"px","includeLists":true,"includeForms":true,"order":7001},{"caption":"Lastname","sortable":true,"dataIndex":"employee.lastname","type":"java.lang.String","displayType":"Text","required":false,"widthUnits":"px","includeLists":true,"includeForms":true,"order":7002},{"caption":"Name","sortable":true,"dataIndex":"department.name","type":"java.lang.String","displayType":"Text","required":false,"widthUnits":"px","includeLists":true,"includeForms":true,"order":8001},{"caption":"Startdate","sortable":true,"dataIndex":"vacations.startdate","type":"java.util.Date","displayType":"Date","required":false,"widthUnits":"px","includeLists":true,"includeForms":true,"order":9001},{"caption":"Enddate","sortable":true,"dataIndex":"vacations.enddate","type":"java.util.Date","displayType":"Date","required":false,"widthUnits":"px","includeLists":true,"includeForms":true,"order":9002},{"caption":"Firstname","sortable":true,"dataIndex":"employees.firstname","type":"java.lang.String","displayType":"Text","required":false,"widthUnits":"px","includeLists":true,"includeForms":true,"order":10001},{"caption":"Lastname","sortable":true,"dataIndex":"employees.lastname","type":"java.lang.String","displayType":"Text","required":false,"widthUnits":"px","includeLists":true,"includeForms":true,"order":10002},{"caption":"Picurl","sortable":true,"dataIndex":"employees.picurl","type":"java.lang.String","displayType":"Text","required":false,"widthUnits":"px","includeLists":true,"includeForms":true,"order":10008}]}, {}], 
		deptLiveVar: ["wm.LiveVariable", {"autoUpdate":false,"liveSource":"com.sampledatadb.data.Department","type":"com.sampledatadb.data.Department"}, {}], 
		empLiveVar: ["wm.LiveVariable", {"autoUpdate":false,"liveSource":"com.sampledatadb.data.Employee","type":"com.sampledatadb.data.Employee"}, {}], 
		layerNameVar: ["wm.Variable", {"type":"StringData"}, {}]
	},
	_end: 0
});

WidgetExamples.extend({


  _end: 0
});