<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Recruiter Update</title>

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
			
				<form action="rupdate2" method="post">													<!-- Registration form for recruiter-->
					
					<h4>Verify Current Username and Password:</h4>
					<input type="text" name="olduname" value="Username">
					Password:<input type="password" name="oldpassword">
					<br><br>
					
					<h4>Enter new details:</h4>
					
					<h5>Company Details</h5>
					<input type="text" name="name" value="Company Name">			<input type="text" name="number" value="Contact Number">
					<br><br><br>
					<input type="text" name="adderess" value="Office Adderess">		<input type="text" name="timings" value="Interview Timings">
					<br><br><br>
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
					</select>														
					<br>
					
					Location:<select name = "location">
						<option> State
						<option> Andaman and Nicobar Islands
						<option> Andhra Pradesh
						<option> Arunachal Pradesh
						<option> Assam
						<option> Bihar
						<option> Chandigarh
						<option> Chattisgarh
						<option> Dadra and Nagar Haveli
						<option> Daman and Diu
						<option> Delhi
						<option> Goa
						<option> Gujarat
						<option> Haryana
						<option> Himachal Pradesh
						<option> Jammu and Kashmir
						<option> Jharkhand
						<option> Karnataka
						<option> Kerala
						<option> Lakshwadeep
						<option> Madhya Pradesh	
						<option> Maharashtra
						<option> Manipur
						<option> Meghalya
						<option> Mizoram
						<option> Nagaland
						<option> Odisha
						<option> Poducherry
						<option> Punjab
						<option> Rajasthan				
						<option> Sikkim
						<option> Tamil Nadu
						<option> Telangna
						<option> Tripura
						<option> Uttar Pradesh
						<option> Uttarakhand
						<option> West Bengal
					</select>
															
					<!-- <input type="text" name="location" value="Office Location"> -->
					
					<h5>Requirements</h5>

					<input type="text" name="experience" value="Minimum experience required">   
					<input type="text" name="salary" value="Salary">		
					<br><br>
					<textarea name="description" rows="5" cols="40" >Description about company</textarea>
					
					
					<h5>Login Details</h5>
					
					<input type="text" name="uname" value="Username">
					Password
					<input type="password" name="password">
					<br><br>	
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