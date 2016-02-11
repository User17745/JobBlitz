<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Mail Client</title>

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
		 <h2>E-mail</h2>
		
			<form action="emailer"  method="post">
				<label for="from">From</label><br/>
   					<input type="text" name="from" /><br/>
   				<label for="password">Password</label><br/>
   					<input type="password" name="password"/><br/>
   				<label for="to">To</label><br/>
   					<input type="text" name="to"/><br/>
   				<label for="subject">Subject</label><br/>
   					<input type="text" name="subject"/><br/>
   				<tr> 
   				<label for="body">Body</label><br/>
   				<td><textarea rows="10" cols="39" name="body"></textarea></td></tr>
   
  				<input type="submit" value="Send Email"/>
  			</form> 
			
		</div>
		
		<div id = "Footer">
			Copyright &copy; 2015 NIEC Project.
		</div>

	</div>

</body>
</html>