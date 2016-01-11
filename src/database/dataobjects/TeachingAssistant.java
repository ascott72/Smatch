package database.dataobjects;

public class TeachingAssistant {
			
			private int TeachingAssistant_ID; 
			private String TeachingAssistant_First_Name = null;
			private String TeachingAssistant_Last_Name = null;
			private String TeachingAssistant_Email;
			private String TeachingAssistant_User_Name;
			private String TeachingAssistant_Password;
		
			public void setTeachingAssistantID(int TeachingAssistantID) {
				TeachingAssistantID = TeachingAssistant_ID;
			}
			public void setTeachingAssistantFirstName(String TeachingAssistant_First_Name) {
				this.TeachingAssistant_First_Name = TeachingAssistant_First_Name;
			}
			public void setTeachingAssistantLastName(String TeachingAssistant_Last_Name) {
				this.TeachingAssistant_Last_Name = TeachingAssistant_Last_Name;
			}
			public void setTeachingAssistantEmail(String TeachingAssistant_Email) {
				this.TeachingAssistant_Email = TeachingAssistant_Email;
			}
			public void setTeachingAssistantUserName(String TeachingAssistant_User_Name) {
				this.TeachingAssistant_User_Name = TeachingAssistant_User_Name;
			}
			
			public void setTeachingAssistantPassword(String TeachingAssistant_Password) {
				this.TeachingAssistant_Password = TeachingAssistant_Password;
			}
					
			public int getTeachingAssistantID() {
				return TeachingAssistant_ID;
			}
			public String getTeachingAssistantFirstName() {
				return TeachingAssistant_First_Name;
			}
			public String getTeachingAssistantLastName() {
				return TeachingAssistant_Last_Name;
			}
			
			public String getTeachingAssistantEmail() {
				return TeachingAssistant_Email;
			}
			public String getTeachingAssistantUserName() {
				return TeachingAssistant_User_Name;
			}
			
			public String getTeachingAssistantPassword() {
				return TeachingAssistant_Password;
			}
				
			
			public TeachingAssistant(int anTeachingAssistantID, String anTeachingAssistantFirstName, String anTeachingAssistantLastName, String anTeachingAssistantEmail, String anTeachingAssistantUserName, String anTeachingAssistantPassword)
			{
				this.TeachingAssistant_ID = anTeachingAssistantID ; 
				this.TeachingAssistant_First_Name = anTeachingAssistantFirstName ;
				this.TeachingAssistant_Last_Name = anTeachingAssistantLastName ; 
				this.TeachingAssistant_Email = anTeachingAssistantEmail ; 
				this.TeachingAssistant_User_Name = anTeachingAssistantUserName;
				this.TeachingAssistant_Password = anTeachingAssistantPassword ;
				
				
			}
			public String toString(){
				StringBuffer buf = new StringBuffer();
				buf.append("ID:\t");
				buf.append(getTeachingAssistantID());
				buf.append("\nTeachingAssistant First Name:\t");
				buf.append(getTeachingAssistantFirstName());
				buf.append("\nTeachingAssistant Last Name:\t");
				buf.append(getTeachingAssistantLastName());
				buf.append("\nTeachingAssistant Email\t");
				buf.append(getTeachingAssistantLastName());
				buf.append("\nTeachingAssistant Username:\t");
				buf.append(getTeachingAssistantUserName());
				buf.append("\nTeachingAssistant Password:\t");
				buf.append(getTeachingAssistantPassword());
				return buf.toString();
			}


	}

