<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<script type="text/javascript" src="StudentMatchJavascript.js"></script>
		<link rel="stylesheet" href="style.css">
		
		<title>Home</title>
	</head>
	<body>
	
		
		<div id="banner"><!-- Banner -->
			<img class="logo" src="images/smatchnobkg.png" height="150px">
		</div> 
		<nav>
			<ul>
				<li></li>
				<li> <span class="caret"></span></li>
				<li></li>
				<li></li>
			</ul>
		</nav>
		
		
		<div id="contentArea">
			<br><br>
			<h1 align="center"><i>Matching Groups efficiently!</i></h1>
			<br><br> 
			<table align="center">
				<tr>
			 		<td><a href="studentLogin.jsp">
			 			<img src="images/studentButton.png"  alt="Student Button" height="200" width="200" onmouseover="this.src='images/studentButton_Clicked.png';" onmouseout="this.src='images/studentButton.png';"/></a>
					</td>
					
					<td><img src="images/blank.png"  alt="z" height="200" width="200"/></td> 	
					
					<td><a href="educatorLogin.jsp">
			 			<img src="images/educatorButton.png"  alt="Educator Button" height="200" width="200" onmouseover="this.src='images/educatorButton_Clicked.png';" onmouseout="this.src='images/educatorButton.png';"/></a>
			 		</td>
			 	</tr>
			 </table>
			 <br><br><br>

			<div id="footer">
				<small> &copy; 2014 Smatch, Inc. All Rights Reserved				
			            <table align="center">
							<tr>
								<td><a href="terms.jsp">Terms</a></td>
								<td><a href="siteMap.jsp">Sitemap</a></td>
								<td><a href="aboutUs.jsp">About Us</a></td>
								<td><a href="help.jsp">Help</a></td>
							</tr>
						</table>
				</small>
				<br>
			</div> <!-- Footer closing tag -->
		 <!-- Container closing tag -->
	</body>
</html>