<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Administrator LogIn</title>

<link rel = "stylesheet" type = "text/css" href = "CSS\AdStyle.css" /> 

</head>

<body>

	<div id = "Content"> 
		
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
		
		
		
		<div id = "Mid" class = "Single">
			<center> <a href="Homepage1.jsp">HOME</a> </center>
			
			<h3>Verify Login details:</h3>
			
			<br>
	
			<form action="adminlogin" method="post">									<!-- Login form -->
				<input type="text" name="uname" value="Username">
				Password:<input type="password" name="password">
				<br><br>
				<input type="submit" value="Login Here">
			</form> 
		</div>
	
	
		<div id = "Footer">
			Copyright &copy; 2015 NIEC project.
		</div>	
	</div>
	
	
</body>

</html>