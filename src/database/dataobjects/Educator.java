package database.dataobjects;

import java.sql.ResultSet;
import java.sql.SQLException;
import myJava.MyDatabaseController;

public class Educator {
		
		//private int educator_ID; 
		private String educator_First_Name = null;
		private String educator_Last_Name = null;
		private String educator_Email;
		private String educator_Password;
		private boolean logged_in;
	//	static MyDatabaseController d;
		MyDatabaseController dbc = MyDatabaseController.getDBController();
	
		/*public void setEducatorID(int educatorID) {
			educatorID = educator_ID;
		}*/
		public void setEducatorFirstName(String educator_First_Name) {
			this.educator_First_Name = educator_First_Name;
		}
		public void setEducatorLastName(String educator_Last_Name) {
			this.educator_Last_Name = educator_Last_Name;
		}
		public void setEducatorEmail(String educator_Email) {
			this.educator_Email = educator_Email;
		}
		
		public void setEducatorPassword(String educator_Password) {
			this.educator_Password = educator_Password;
		}
				
/*		public int getEducatorID() {
			return educator_ID;
		}*/
		public String getEducatorFirstName() {
			return educator_First_Name;
		}
		public String getEducatorLastName() {
			return educator_Last_Name;
		}
		
		public String getEducatorEmail() {
			return educator_Email;
		}
		
		public String getEducatorPassword() {
			return educator_Password;
		}

		
		
		
		public boolean check(){
			String SQL = "SELECT count(*) as cnt FROM dbo.Educator WHERE Educator_Email = '"+educator_Email+"' AND Educator_Password='"+educator_Password+"'";
			ResultSet rs = dbc.executeQuery(SQL);
			try {
				while (rs.next()){
					if(rs.getInt(1)==1){
						logged_in = true;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return logged_in;
		}

			
		public boolean checkEmail(){
				boolean exists = false;
				String SQL = "SELECT count(*) as cnt FROM dbo.Educator WHERE Educator_Email = '"+educator_Email+"'";
				ResultSet rs = dbc.executeQuery(SQL);
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
			}
	
		
		public Educator(String anEducatorFirstName, String anEducatorLastName, String anEducatorEmail, String anEducatorPassword)
		{
			//this.educator_ID = anEducatorID ; 
			this.educator_First_Name = anEducatorFirstName ;
			this.educator_Last_Name = anEducatorLastName ; 
			this.educator_Email = anEducatorEmail ; 
			this.educator_Password = anEducatorPassword ;
			
			
		}
		public String toString(){
			StringBuffer buf = new StringBuffer();
			//buf.append("ID:\t");
			//buf.append(getEducatorID());
			buf.append("\nEducator First Name:\t");
			buf.append(getEducatorFirstName());
			buf.append("\nEducator Last Name:\t");
			buf.append(getEducatorLastName());
			buf.append("\nEducator Email\t");
			buf.append(getEducatorLastName());
			buf.append("\nEducator Password:\t");
			buf.append(getEducatorPassword());
			buf.append(check());
			buf.append(checkEmail());
			return buf.toString();
		}
		

		/*public Educator(int anEducatorID, String anEducatorFirstName, String anEducatorLastName, String anEducatorEmail, String anEducatorPassword)
		{
			this.educator_ID = anEducatorID ; 
			this.educator_First_Name = anEducatorFirstName ;
			this.educator_Last_Name = anEducatorLastName ; 
			this.educator_Email = anEducatorEmail ; 
			this.educator_Password = anEducatorPassword ;
			
			
		}*/
		
	//	public void insert(){
	//		String SQL = "INSERT INTO dbo.Educator VALUES('"+educator_ID+"','"+educator_First_Name+"', '"+educator_Last_Name+"', '"+educator_Email+"', '"+educator_Password+"')";
	//		d.addEducator(new Educator("please","work","now","thanks"));
	//	}
		
	/*	public boolean check(){
			String SQL = "SELECT count(*) as cnt FROM dbo.Educator WHERE Educator_Email = '"+educator_Email+"' AND Educator_Password='"+educator_Password+"'";
			ResultSet rs = d.executeQuery(SQL);
			try {
				while (rs.next()){
					if(rs.getInt(1)==1){
						logged_in = true;
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
			
			
//			SQL = "SELECT count(*) as cnt FROM name WHERE name = '"+educator_First_Name+"' AND Last name='"+educator_Last_Name+"' AND password='"+educator_Password+"'";
//			ResultSet rs1 = d.executeQuery(SQL);
//		    try {
//				while (rs1.next()){
//					this.educator_Email = rs1.getString("email");
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
			return logged_in;
		}

		public boolean checkEmail(){
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
		}
		*/

}