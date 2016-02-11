<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Candidate Profile Page</title>

	<link rel = "stylesheet" type = "text/css" href = "CSS\ProStyle.css" />

</head>

<body>
	<div id = "Content">
		<div id = "header">
			<div id ="Logo">
				<h1><a href = "Homepage1.jsp">JobBlitZ!!</a></h1>
			</div>
		
		
			<div id = "Blank">
			
			<h6>Search Ends Here</h6>
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
		
				
		<div id = "Highlight">
			Job Notifications: <s:property value="notification"/> 
			<form action="view" method="post">
				<input type="submit" value="View">
			</form>
			
			Got notification from the company?
			<form action="capply" method="post">
				<input type="text" name="companyname" value="CompanyName">
				<input type="submit" value="Apply">
			</form>
			<br>
			<form action="delnotification" method="post">									<!-- Detele all notifications -->
				<input type="submit" value="Delete Notifications">
			</form>			
			
		</div>
	
		<div id = "Options">
			<ul>
			<li><form action="refresh" method="post">											<!-- Refresh page -->
				<input type="submit" value="Refresh">
			</form>
			</li>
			<hr>
			<li>
			<form action = "logout" method = "post">
				<input type = "submit" value = "Log-Out">
			</form>
			</li>
			<hr>
			<li>
			<form action = "Feedback.jsp" method = "post">
				<input type = "submit" value = "Feedback">
			</form>
			</li>
			</ul>
		</div>
	
		<div id = "Mid">
	
	
			<h3>  Welcome <s:property value="name"/></h3>														<!-- Profile -->

			<br>
			
			<div id = "Profile" class = "Bor">
				<h4><center>Profile</center></h4>
				<table border="1" width="70%">
				Personal Details
				<tr>
				<td>
				Name</td><td><s:property value="name"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>
				Date of Birth</td><td><s:property value="dob"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>
				Nationality</td><td><s:property value="nationality"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>	
				Location</td><td><s:property value="location"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>
				Phone Number</td><td><s:property value="phno"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>
				Gender</td><td><s:property value="gender"/>
				</td>
				</tr>
				
				</table>
				<br><br>
				Profesional Details
		
				<table border="1" width="70%">
				<tr>
				<td>
				Job type</td><td><s:property value="jobtype"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>
				Job Experience(in years)</td><td><s:property value="experience"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>
				Expected Salary (per month)</td><td><s:property value="salary"/>
				</td>
				</tr>
				</table>
				<br><br>
				Login Details
		
				<table border="1" width="70%">
				<tr>
				<td>
				Username</td><td><s:property value="uname"/>
				</td>
				</tr>
				</table>

		</div>
		
		<br><br><br>

		<div id = "Actions">
			<form action="search" method="post">
				<h4>Search for jobs</h4>
				<br>
				Minimum Expected Salary (per month):<input type="text" name="searchsalary">
				<input type="submit" value="Search">															
			</form>

			<br><br>

			<form action="delete1" method="post">									<!-- Delete Account -->
				<input type="submit" value="Delete Account">
			</form>

			<form action="update1" method="post">									<!-- Update Account -->
				<input type="submit" value="Update Account">
			</form> 
	
			<br><br>
				
		</div>
	
		</div>
	<div id = "Footer">
		Copyrights &copy; 2015 NIEC Project.
	</div>
	
	</div>
</body>

</html>
