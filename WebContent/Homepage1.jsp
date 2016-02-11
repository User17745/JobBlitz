<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
 <head>
  <title>Index Page</title>
  <link href = "CSS\InStyle.css" rel = "stylesheet" type = "text/css" />
 </head>
  
 <body>
  <div id = "Content">
	<div id = "Top">
		<div id ="Logo">
			<h1><a href = "Homepage1.jsp">JobBlitZ!!</a></h1>
		</div>
		
		<div id = "Blank">
			
			<h6>Search <font color=#AAA>Ends</font> <font color=#FFF>Here</font></h6>
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
	
	<div id = "Mid">
		
		<center>
			<form action="select" method="post">
				<input type="text" name="select" value="Search">
				<input type="submit" value="Search">
			</form>
		</center>
		
		
		<div id = "Img">
			<img src = "UI\img14.jpg">
		</div>
		
		<div id = "Pts">
			<h3>Why Join US!?</h3>
			<ul>
				<li>Biggest On-line Job Portal yet!!</li>
				<li>Ever Growing Network</li>
				<li>Find some of the Best Job opportunities out there.</li>
				<li>Grow your Network</li>
				<li>Extremely Helpful Community</li>
			</ul>
		</div>
		
	</div>
	
	<div id = "Footer">
		Copyright &copy; 2015 NIEC Project.			
	</div>
  </div>	
 </body>
</html>  