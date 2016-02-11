<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Feedback</title>

	<link rel = "stylesheet" type = "text/css" href = "CSS\GenStyle.css" />
	<link href = "popup.css" rel = "stylesheet" type = "text/css" />
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
			<center>
			<h5>Enter your feedback:</h5>
				<form action="feedback" method="post">
					<textarea name="feedback" rows="15" cols="30" >We are happy to listen</textarea>
					<br><br>
					<input type="submit" value="Enter">
				</form>
			</center>
		</div>
		
		<div id = "Footer">
			Copyright &copy; 2015 NIEC Project.
		</div>

	</div>

</body>

</html>