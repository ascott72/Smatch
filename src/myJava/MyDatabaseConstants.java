package myJava;

public interface MyDatabaseConstants {
	//STORED PROCEDURE NAMES
	
//	public static String SP_GET_EDUCATOR_BY_ID = "procGetEducatorByID";
	public static String SP_GET_EDUCATOR_BY_EMAIL = "procGetEducatorByEmail";
	
	//public static String SP_GET_EDUCATOR_ID = "procGetEducatorByID";
	public static String SP_ADD_EDUCATOR = "procAddEducator";
	public static String SP_UPDATE_EDUCATOR = "procUpdateEducator";
	public static String SP_DELETE_EDUCATOR = "procDeleteEducator";
	public static String SP_VALIDATE_EDUCATOR_EMAIL_PASSWORD = "procValidateEducatorLogin";///need to create in database stored procedure
	public static String SP_ADD_STUDENT = "procAddStudent";
	public static String SP_GET_STUDENT_BY_ID = "procGetStudentByID";
	public static String SP_UPDATE_STUDENT = "procUpdateStudent";
	public static String SP_DELETE_STUDENT = "procDeleteStudent";
	
	public static String TEACHING_ASSISTANT = "procAddTA";
	public static String SP_VALIDATE_STUDENT_USERNAME_PASSWORD = "procValidateStudentLogin";
	public static String SP_GET_TEACHING_ASSISTANT_BY_ID = "procGetTAByID";
	public static String SP_GET_TEACHING_ASSISTANT_ID = "procGetTAByID";
	public static String SP_ADD_TEACHING_ASSISTANT = "procAddTA";
	public static String SP_UPDATE_TEACHING_ASSISTANT= "procUpdateTA";
	public static String SP_DELETE_TEACHING_ASSISTANT = "procDeleteTA";
	public static String SP_VALIDATE_TEACHING_ASSISTANT_USERNAME_PASSWORD = "procValidateTALogin";///need to create in database stored procedure
	
	
	//COLUMN NAMES
//	public static String COLUMN_EDUCATOR_ID = "Educator_ID";
	public static String COLUMN_EDUCATOR_FIRST_NAME = "Educator_First_Name";
	public static String COLUMN_EDUCATOR_LAST_NAME = "Educator_Last_Name";
	public static String COLUMN_EDUCATOR_EMAIL = "Educator_Email";
//	public static String COLUMN_EDUCATOR_USER_NAME = "Educator_Username";
	public static String COLUMN_EDUCATOR_PASSWORD = "Educator_Password";
	public static String COLUMN_STUDENT_ID = "Student_ID";
	public static String COLUMN_STUDENT_FIRST_NAME = "Student_Name";
	public static String COLUMN_STUDENT_LAST_NAME = "Student_Last_Name";
	public static String COLUMN_STUDENT_EMAIL = "Student_Email";
	public static String COLUMN_STUDENT_USER_NAME = "Student_Username";
	public static String COLUMN_STUDENT_PASSWORD = "Student_Password";
	public static String COLUMN_TEACHING_ASSISTANT_ID = "TA_ID";
	public static String COLUMN_TEACHING_ASSISTANT_FIRST_NAME = "TA_First_Name";
	public static String COLUMN_TEACHING_ASSISTANT_LAST_NAME = "TA_Last_Name";
	public static String COLUMN_TEACHING_ASSISTANT_EMAIL = "TA_Email";
	public static String COLUMN_TEACHING_ASSISTANT_USER_NAME = "TA_Username";
	public static String COLUMN_TEACHING_ASSISTANT_PASSWORD = "TA_Password";


	//PARAMETER NAMES
	//public static String PARAM_LOW_VALUE = "LowVal";
	//public static String PARAM_HIGH_VALUE = "HighVal";
}

