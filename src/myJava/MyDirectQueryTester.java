package myJava;
//import java.sql.ResultSet;

public class MyDirectQueryTester {

	public void initialize(){
		/**
		 * This method just tests a series of parameter based 
		 * simple queries provided by the DatabaseController
		 */
		MyDatabaseController dbc = MyDatabaseController.getDBController();
		

		//Test the getEducatorByID() method
		System.out.println("Testing getEducatorID()");
		dbc.printResultSet(dbc.getEducatorID("1"));
		System.out.println("");
		
		
		System.out.println("Testing getEducatorByEmail()");
		dbc.printResultSet(dbc.getEducatorEmail("agraham@nowhere.com"));
		System.out.println("");
		

		
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDirectQueryTester dqt = new MyDirectQueryTester();
		dqt.initialize();

	}

}
