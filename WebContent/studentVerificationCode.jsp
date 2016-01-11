<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="StudentMatchJavascript.js"></script>
		<link rel="stylesheet" href="style.css">
<title>Student Code Verification</title>
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
	<br>
		<div class="formWrapper">

			<form method="post" name="StudentCode">
				<div class="formRow">
					<div class="formLeft">Verification Code:</div>
					<div class="formRight">
						<input type="text" name="username">
					</div>
				</div>

				<div class="formRow">
					<div class="formLeft">
						<button type="button" onclick="goToPage('studentRegistration.jsp')">Submit</button>
					</div>
					<div class="formRight">
						<button type="button" onclick="goToPage('home.jsp')">Cancel</button> <!-- CHANGE THIS -->
					</div>
				</div>
			</form>
		</div>
		<br><br><br>
	</div>

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
	</div>

</body>
</html>