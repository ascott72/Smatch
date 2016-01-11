<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script type="text/javascript" src="StudentMatchJavascript.js"></script>
		<link rel="stylesheet" href="style.css">
	
	<title>Student Login</title>
	</head>
	<body>
		<%
		String uName ="";
		String pw = "";
		Cookie[] cookies = request.getCookies();
		int length;
		if(cookies==null){
			length = 0;
		}
		else{
			length = cookies.length;
		}
		boolean cookieFound = false;
		for(int i = 0; i<length;i++){
			if(cookies[i].getName().equals("Login")){
				System.out.println((cookies[i].getValue()));
				cookieFound = true;
				int index = (cookies[i].getValue()).indexOf(":");
				System.out.println("Index"+index);
				uName = (cookies[i].getValue()).substring(0, index);
				pw = (cookies[i].getValue()).substring(index+1);
			}
		}
		
		%>
		<div id="banner"><!-- Banner -->
			<img class="logo" src="images/smatchnobkg.png" height="150px">
		</div> 
		<nav>
		<ul>
			<li><a href="home.jsp">Home</a></li>
			<li> <span class="caret"></span></a><div></div></li>
			<li></li>
			<li></li>
		</ul>
	</nav>
	
	<div id="contentArea">
		<br>
		<div id="titleMargin"><h1>Student Login</h1></div>
			<div class="formWrapper">
	
				<form method="post">
					<div class="formRow">
						<div class="formLeft">Username:</div>
						<div class="formRight">
							<input type="text" name="username">
						</div>
					</div>
					<div class="formRow">
						<div class="formLeft">Password:</div>
						<div class="formRight">
							<input type="password" name="password">
						</div>
					</div><br>
					<!--REMEMBER ME NOT SET  -->
					<div><label for="rememberCookies">
	                 	<input name="rememberCookies" id="rememberCookies" checked="checked" type="checkbox">&nbsp;
	                 	<b>Remember me on this computer.</b></label>
	                 	&nbsp;<a href="#" onclick="window.open('RememberMeInfo.jsp','Remember','toolbar=no,status=no,scrollbars=yes,resizable=yes,width=450,height=300'); return false;">What's this?<span class="access"> (Opens in a new window)</span></a></div>
					<br>
					<div class="formRow">
						<div class="formLeft">
							<button type="button" onclick="goToPage('studentVerificationCode.jsp')">New Student</button>
						</div>
						<div class="formRight">
							<button type="button" onclick="goToPage('studentHome.jsp')">Submit</button> <!-- CHANGE THIS -->
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
		<script>
		function CheckFields(){
			x = false;
			usr = document.login.username.value;
			passw = document.login.passw.value;
			
			if(usr == null || usr.trim() == ""){
				alert("Username field is required!");
			}
			else if(passw == null || passw.trim() == ""){
				alert("Password field is required!");
			}
			else{
				document.login.submit();
				x=true;
			}
			return x;
		}
		
		</script>
	</body>
</html>