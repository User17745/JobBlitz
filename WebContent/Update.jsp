<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Candidate Profile Update</title>

	<link rel = "stylesheet" type = "text/css" href = "CSS\RegStyle.css" />
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
	
		<div id = "Mid">
			
			<div id = "Form">
				
				<img src = "CSS\Update.jpg">
					
					
			</div>
	
			<div id = "Img">
				
				<h4>Verify old Username and Password:</h4>
				<form action="update2" method="post">		
					<input type="text" name="olduname" value="Username">
					Password:<input type="password" name="oldpassword">
					
					<br>
					<br>
					
					<h4>Enter new details:</h4>
					
					<h5>Personal Details:</h5>
					
					<input type="text" name="name" value="Name">					<input type="text" name="dob" value="Date of birth">
					<br><br><br>
					<input type="text" name="nationality" value="Nationality">		<input type="text" name="location" value="Location">
					<br><br><br>
					<input type="text" name="phno" value="Phone number">			<input type="radio" name="gender" value="male"> Male		<input type="radio" name="gender" value="female"> Female
					<br><br><br>	
					
					<h5>Professional Details:</h5>
					
					Job Type:														
					<select name="jobtype">
						<option> JobType
							<option> Accountancy
							<option> Animation
							<option> Banking
							<option> Business Administration
							<option> Chartered Accountancy
							<option> Data Entry
							<option> Ethical Hacking
							<option> Event Management
							<option> Finance Management
							<option> Gemmology
							<option> Hotel Management
							<option> IT
							<option> Indian Army
							<option> Journalism
							<option> Law
							<option> Merchant Navy
							<option> Nanotechnology
							<option> Online Tutoring
							<option> Others
							<option> Photo Journalism
							<option> Robotics
							<option> Structural Engineering
							<option> Technical Writing
							<option> Visual Merchandising
							<option> Web Designing
							<option> Web Development
							<option> Yoga
							<option> zoology
					</select>												<input type="text" name="salary" value="Expected Salary">
					<br>
					<input type="text" name="experience" value="Work experience (in years)" size="30">
					<br><br><br>

					<h5>Login Details:</h5>
					
					<input type="text" name="uname" value="Username">
					Password
					<input type="password" name="password">
					<br><br>
					<input type="submit" value="Update">
					<br><br>
				</form>
				
			</div>
	
				
		</div>
		
		<div id = "Footer">
			Copyrights &copy; 2015 NIEC Project.
		</div>
	</div>
</body>
</html>