<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Delete Request</title>

	<link rel = "stylesheet" type = "text/css" href = "CSS\GenStyle.css" />
</head>

<body>
	<div id = "Content">
		<div id = "Top">
			<div id ="Logo">
				<h1><a href = "Homepage1.jsp">JobBlitZ!!</a></h1>
			</div>
		
			<div id = "Blank">
				<!--<p align = "right"><img src = "header.png"></p>-->
			</div>
		
			<div id = "NavBar">
				<ul>
					<li> <a href = "Candidate.jsp">Candidate's Section</a> </li>
					<li> <a href = "Recruiter.jsp">Recruiter's Section</a> </li>
					<li> <a href = "AboutUs.jsp">About Us</a> </li>
					<li> <a href = "Contact.jsp">Contact Us</a> </li>
				</ul>
			</div>
		</div>	
		
		
		<div id = "Mid" class = "Single">
			
			
				<h5>Verify Username and Password:</h5>
				
				<form action="delete2" method="post">													<!-- Login form -->
					<input type="text" name="deluname" value="Username">
					<br>
					Password:<input type="password" name="delpassword">
					<br><br>
					<input type="submit" value="Delete my account">
				</form>
				 
			
			
			
		</div>
		
		<div id = "Footer">
			Copyright &copy; 2015 NIEC Project.
		</div>

	</div>

</body>

</html>