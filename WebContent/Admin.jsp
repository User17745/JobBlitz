<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Administrator Page</title>
	
	
	<link rel = "stylesheet" type = "text/css" href = "CSS\AdStyle.css" /> 
</head>

<body>

	<div id = "Content" class = "BackImg">
		
		<div id = "header">
			<div id ="Logo">
				<h1>JobBlitZ!!</h1>
			</div>
		
			<div id = "Blank">
				<!--<p align = "right"><img src = "header.png"></p>-->
			</div>
		
			<div id = "NavBar">
				<!-- <ul>
					<li> <a href = "Candidate.jsp">JOIN!</a> </li>
					<li> <a href = "Candidate.jsp">LogIN</a> </li>
					<li> <a href = "Recruiter.jsp">Recruiter's Section</a> </li>
					<li> <a href = "">Random</a> </li>
				</ul> -->
			</div>
		</div>	
		
		<div id = "Mid">
		<center> <a class = "Button" href="Homepage1.jsp">Log-Out</a> </center>
			
			<div id = "DBSelect">
				<h3>Database Selection</h3>
				<form action="database" method="post">
					<center>
						<input type="radio" name="database" value="cdatabase">Candidate database
						<br><br>
						<input type="radio" name="database" value="rdatabase">Recruiter database
						<br><br><br>
						<input type="submit" value="Submit">
					</center>
				</form>
			</div>
	
			<div id = "DBDelete">
				<h3>Database Deletion</h3>
				<center>
					Delete candidate account	

					<form action="cdelete" method="post">
						<input type="text" name="uname" value="Username">
						<input type="submit" value="Delete">
					</form>

					Delete Recruiter account
	
					<form action="rdelete" method="post">
						<input type="text" name="deluname" value="Username">
						<input type="submit" value="Delete">
					</form>
				</center>
			</div>
		</div>
		
		<div id = "Bottom">
			<h2><a href = "Aupdate.jsp">Configure Log-In Details</a></h2>
		</div>	
		<div id = "Footer">
			Copyright &copy; 2015 NIEC project.
		</div>	
	</div>
</body>
</html>