/*
 * Carla Bendezu & Brandon Bruce
 * ITIS 4166
 */

package database.dataobjects;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Users {
	private String username;
	private String password;
	private String email;
	private String dob;
	private boolean logged_in;
	private DBClass d;
	
	public Users(){
		logged_in = false;
		d = new DBClass();
		d.connectMeIn();
	}

	public Users(String username, String password, String email, String dob){
		logged_in = false;
		d = new DBClass();
		d.connectMeIn();
		this.username = username;
		this.password = password;
		this.email = email;
		this.dob = dob;
	}

	public Users(String username, String password){
		logged_in = false;
		d = new DBClass();
		d.connectMeIn();
		this.username = username;
		this.password = password;
		this.logged_in = check();
	}
	
	public void insert(){
		String SQL = "INSERT INTO USERS VALUES ('" + username + "', '" + password + "', '" + email + "', '"+ dob+ "')";
	    d.insert(SQL);
	}

	public void closeConnection(){
		d.closeConnection();
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public String getUsername(){
		return username;
	}

	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}

	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return email;
	}

	public void setDob(String dob){
		this.dob = dob;
	}
	
	public String getDob(){
		return dob;
	}

	public boolean getLoggedIn(){
		return logged_in;
	}
	
	public boolean check(){
		String SQL = "SELECT count(*) as cnt FROM users WHERE username = '"+username+"' AND password='"+password+"'";
		ResultSet rs = d.execute(SQL);
		try {
			while (rs.next()){
				if(rs.getInt(1)==1){
					logged_in = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		SQL = "SELECT * FROM users WHERE username = '"+username+"' AND password='"+password+"'";
		ResultSet rs1 = d.execute(SQL);
	    try {
			while (rs1.next()){
				this.email = rs1.getString("email");
				this.dob = rs1.getString("dob");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return logged_in;
	}

	public boolean checkUsername(){
		boolean exists = false;
		String SQL = "SELECT count(*) as cnt FROM users WHERE username = '"+username+"'";
		ResultSet rs = d.execute(SQL);
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
	
}
