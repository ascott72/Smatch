package myJava;
import java.util.Scanner;
public class SimpleQueryTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyDatabaseController dbc = MyDatabaseController.getDBController();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter simple query and then press the Enter Key");
		String query = scan.nextLine();
		dbc.printQueryResults(query);
	}

}
