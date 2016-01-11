<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="styleTwo.css">
<script type="text/javascript" src="StudentMatchJavascript.js"></script>
<title>Group View</title>

<style>
#div1 {
	width: 350px;
	height: 70px;
	padding: 10px;
	border: 1px solid #aaaaaa;
}
</style>
<script>
	function allowDrop(ev) {
		ev.preventDefault();
	}

	function drag(ev) {
		ev.dataTransfer.setData("Text", ev.target.id);
	}

	function drop(ev) {
		ev.preventDefault();
		var data = ev.dataTransfer.getData("Text");
		ev.target.appendChild(document.getElementById(data));
	}
</script>



</head>
<body>
		<div id="banner"><!-- Banner -->
			<img class="logo" src="images/smatchnobkg.png" height="150px">
		</div> 

<nav>
		<ul>
			<li><a href="home.jsp">Home</a></li>
			<li><a href="educatorHome.jsp">Educator Home</a></li>
			<li><a href="#">Class Tools <span class="caret"></span></a>
				<div>
					<ul>
						<li><a href="#">Class <span
								class="caret"></span></a>
							<div>
								<ul>
									<li><a href="createClass.jsp">Create a Class</a></li>
									<li><a href="classView.jsp">View a Class</a><div>
								<ul>
									<li><a href="classView.jsp">ITCS4155</a><div>
								<ul>
									<li><a href="classView.jsp">Section 001</a></li>
									<li><a href="classView.jsp">Section 002</a></li>
								</ul>
							</div></li></li>
									<li><a href="classView.jsp">ITCS3155</a><div>
								<ul>
									<li><a href="classView.jsp">Section 001</a></li>
									<li><a href="classView.jsp">Section 002</a></li>
								</ul>
							</div></li></li>
								</ul>
							</div></li></li>
								</ul>
							</div></li>
						<li><a href="#">Groups<span
								class="caret"></span></a>
							<div>
								<ul>
									<li><a href="createGroup.jsp">Create a Group</a></li>
									<li><a href="groupView.jsp">View a Group</a><div>
								<ul>
									<li><a href="groupView.jsp">1A</a></li>
									<li><a href="groupView.jsp">1B</a></li>
									<li><a href="groupView.jsp">1C</a></li>
									<li><a href="groupView.jsp">1M</a></li>
									<li><a href="groupView.jsp">2A</a></li>
									<li><a href="groupView.jsp">2B</a></li>
									<li><a href="groupView.jsp">2C</a></li>
								</ul>
							</div></li></li>
								</ul>
							</div></li>
					</ul>
				</div></li>
			<li><a href="aboutUs.jsp">Messages</a></li>
			<li><a href="help.jsp">Help</a></li>
		</ul>
	</nav>




		<div id="contentArea">
			<br>
			<h1 align="center">Group View</h1>
			<h1 align="center">Under Development</h1>
			<br>
			
			
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