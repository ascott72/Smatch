package database.dataobjects;

public class Student {

	private int student_ID; 
	private String student_First_Name = null;
	private String student_Last_Name = null;
	private String student_Email;
	private String student_Password;

	public void setStudentID(int studentID) {
		studentID = student_ID;
	}
	public void setStudentFirstName(String student_First_Name) {
		this.student_First_Name = student_First_Name;
	}
	public void setStudentLastName(String student_Last_Name) {
		this.student_Last_Name = student_Last_Name;
	}
	public void setStudentEmail(String student_Email) {
		this.student_Email = student_Email;
	}
	
	public void setStudentPassword(String student_Password) {
		this.student_Password = student_Password;
	}
			
	public int getStudentID() {
		return student_ID;
	}
	public String getStudentFirstName() {
		return student_First_Name;
	}
	public String getStudentLastName() {
		return student_Last_Name;
	}
	
	public String getStudentEmail() {
		return student_Email;
	}
	
	public String getStudentPassword() {
		return student_Password;
	}
		
	
	public Student(int anstudentID, String anstudentFirstName, String anstudentLastName, String anstudentEmail, String anstudentPassword)
	{
		this.student_ID = anstudentID ; 
		this.student_First_Name = anstudentFirstName ;
		this.student_Last_Name = anstudentLastName ; 
		this.student_Email = anstudentEmail ; 
		this.student_Password = anstudentPassword ;
		
		
	}
	public String toString(){
		StringBuffer buf = new StringBuffer();
		buf.append("ID:\t");
		buf.append(getStudentID());
		buf.append("\nStudent First Name:\t");
		buf.append(getStudentFirstName());
		buf.append("\nStudent Last Name:\t");
		buf.append(getStudentLastName());
		buf.append("\nStudent Email\t");
		buf.append(getStudentLastName());
		buf.append("\nStudent Password:\t");
		buf.append(getStudentPassword());
		return buf.toString();
	}
}