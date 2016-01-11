package myJava;
import java.sql.*;
import java.util.ArrayList;


import database.dataobjects.Educator;
import database.dataobjects.Student;
import database.dataobjects.TeachingAssistant;


public class MyDatabaseController implements MyDatabaseConstants{
	
	/** VARIABLE DECLARATIONS *************************/
	private Connection dbConnection = null;
	private String userName = null;
	private String password = null;
	private String databaseName = null;
	private String databaseServerURL = null;
	private String driverClass = null;
	private String portNumber = null;
	private static MyDatabaseController DBController = null;
	private ObjectBuilder objectBuilder = null;
	private DatabaseMetaData dbMetaData = null;

	/** GETTERS AND SETTERS *************************/
	private ObjectBuilder  getObjectBuilder(){
		if (objectBuilder == null){
			objectBuilder = ObjectBuilder.getObjectBuilder(); 
		}
		return objectBuilder;
	}
	public Connection getDbConnection() {
		if (dbConnection == null){
			dbConnection = createDatabaseConnection();
		}
		return dbConnection;
	}
	private String getUserName() {
		if (userName == null){
			userName = "sa";
		}
		return userName;
	}
	private String getPassword() {
		if (password == null){
			password = "bread";//carla is casa,  beth is bread
		}
		return password;
	}
	public String getDatabaseName() {
		if (databaseName == null){
			databaseName = "database1";
		}
		return databaseName;
	}
	private String getDatabaseServerURL() {
		if (databaseServerURL == null){
			databaseServerURL = "localhost";
		}
		return databaseServerURL;
	}
	private String getDriverClass() {
		if (driverClass == null){
			driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		}
		return driverClass;
	}
	private String getPortNumber() {
		if (portNumber == null){
			portNumber = "51401";//carla 51885, beth 51401
		}
		return portNumber;
	}
	public void resetDbConnection() {
		this.dbConnection = null;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	public void setDatabaseServerURL(String databaseServerURL) {
		this.databaseServerURL = databaseServerURL;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	public void setPortNumber(String portNumber) {
		this.portNumber = portNumber;
	}
	public static MyDatabaseController getDBController() {
		if (DBController == null){
			DBController = new MyDatabaseController();
		}
		return DBController;
	}
	private DatabaseMetaData getDBMetaData(){
		try {
			dbMetaData = getDbConnection().getMetaData();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return dbMetaData;
	}
	
	/** CONSTRUCTORS *************************/
	private MyDatabaseController(){
		/**
		 * This constructor is defined as private so no one 
		 * is able to create a new instance
		 * of this class.  The static method getDBController() 
		 * should be used instead.  This
		 * will ensure all classes share the same instance of 
		 * the database controller.
		 */
	}

	/** DATABASE CONNECTION CODE **********************/
	private Connection createDatabaseConnection() {
		Connection conn = null;
		String connectString = buildConnectionString();
		//First, we make sure the Driver exists
		try {
			Class.forName(getDriverClass());
		} catch (java.lang.ClassNotFoundException e) {
			StringBuffer buf = new StringBuffer();
			buf.append("No driver class found for: ");
			buf.append(getDriverClass());
			System.out.println(buf.toString());
			System.exit(0);
		}
		//Driver class exists, now try to open the connection
		try {
			conn = DriverManager.getConnection(connectString);
		} catch (SQLException e) {
			StringBuffer buf = new StringBuffer();
			buf.append("There was a problem with the following connection string: ");
			buf.append(connectString);
			buf.append("\n\nHere is the exceptio:\n");
			buf.append(e.toString());
			System.out.println(buf.toString());
			System.exit(0);
		}
		return conn;
	}
	private String buildConnectionString(){
		/**
		 * Builds a connection string from the component pieces provided in this class.
		 */
		StringBuffer buf = new StringBuffer();
		buf.append("jdbc:sqlserver://");
		buf.append(getDatabaseServerURL());
		buf.append(":");
		buf.append(getPortNumber());
		buf.append(";databaseName=");
		buf.append(getDatabaseName());
		buf.append(";user=");
		buf.append(getUserName());
		buf.append(";password=");
		buf.append(getPassword());
		return buf.toString();
	}

	/** UTILITIES   ******************************************/
	public ArrayList<String> getDatabaseNames(){
		/**
		 * This method gets a list of all the databases on the server owned by dbo
		 */
	    ArrayList<String> databases = new ArrayList<String>();
		ResultSet res;
		try {
			res = getDBMetaData().getCatalogs();
		    while (res.next()) {
		    	databases.add(res.getString("TABLE_CAT"));
			}
			res.close();
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return databases;
}
	public ArrayList<String> getTableNames(){
		/**
		 * This method gets a list of all tables in the currently active database
		 */
		ArrayList<String> tables = new ArrayList<String>();
		DatabaseMetaData dbmd = getDBMetaData();
		if (dbmd != null){
			try {
				ResultSet rs = dbmd.getTables(null, null, "%", null);
				while(rs.next()){
					if (rs.getString(2).equals("dbo")){
						tables.add(rs.getString(3));
					}
				}
			} catch (SQLException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		}
		return tables;
	}
	public void printResultSet(ResultSet rs){
		/**
		 * This method just prints the contents of a ResultSet
		 * to the output console.
		 */
		try{
			boolean columnHeadingsPrinted = false;
			while (rs.next()){
				if(! columnHeadingsPrinted){
					//print the table's column headings
					for(int i=1; i<=rs.getMetaData().getColumnCount(); i++){
						System.out.print(rs.getMetaData().getColumnLabel(i));
						System.out.print(":\t");
					}
					System.out.println();
					columnHeadingsPrinted = true;
				}
				//now print a row of data	
				for(int i=1; i<=rs.getMetaData().getColumnCount(); i++){
					System.out.print(rs.getString(i));
					System.out.print("\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void printQueryResults(String query) {
		/**
		 * This method attempts to execute the query string passed in
		 * and print out the results to the console.
		 */
		try {
			Statement s = getDbConnection().createStatement();
			ResultSet rs = s.executeQuery(query);
			printResultSet(rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		MyDatabaseController dbc = MyDatabaseController.getDBController();
		ArrayList<String> dbNames = dbc.getDatabaseNames();
		StringBuffer buf = new StringBuffer();
		buf.append("The database server has the following databases:\n");
		for (String dbName : dbNames){
			buf.append(dbName);
			buf.append("\n");
		}
		System.out.println(buf.toString());
		ArrayList<String> tables = dbc.getTableNames();
		buf = new StringBuffer();
		buf.append("Database ");
		buf.append(dbc.getDatabaseName());
		buf.append(" has the following tables:\n");
		for (String tableName : tables){
			buf.append(tableName);
			buf.append("\n");
		}
		System.out.println(buf.toString());
		
	}
	
	/** DATA ACCESS CODE **/
	
	
	public ResultSet executeQuery(String query){
		 //Executes the query passed in on the active database and returns a ResultSet
		Statement s = null;
		ResultSet rs = null;
		try {
			s = getDbConnection().createStatement();
			rs = s.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public void insert(String SQL){
		Statement s;
		try{
			s = getDbConnection().createStatement();
			s.executeQuery(SQL);
			s.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet executeStoredProcedure(String procName, ArrayList<NameValuePair> nvpList) {
		/**
		 * Calls the stored procedure passed in, sending it
		 * the parameters passed in.  Returns the resulting ResultSet 
		 */
		ResultSet rs = null;
		StringBuffer buf = new StringBuffer();
		buf.append("{ call ");
		buf.append(procName);
		buf.append("(");
		for (int i=0; i<nvpList.size(); i++){
			if (i > 0) buf.append(", ");
			buf.append("?");
		}
		buf.append(") }");
		String sql = buf.toString();
		try {
			CallableStatement cs = getDbConnection().prepareCall(sql);
			for (int i=0; i<nvpList.size(); i++){
				cs.setString( nvpList.get(i).getName(), nvpList.get(i).getValue());
			}
			rs = cs.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	public void executeCUDStoredProcedure(String procName, ArrayList<NameValuePair> nvpList) {
		/**
		 * Calls the stored procedure passed in, sending it
		 * the parameters passed in.  Should only be used for stored procs that create, update,
		 * or delete records
		 */
		StringBuffer buf = new StringBuffer();
		buf.append("{ call ");
		buf.append(procName);
		buf.append("(");
		for (int i=0; i<nvpList.size(); i++){
			if (i > 0) buf.append(", ");
			buf.append("?");
		}
		buf.append(") }");
		String sql = buf.toString();
		try {
			CallableStatement cs = getDbConnection().prepareCall(sql);
			for (int i=0; i<nvpList.size(); i++){
				cs.setString( nvpList.get(i).getName(), nvpList.get(i).getValue());
			}
			cs.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
//	/////////////////////////////////////////////////////////////////////////////////
//	private String EducatorUsername;
//	private String EducatorPassword;
//	private String EducatorEmail;
//	private boolean EducatorLogged_in = false;
//	
	
	//public void Educator(String ausername, String apassword){
//		EducatorLogged_in = false;
//		this.userName = ausername;
//		this.password = apassword;
//		this.EducatorLogged_in = check();
//	}
//	
//	public void setUsername(String aUsername){
//		this.username = aUsername;
//	}
//	
//	public String getUsername(){
//		return username;
//	}
//
//	public void setPassword(String password){
//		this.password = password;
//	}
//	
//	public String getPassword(){
//		return password;
//	}
//
//	public void setEmail(String email){
//		this.email = email;
//	}
//	
//	public String getEmail(){
//		return email;
//	}
//
//	public void setDob(String dob){
//		this.dob = dob;
//	}
//	
//	public String getDob(){
//		return dob;
//	}
//
//	public boolean getLoggedIn(){
//		return EducatorLogged_in;
//	}
//	
//	
//	
//	
//	public boolean validateEducatorUsernameAndPassword(String eUsername, String ePassword){
//		//String SQL = "SELECT count(*) as cnt FROM users WHERE username = '"+username+"' AND password='"+password+"'";
//		ResultSet rs = null;
//		ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();
//		nvps.add(new NameValuePair(COLUMN_EDUCATOR_USER_NAME, eUsername));
//		nvps.add(new NameValuePair(COLUMN_EDUCATOR_PASSWORD, ePassword));
//		rs = executeStoredProcedure(SP_VALIDATE_EDUCATOR_USERNAME_PASSWORD);
//		try {
//			while (rs.next()){
//				if(rs.getInt(1)==1){
//					EducatorLogged_in = true;
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		//SQL = "SELECT * FROM users WHERE username = '"+username+"' AND password='"+password+"'";
//		ResultSet rs1 = d.executeStoredProcedure(SP_VALIDATE_EDUCATOR_USERNAME_PASSWORD);
//		try {
//			while (rs1.next()){
//				this.EducatorEmail = rs1.getString("email");
//		
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return EducatorLogged_in;
//	}
//	//////////////////////////////////////////////////////////////////////////////////
	/*public boolean checkEmail(){
		
		boolean exists = false;
		String SQL = "SELECT count(*) as cnt FROM dbo.Educator WHERE Educator_Email = '"+educator_Email+"'";
		ResultSet rs = d.executeQuery(SQL);
		try {
			while (rs.next()){
				if(rs.getInt(1)==1){
					exists = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return exists;
	}*/

	
/*	public boolean validateEducatorEmailAndPassword(String eEmail, String ePassword){
	//String SQL = "SELECT count(*) as cnt FROM users WHERE username = '"+username+"' AND password='"+password+"'";
		
	ResultSet rs = null;
	ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();
	nvps.add(new NameValuePair(COLUMN_EDUCATOR_EMAIL, eEmail));
	nvps.add(new NameValuePair(COLUMN_EDUCATOR_PASSWORD, ePassword));
	rs = executeStoredProcedure(SP_VALIDATE_EDUCATOR_EMAIL_PASSWORD,nvps);
	try {
		while (rs.next()){
			if(rs.getInt(1)==1){
				EducatorLogged_in = true;
			}
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	//SQL = "SELECT * FROM users WHERE username = '"+username+"' AND password='"+password+"'";
	ResultSet rs1 = executeStoredProcedure(SP_VALIDATE_EDUCATOR_EMAIL_PASSWORD);
	try {
		while (rs1.next()){
			this.EducatorEmail = rs1.getString("email");
	
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return EducatorLogged_in;
	}	
*/
/*	public ResultSet getEducatorID(String ed){
		*//**
		 * Returns a ResultSet containing at most one row 
		 * of data about a car
		*//*
		ResultSet rs = null;
		ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new NameValuePair(COLUMN_EDUCATOR_ID, ed));
	//	rs = executeStoredProcedure(SP_GET_EDUCATOR_BY_ID, nvps);
		return rs;
	}
*/	
	public boolean  validateRegistrationInformation(String eEmail) {

		//Educator.checkEmail() ;	
		ResultSet rs = null;
		boolean EmailExists_in = false;
		ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();
		//nvps.add(new NameValuePair(COLUMN_EDUCATOR_FIRST_NAME, eFname));
		//.add(new NameValuePair(COLUMN_EDUCATOR_LAST_NAME, eLname));
		nvps.add(new NameValuePair(COLUMN_EDUCATOR_EMAIL, eEmail));
		//nvps.add(new NameValuePair(COLUMN_EDUCATOR_PASSWORD, ePassword));
		rs = executeStoredProcedure(SP_GET_EDUCATOR_BY_EMAIL, nvps);
		try {
			while (rs.next()){
				if(rs.getInt(1)==1){
					EmailExists_in = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return EmailExists_in;
		}	
	
	
	/*public boolean validateRegistrationInformation(String eFname, String eLname ,String eEmail, String ePassword){
		//String SQL = "SELECT count(*) as cnt FROM users WHERE username = '"+username+"' AND password='"+password+"'";
		Educator.checkEmail();	
		ResultSet rs = null;
		boolean EmailExists_in = false;
		ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new NameValuePair(COLUMN_EDUCATOR_FIRST_NAME, eFname));
		nvps.add(new NameValuePair(COLUMN_EDUCATOR_LAST_NAME, eLname));
		nvps.add(new NameValuePair(COLUMN_EDUCATOR_EMAIL, eEmail));
		nvps.add(new NameValuePair(COLUMN_EDUCATOR_PASSWORD, ePassword));
		rs = executeStoredProcedure(SP_GET_EDUCATOR_BY_EMAIL, nvps);
		try {
			while (rs.next()){
				if(rs.getInt(1)==1){
					EmailExists_in = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return EmailExists_in;
		}	
*/	/*public Educator validateRegistrationInformation(Educator ed){
		*//**
		 * Returns an Educators object for the educators ID
		 * passed in
		 *//*
		Educator ed = null;
		ResultSet rs = null;
		ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new NameValuePair(COLUMN_EDUCATOR_EMAIL, ed.check());
		rs = executeStoredProcedure(SP_GET_EDUCATOR_BY_EMAIL, nvps);
		try {
			if (rs.next()){
				ed = getObjectBuilder().createEducator(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ;
	}
	*/
	
	//Educator Begins
	public Educator getEducatorByEmail(String educatorEmail){
		/**
		 * Returns an Educators object for the educators ID
		 * passed in
		 */
		Educator ed = null;
		ResultSet rs = null;
		ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new NameValuePair(COLUMN_EDUCATOR_EMAIL, educatorEmail));
		rs = executeStoredProcedure(SP_GET_EDUCATOR_BY_EMAIL, nvps);
		try {
			if (rs.next()){
				ed = getObjectBuilder().createEducator(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ed;
	}
	/*public Educator getEducatorByID(String educatorID){
		*//**
		 * Returns an Educators object for the educators ID
		 * passed in
		 *//*
		Educator ed = null;
		ResultSet rs = null;
		ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new NameValuePair(COLUMN_EDUCATOR_ID, educatorID));
	//	rs = executeStoredProcedure(SP_GET_EDUCATOR_BY_ID, nvps);
		try {
			if (rs.next()){
				ed = getObjectBuilder().createEducator(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ed;
	}
*/
	public void updateEducator(Educator ed){
		ArrayList<NameValuePair> nvpList = new ArrayList<NameValuePair>();
	//	nvpList.add(new NameValuePair(COLUMN_EDUCATOR_ID, Integer.toString(ed.getEducatorID())));
		nvpList.add(new NameValuePair(COLUMN_EDUCATOR_FIRST_NAME, ed.getEducatorFirstName()));
		nvpList.add(new NameValuePair(COLUMN_EDUCATOR_LAST_NAME, ed.getEducatorLastName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_EDUCATOR_EMAIL, ed.getEducatorEmail()));
		//nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_EDUCATOR_USER_NAME, ed.getEducatorUserName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_EDUCATOR_PASSWORD, ed.getEducatorPassword()));
		executeCUDStoredProcedure(SP_UPDATE_EDUCATOR, nvpList);
	}

	public void addEducator(Educator ed){
		ArrayList<NameValuePair> nvpList = new ArrayList<NameValuePair>();
		//nvpList.add(new NameValuePair(COLUMN_EDUCATOR_ID, Integer.toString(ed.getEducatorID())));
		nvpList.add(new NameValuePair(COLUMN_EDUCATOR_FIRST_NAME, ed.getEducatorFirstName()));
		nvpList.add(new NameValuePair(COLUMN_EDUCATOR_LAST_NAME, ed.getEducatorLastName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_EDUCATOR_EMAIL, ed.getEducatorEmail()));
		//nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_EDUCATOR_USER_NAME, ed.getEducatorUserName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_EDUCATOR_PASSWORD, ed.getEducatorPassword()));
		executeCUDStoredProcedure(SP_ADD_EDUCATOR, nvpList);
	}
	


	public void deleteEducator(Educator ed){
		ArrayList<NameValuePair> nvpList = new ArrayList<NameValuePair>();
		nvpList.add(new NameValuePair(COLUMN_EDUCATOR_EMAIL, ed.getEducatorEmail()));
		executeCUDStoredProcedure(SP_DELETE_EDUCATOR, nvpList);
	}
	
//	///////////////TA Begins
	public ResultSet getTeachingAssistantID(String TA){
		/**
		 * Returns a ResultSet containing at most one row 
		 * of data about a TeachingAssistant
		 */
		ResultSet rs = null;
		ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new NameValuePair(COLUMN_TEACHING_ASSISTANT_ID, TA));
		rs = executeStoredProcedure(SP_GET_TEACHING_ASSISTANT_BY_ID, nvps);
		return rs;
		}
	public TeachingAssistant getTeachingAssistantByID(String ta){
		/**
		 * Returns a TeachingAssistant object for the TA ID
		 * passed in
		 */
		TeachingAssistant tAssist = null;
		ResultSet rs = null;
		ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new NameValuePair(COLUMN_TEACHING_ASSISTANT_ID, ta));
		rs = executeStoredProcedure(SP_GET_TEACHING_ASSISTANT_BY_ID, nvps);
		try {
			if (rs.next()){
				tAssist = getObjectBuilder().createTeachingAssistant(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tAssist;
	}

	public void updateTeachingAssistant(TeachingAssistant TeachA){
		ArrayList<NameValuePair> nvpList = new ArrayList<NameValuePair>();
		nvpList.add(new NameValuePair(COLUMN_TEACHING_ASSISTANT_ID, Integer.toString(TeachA.getTeachingAssistantID())));
		nvpList.add(new NameValuePair(COLUMN_TEACHING_ASSISTANT_FIRST_NAME, TeachA.getTeachingAssistantFirstName()));
		nvpList.add(new NameValuePair(COLUMN_TEACHING_ASSISTANT_LAST_NAME, TeachA.getTeachingAssistantLastName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_EMAIL, TeachA.getTeachingAssistantEmail()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_USER_NAME, TeachA.getTeachingAssistantUserName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_PASSWORD, TeachA.getTeachingAssistantPassword()));
		executeCUDStoredProcedure(SP_UPDATE_TEACHING_ASSISTANT, nvpList);
	}

	public void addTeachingAssistant(TeachingAssistant TeachA){
		ArrayList<NameValuePair> nvpList = new ArrayList<NameValuePair>();
		nvpList.add(new NameValuePair(COLUMN_TEACHING_ASSISTANT_ID, Integer.toString(TeachA.getTeachingAssistantID())));
		nvpList.add(new NameValuePair(COLUMN_TEACHING_ASSISTANT_FIRST_NAME, TeachA.getTeachingAssistantFirstName()));
		nvpList.add(new NameValuePair(COLUMN_TEACHING_ASSISTANT_LAST_NAME, TeachA.getTeachingAssistantLastName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_EMAIL, TeachA.getTeachingAssistantEmail()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_USER_NAME, TeachA.getTeachingAssistantUserName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_PASSWORD, TeachA.getTeachingAssistantPassword()));
		executeCUDStoredProcedure(SP_ADD_TEACHING_ASSISTANT, nvpList);
	}

	public void deleteTeachingAssistant(TeachingAssistant TeachA){
		ArrayList<NameValuePair> nvpList = new ArrayList<NameValuePair>();
		nvpList.add(new NameValuePair(COLUMN_TEACHING_ASSISTANT_ID, Integer.toString(TeachA.getTeachingAssistantID())));
		executeCUDStoredProcedure(SP_DELETE_TEACHING_ASSISTANT, nvpList);
	}
	
	
	
	
	/////////////Student Begins
	public Student getStudentByID(String studentID){
		/**
		 * Returns an Student object for the student ID
		 * passed in
		 */
		Student st = null;
		ResultSet rs = null;
		ArrayList<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new NameValuePair(COLUMN_STUDENT_ID, studentID));
		rs = executeStoredProcedure(SP_GET_STUDENT_BY_ID, nvps);
		try {
			if (rs.next()){
				st = getObjectBuilder().createStudent(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}
	public void updateStudent(Student st){
		ArrayList<NameValuePair> nvpList = new ArrayList<NameValuePair>();
		nvpList.add(new NameValuePair(COLUMN_STUDENT_ID, Integer.toString(st.getStudentID())));
		nvpList.add(new NameValuePair(COLUMN_STUDENT_FIRST_NAME, st.getStudentFirstName()));
		nvpList.add(new NameValuePair(COLUMN_STUDENT_LAST_NAME, st.getStudentLastName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_STUDENT_EMAIL, st.getStudentEmail()));
		//nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_STUDENT_USER_NAME, st.getStudentUserName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_STUDENT_PASSWORD, st.getStudentPassword()));
		executeCUDStoredProcedure(SP_UPDATE_STUDENT, nvpList);
	}

	public void addStudent(Student st){
		ArrayList<NameValuePair> nvpList = new ArrayList<NameValuePair>();
		nvpList.add(new NameValuePair(COLUMN_STUDENT_ID, Integer.toString(st.getStudentID())));
		nvpList.add(new NameValuePair(COLUMN_STUDENT_FIRST_NAME, st.getStudentFirstName()));
		nvpList.add(new NameValuePair(COLUMN_STUDENT_LAST_NAME, st.getStudentLastName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_STUDENT_EMAIL, st.getStudentEmail()));
		//nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_STUDENT_USER_NAME, st.getStudentUserName()));
		nvpList.add(new NameValuePair(MyDatabaseConstants.COLUMN_STUDENT_PASSWORD, st.getStudentPassword()));
		executeCUDStoredProcedure(SP_ADD_STUDENT, nvpList);
	}

	public void deleteStudent(Student st){
		ArrayList<NameValuePair> nvpList = new ArrayList<NameValuePair>();
		nvpList.add(new NameValuePair(COLUMN_STUDENT_ID, Integer.toString(st.getStudentID())));
		executeCUDStoredProcedure(SP_DELETE_STUDENT, nvpList);
	}
	public void connectMeIn() {
		// TODO Auto-generated method stub
		
	}
	public void ResultSet(Educator educatorByID) {
		// TODO Auto-generated method stub
		
	}
	
	


}