<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="styleTwo.css">
<script type="text/javascript" src="StudentMatchJavascript.js"></script>
<title>Educator Home</title>

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
			<li><a href="#">Class Tools <span class="caret"></span></a>
				<div>
					<ul>
						<li><a href="#">Class <span	class="caret"></span></a>
							<div>
								<ul>
									<li><a href="createClass.jsp">Create a Class</a></li>
									<li><a href="classView.jsp">View a Class<span class="caret"></span></a><div>
										<ul>
											<li><a href="classView.jsp">ITCS4155<span class="caret"></span></a>
												<div>
													<ul>
														<li><a href="classView.jsp">Section 001</a></li>
														<li><a href="classView.jsp">Section 002</a></li>
													</ul>
												</div>
											</li>
									</li>
									<li><a href="classView.jsp">ITCS3155</a>
									<div>
										<ul>
											<li><a href="classView.jsp">Section 001</a></li>
											<li><a href="classView.jsp">Section 002</a></li>
										</ul>
									</div>
									</li>
									</li>
								</ul>
							</div></li></li>
								</ul>
							</div></li>
						<li><a href="#">Groups<span class="caret"></span></a>
							<div>
								<ul>
									<li><a href="createGroup.jsp">Create a Group</a></li>
									<li><a href="groupView.jsp">View a Group<span class="caret"></span></a><div>
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
			<li><a href="educatorMessages.jsp">Messages</a></li>
			<li><a href="help.jsp">Help</a></li>
			<li class="logout"> <a href="home.jsp">Logout</a></li> <!-- Logout  -->
			
		</ul>
	</nav>

 <div id="contentArea">

