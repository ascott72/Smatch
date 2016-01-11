<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="styleTwo.css">
<script type="text/javascript" src="StudentMatchJavascript.js"></script>
<title>Student Home</title>

<style>
#div1 {width:350px;height:70px;padding:10px;border:1px solid #aaaaaa;}
</style>
<script>
function allowDrop(ev)
{
ev.preventDefault();
}

function drag(ev)
{
ev.dataTransfer.setData("Text",ev.target.id);
}

function drop(ev)
{
ev.preventDefault();
var data=ev.dataTransfer.getData("Text");
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
			<li><a href="studentHome.jsp">Student Home</a></li>
			<li><a href="#">My Classes <span class="caret"></span></a>
				<div>
					<ul>
						<li><a href="#">Class <span
								class="caret"></span></a>
							<div>
								<ul>
									<li><a href="studentHome.jsp">View My Groups</a><div>
								<ul>
									<li><a href="studentHome.jsp">ITCS4155-001</a><div>
								<ul>
									<li><a href="studentHome.jsp">1M</a></li>
									
								</ul>
							</div></li></li>
									<li><a href="studentHome.jsp">ITCS3155-002</a><div>
								<ul>
									<li><a href="studentHome.jsp">Group 5</a></li>
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
									<li><a href="studentVerificationCode.jsp">Join a New Group</a></li>
								</ul>
							</div></li>
					</ul>
				</div></li>
			<li><a href="studentMessages.jsp">Messages</a></li>
			<li><a href="help.jsp">Help</a></li>
		</ul>
	</nav>


		<div id="contentArea">
			<br>
			<h1 align="center">Student Messages</h1>
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