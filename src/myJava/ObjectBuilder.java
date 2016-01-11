package myJava;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.dataobjects.Educator;
import database.dataobjects.Student;
import database.dataobjects.TeachingAssistant;




public class ObjectBuilder {
	private static ObjectBuilder objBuilder = null;
	private ObjectBuilder(){};
	public static ObjectBuilder getObjectBuilder(){
		if (objBuilder == null){
			objBuilder = new ObjectBuilder();
		}
		return objBuilder;
	}
	
	
	
	public Educator createEducator(ResultSet rs){
		Educator ed = null;
		try{
			//int edID = rs.getInt(MyDatabaseConstants.COLUMN_EDUCATOR_ID);
			String edfName = rs.getString(MyDatabaseConstants.COLUMN_EDUCATOR_FIRST_NAME);
			String edlName = rs.getString(MyDatabaseConstants.COLUMN_EDUCATOR_LAST_NAME);
			String edEmail = rs.getString(MyDatabaseConstants.COLUMN_EDUCATOR_EMAIL);
			//String edUserName = rs.getString(MyDatabaseConstants.COLUMN_EDUCATOR_USER_NAME);
			String edPassword = rs.getString(MyDatabaseConstants.COLUMN_EDUCATOR_PASSWORD);
			ed= new Educator(edfName, edlName, edEmail, edPassword);
			//ed= new Educator(edID,  edfName, edlName, edEmail, edUserName, edPassword);
		}catch (SQLException e){
			e.printStackTrace();
		}
		return ed;	
	}
	public TeachingAssistant createTeachingAssistant(ResultSet rs){
		TeachingAssistant tAssist = null;
		try{
			int taID = rs.getInt(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_ID);
			String tafName = rs.getString(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_FIRST_NAME);
			String talName = rs.getString(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_LAST_NAME);
			String taEmail = rs.getString(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_EMAIL);
			String taUserName = rs.getString(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_USER_NAME);
			String taPassword = rs.getString(MyDatabaseConstants.COLUMN_TEACHING_ASSISTANT_PASSWORD);
			tAssist= new TeachingAssistant(taID, tafName, talName, taEmail, taUserName, taPassword);
		}catch (SQLException e){
			e.printStackTrace();
		}
		return tAssist;	
	}
	
	public Student createStudent(ResultSet rs){
		Student ed = null;
		try{
			int stID = rs.getInt(MyDatabaseConstants.COLUMN_STUDENT_ID);
			String stfName = rs.getString(MyDatabaseConstants.COLUMN_STUDENT_FIRST_NAME);
			String stlName = rs.getString(MyDatabaseConstants.COLUMN_STUDENT_LAST_NAME);
			String stEmail = rs.getString(MyDatabaseConstants.COLUMN_STUDENT_EMAIL);
			//String stUserName = rs.getString(MyDatabaseConstants.COLUMN_STUDENT_USER_NAME);
			String stPassword = rs.getString(MyDatabaseConstants.COLUMN_STUDENT_PASSWORD);
			ed= new Student(stID,  stfName, stlName, stEmail, stPassword);
		//	ed= new Student(stID,  stfName, stlName, stEmail, stUserName, stPassword);
		}catch (SQLException e){
			e.printStackTrace();
		}
		return ed;	
	}
	
	
	
	
}