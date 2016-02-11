<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Recruiter Profile</title>

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
			Send notification to candidates
			<form action = "Notification.jsp" method = "post">
				<input type = "submit" value = "Send">
			</form> 
			<br>
			View sent Notification
			<form action = "rapplied" method = "post">
				<input type = "submit" value = "View">
			</form>
			<br> 
			Send E-Mail to Candidate
			<form action = "index.jsp" method = "post">
				<input type = "submit" value = "Mail">
			</form> 
		</div>
	
		<div id = "Options">
			<ul>
			<li>
			<form action="rrefresh" method="post">											<!-- Refresh page -->
				<input type="submit" value="Refresh">
			</form>
			</li>
			<hr>
			<li>
			<form action = "rlogout" method = "post">
				<input type = "submit" value = "Log-Out">
			</form>
			</li>
			</ul>						
		</div>
		
		<div id = "Mid">
								
			<h3>Welcome <s:property value="name"/></h3>														<!-- Profile -->
			
			<br>
					
			<div id = "Profile" class = "Bor">
				
				<h4><center>Profile</center></h4>
				<table border="1" width="70%">
				Personal Details:
				<tr>
				<td>
				Company Name</td><td><s:property value="name"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>
				Contacts</td><td><s:property value="number"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>
				Office Address</td><td><s:property value="adderess"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>	
				Interview Timings</td><td><s:property value="timings"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>
				Job Type</td><td><s:property value="jobtype"/>
				</td>
				</tr>
				<br>
				<tr>
				<td>
				Location</td><td><s:property value="location"/>
				</td>
				</tr>
				<br><br>	
				</table>
				<br><br>
				<table border="1" width="70%">
				Candidate requirements:
				<br>
				<tr>
				<td>
				Minimum Experience Required</td><td><s:property value="experience"/>
				</td>
				</tr>
				
				<tr>
				<td>
				Salary offered (per month)</td><td><s:property value="salary"/>
				</td>
				</tr>
				</table>
				<br><br>
				<table border="1" width="70%">
				Login Details:
				<br>
				<tr>
				<td>
				Username</td><td><s:property value="uname"/>
				</td>
				</tr>
				</table>
							
			</div>
			
			<br><br><br>
			
			<div id = "Actions">
				<form action="rsearch" method="post">									<!-- Searching for candidates -->
					<h4>Search for candidates:</h4>
					<br>
					<input type="submit" value="Search">														
				</form>

				<br>

				<form action="rdelete1" method="post">									<!-- Delete Account -->
					<input type="submit" value="Delete Account">
				</form>

				 <form action="rupdate1" method="post">									<!-- Update Account -->
					<input type="submit" value="Update Account">
				</form>			
			</div>
		</div>
		
		<div id = "Footer">
			Copyrights &copy; 2015 NIEC Project.
		</div>
	</div>
</body>
</html>