<div style= "position:relative; right:-35%; ">
	<div class="formWrapperStudentHomeRight">
		<div class="cover">
  			<div class="left_gate"></div>
  				<div class="right_gate"></div>
				<!-- <div style="background-image: url(Vertical-Lines-Grey-Background.jpg); height: 363px; width: 300px;"> -->
				
					<h3>Reminders</h3>
					<div>
					
						<!-- <div id="div1" ondrop="drop(event)" ondragover="allowDrop(event)"></div>
						<br> <img id="drag1" src="Smatchnoshdw.jpg" draggable="true" ondragstart="drag(event)" height="69"> -->
 
						<br>
						<form action=""><!-- THIS NEEDS TO BE CHANGE TO BE AUTOMATED -->
							<input type="checkbox" name="vehicle" value="Bike">Send study guide<br>
							<input type="checkbox" name="vehicle" value="Car">Remind class about quiz<br> 
						</form>
					</div>
					
					<form method="post" action="#">
						<div class="formRow">
							<div class="formRight">
							<br>

							<a href="#" align="right">Add Another</a>
								<!--  <button type="button"
								onclick="javaScript:alert( 'Are you sure you want to cancel?' );">Cancel</button>
								<input type="submit" value="Submit"> -->
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>

		<div style= "float:right;">
			<div class="formWrapperStudentHomeRight">

				<div class="cover">
  					<div class="left_gate"></div>
  						<div class="right_gate"></div>
							<h3>Updates</h3>
								<!--  <div>
								<div id="div1" ondrop="drop(event)" ondragover="allowDrop(event)"></div>
								<br> <img id="drag1" src="brown-abstract-squares.jpg" draggable="true">
								ondragstart="drag(event)" height="69">
								</div>
								-->
								
								<a href="#" align="Left">Upload a document</a><br>

									<form method="post" action="#">
										<div class="formRow">
											<div class="formRight">

												<!--  <button type="button"
												onclick="javaScript:alert( 'Are you sure you want to cancel?' );">Cancel</button>
												<input type="submit" value="Submit"> -->
											</div>
										</div>
									</form>
				</div>
			</div>
			<div></div>
		</div>


		<div class="formWrapperStudentHomeRight">
			<div style= "position:absolute;left:5%;top:53%;" >
				<div id="thetable">
					<table class=" table1">
			    	    <thead>
			            	<tr>
			        	        <th scope="col">Class</th>
			                	<th scope="col">No. of Sections</th>
			                	<th scope="col">Semester</th>
			            	</tr>
			         	</thead>
			         	<tbody>
							<tr>
					        	<th id="r100" scope="row"><a href="classView.jsp">ITCS4155</a></th>
					        		<td>
										<menu>
											<ul>
												<li><a href="#">1<span class="caret"></span></a>
													<div>
														<ul>
															<li><a href="#">Sections<span class="caret"></span></a>
																<div>
																	<ul>
																		<li><a>092</a></li>
																	</ul>
																</div>
															</li>
															<li><a href="#">Groups<span class="caret"></span></a>
																<div>
																	<ul>
																		<li><a>3<span class="caret"></span></a>																			<div>
																			<ul>
																				<li><a>1 A</a></li>
																				<li><a>1 B</a></li>
																				<li><a>1 C</a></li>
																			</ul>
																		</li>
																	</ul>
																</div>
														</li>
														<li><a href="#">Students<span class="caret"></span></a>
															<div>
																<ul>
																	<li><a>15<span class="caret"></span></a>
																		<div>
																			<ul>
																				<li><a>Ann Bryant</a></li>
																				<li><a>Mark Knight</a></li>
																				<li><a>Cole Nelson</a></li>
																				<li><a>Susan Peterson</a></li>
																				<li><a>Sam Thompson </a></li>
																			</ul>
																		</div>
																	</li>	
																</ul>	
															</div>
														</li>
													</ul>				
												</div>
											</li>
										</ul>		
									</menu> 
					        <td>Spring 2014 </td>
					    </tr>
					    <tr>
					        <td id="r100" scope="row"><a href="classView.jsp">ITCS3155</a>
					    
									<menu>
										<ul>
											<li><a href="#">2<span class="caret"></span></a>
												<div>
													<ul>
														<li><a href="#">Sections<span class="caret"></span></a>
															<div>
																<ul>
																	<li><a>001</a></li>
																	<li><a>002</a></li>
																</ul>
															</div>
														</li>
														<li><a href="#">Groups<span class="caret"></span></a>
															<div>
																<ul>
																	<li><a>5<span class="caret"></span></a>																			<div>
																			<ul>
																				<li><a>1 A</a></li>
																				<li><a>1 B</a></li>
																				<li><a>1 C</a></li>
																				<li><a>1 D</a></li>
																				<li><a>1 E</a></li>
																			</ul>
																		</div>
																	</li>
															</div>
														</li>
														<li><a href="#">Students<span class="caret"></span></a>
															<div>
																<ul>
																	<li><a>24<span class="caret"></span></a>
																		<div>
																			<ul>
																				<li><a>Anthony Thomas</a></li>
																				<li><a>Laura Vann</a></li>
																				<li><a>Linda Zimmerman</a></li>
																			</ul>
																		</div>
																	</li>	
																</ul>	
															</div>
														</li>
													</ul>				
												</div>
											</li>
										</ul>		
									</menu> 
									<!-- 
					        							<li>
					        								<table class=" table1">
						        							<thead>
													            <tr>
													            	<th scope="col">Section</th>
													                <th scope="col">No. of Groups</th>
													                <th scope="col">No. of Students</th>
													            </tr>
													         </thead>
													         <tbody>
													         	<tr>
													         		<td>1</td>
															        <td>5</td>
															        <td>24 </td>
														        </tr>
								    						</tbody>
								    						</table>
					        							</li>
					        							<li>
					        								<table class=" table1">
					        								<thead>
													            <tr>
													            	<th scope="col">Section</th>
													                <th scope="col">No. of Groups</th>
													                <th scope="col">No. of Students</th>
													            </tr>
													         </thead>
													         <tbody>
													         	<tr>
													         		<td>1</td>
															        <td>5</td>
															        <td>24 </td>
														        </tr>
								    						</tbody>
								    						</table>
					        							</li>
					        						</ul>
					        					</div>
					        				
					        				</li>
					        			</div>
					        		
					        		</li>
					        	</ul>  -->
						    </td>   		
 							<td> Spring 2014 </td>
					        
					    </tr>
					  </tbody>
					  <tfoot><tr><th scope="row"></th></tr></tfoot>
			     </table>
			</div>
		<!-- <div style="background: #F7F5F5; height: 600px; width: 700px;border-style: outset;border-color: black;"> -->
		<!--  <div style="background-image: url(Vertical-Lines-Grey-Background.jpg); height: 363px; width: 300px;"> -->
		<br>
		<!-- <h3><u>Classes</u></h3>-->
		<!--  <div>
		<div id="div1" ondrop="drop(event)" ondragover="allowDrop(event)"></div>
		<br> <img id="drag1" src="Smatchnoshdw.jpg" draggable="true"
		ondragstart="drag(event)" height="69">
		</div> -->
		
		<form method="post" action="#">
		<div class="formRow">
		<div class="formRight">
		<!-- <button type="button"
		onclick="javaScript:alert( 'Are you sure you want to cancel?' );">Cancel</button>
		<input type="submit" value="Submit"> -->
		</div>
		</form>
		</div>  
		<div id="justWidth"></div>
		
		<div id="justWidth"></div>
		
		<div id="justWidth"></div>
		
		 
		<div id="justWidth"></div>
		<div id="justWidth"></div>
		<div id="justWidth"></div>
		<div >
		<div class="formWrapperStudentHomeBottom">
		<p>Drag the file you to be uploaded:</p>
		<div>
		<div id="div1" ondrop="drop(event)" ondragover="allowDrop(event)"></div>
		<br> <img id="drag1" src="Smatchnoshdw.jpg" draggable="true"
		ondragstart="drag(event)" height="69">
		</div>
		<form method="post" action="#">
		<div class="formRow">
		<div class="formRight">
		<button type="button"
		onclick="javaScript:alert( 'Are you sure you want to cancel?' );">Cancel</button>
		<input type="submit" value="Submit">
		</div>
		</div>
		</form>
		</div>
		</div>
		 -->
		</div>
	</div>	
		<div id="justWidth"></div>

	<br>
	<br><br><br><br><br><br><br><br><br><br>
	</div>
		<div id="footer" align="center">
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