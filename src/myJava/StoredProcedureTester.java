package myJava;

import database.dataobjects.Educator;
import database.dataobjects.Student;

public class StoredProcedureTester {

	public void initialize(){
		/**
		 * This method just tests a series of stored procedures
		 * provided by the DatabaseController
		 */
		MyDatabaseController dbc = MyDatabaseController.getDBController();
		
		
	/*	//Test the get () method
		System.out.println("Testing getEducatorID() stored procedure");
		dbc.printResultSet(dbc.getEducatorID("1"));
		System.out.println("");*/
		
		
		//Test the get educator email
	//	System.out.println("Testing getEducatorEmail() stored procedure");
		//dbc.printResultSet(dbc.getEducatorEmail("agraham@nowhere.com"));
		//System.out.println("");
		
		//Test the add educator 
	//	System.out.println("Testing addEducator() stored procedure");
		//dbc.printResultSet(dbc.getEducatorEmail("agraham@nowhere.com"));
		//System.out.println("");
		
	
		System.out.println("Testing addEducator() stored procedure");
		Educator ed = new Educator("Marlene", "Worley","mworley@uncc.edu","smatch123"); 
		dbc.addEducator(ed);
		
		System.out.println("Testing addEducator() stored procedure");
		Educator ed1 = new Educator("Carla", "White","mwhite@uncc.edu","smatch123"); 
		dbc.addEducator(ed1);
		
		System.out.println("Testing addEducator() stored procedure");
		Educator ed2 = new Educator("Moncef", "Bendezu","mbendezu@uncc.edu","smatch123"); 
		dbc.addEducator(ed2);
		
		System.out.println("Testing addEducator() stored procedure");
		Educator ed3 = new Educator("Travis", "Bruce","tbruce@uncc.edu","smatch123"); 
		dbc.addEducator(ed3);
		
		System.out.println("Testing addEducator() stored procedure");
		Educator ed4 = new Educator("Abby", "Scott","ascott@uncc.edu","smatch123"); 
		dbc.addEducator(ed4);
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StoredProcedureTester spt = new StoredProcedureTester();
		spt.initialize();
	}

}
