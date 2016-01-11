package myServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import database.dataobjects.Educator;
import myJava.MyDatabaseController;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MyDatabaseController dbc = MyDatabaseController.getDBController();
		//String email;
		String classification = request.getParameter("classification");
	//	String classification = request.getParameter("classification1");
	//	if(classification.equals("Educator")){	
		
		
		if(classification.equals("Educator")){
			
			
			Educator educator = new Educator(request.getParameter("firstname"), 
					request.getParameter("lastname"), request.getParameter("email"), request.getParameter("passw"));
			
			
			
		if((dbc.validateRegistrationInformation(classification)== true)){
			JLabel label = new JLabel("Email already in use!", JLabel.CENTER);
			JOptionPane pane = new JOptionPane(label);
			JDialog dialog = pane.createDialog("Error");
			dialog.setAlwaysOnTop(true);
			dialog.setVisible(true);	
			response.sendRedirect("educatorLogin.jsp");
			//response.sendRedirect("educatorRegistration.jsp");
			}
		
			else{
				dbc.addEducator(educator);
				response.sendRedirect("educatorLogin.jsp");
			}
	
			JLabel label = new JLabel("Shoot me NOW!!!", JLabel.CENTER);
			JOptionPane pane = new JOptionPane(label);
			JDialog dialog = pane.createDialog("Error");
			dialog.setAlwaysOnTop(true);
			dialog.setVisible(true);	
			
		}
				

	}
}


	/*	
	 * 
	 * protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MyDatabaseController dbc = MyDatabaseController.getDBController();
		String classification = request.getParameter("classification");
		if(classification.equals("Educator")){
			//Educator educator = new Educator(request.getParameter("firstname"), 
			//		request.getParameter("lastname"), request.getParameter("email"), request.getParameter("passw"));
			Educator email = new Educator(request.getParameter("firstname"), 
					request.getParameter("lastname"), request.getParameter("email"), request.getParameter("passw"));
			if(email != dbc.getEducatorEmail(email)){
				dbc.addEducator(email);
				response.sendRedirect("educatorLogin.jsp");
			}

		/if(!educator.checkEmail()){
			if(true){
				//educator.insert();
				dbc.addEducator(educator);
				response.sendRedirect("educatorLogin.jsp");
			}
			else{
				JLabel label = new JLabel("Email already in use!", JLabel.CENTER);
				JOptionPane pane = new JOptionPane(label);
				JDialog dialog = pane.createDialog("Error");
				dialog.setAlwaysOnTop(true);
				dialog.setVisible(true);
				response.sendRedirect("educatorRegistration.jsp");
			}
		}
		
	}

	if(!educator.checkEmail()){
			if(true){
				//educator.insert();
				dbc.addEducator(educator);
				response.sendRedirect("educatorLogin.jsp");
			}
			else{
				JLabel label = new JLabel("Email already in use!", JLabel.CENTER);
				JOptionPane pane = new JOptionPane(label);
				JDialog dialog = pane.createDialog("Error");
				dialog.setAlwaysOnTop(true);
				dialog.setVisible(true);
				response.sendRedirect("educatorRegistration.jsp");
			}
			*/
		

	
