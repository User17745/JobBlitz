<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Candidate</title>

	<link rel = "stylesheet" type = "text/css" href = "CSS\RegStyle.css" /> 
</head>

<body>
	
	<div id = "Content">
		<div id = "Header">
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
					<li> <a href = "About.jsp">About Us</a> </li>
					<li> <a href = "Contact.jsp">Contact Us</a> </li>
				</ul>
			</div>
		</div>	
		
		
		<div id = "Mid">

			<h3>Welcome Candidate</h3>
			<br><br>

			<div id = "Form">
				<h4>Already a member?</h4>
					
				<form action="login" method="post">													<!-- Login form -->
					UserName:<input type="text" name="uname" required>
					Password:<input type="password" name="password" required>
					<br><br>
					<input type="submit" value="Login Here">	
				</form>

				<br>
			
				<center><hr></center>

				<h4>Getting started with Opportunity...</h4>
					
					<form action = "FileIndex.jsp" method = "post">
							<input type = "submit" value = "Upload Resume">
						</form>
						<br>
						<br>
						<br>
				<form action="register" method="post">							<!-- Registration form -->

					<h5>Personal Details</h5>
					<br><br>
					Name:<input type="text" name="name" required>					<input type="text" name="dob" value="Date of birth">
					<br><br><br>
					Nationality:<input type="text" name="nationality">		
					State:<select name = "location" required>
							<option> 
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
							<optison> Odisha
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

					<br><br><br>
					
					Phone number:<input type="text" name="phno" required>			<input type="radio" name="gender" value="male"> Male		<input type="radio" name="gender" value="female"> Female
				
					<br><br><br>

					<h5>Professional Details</h5>

					Job Type:																				
					<ul>
						<li><select name="jobtype" required>
								<option> 
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
						</li>
						<li> <input type="text" name="salary" value="Expected Salary (per month)"> </li>
						<li> <input type="text" name="experience" value="Work experience (in years)" size="30" required> </li>
					</ul>
						
						
						
					<br><br><br>

					<h5>Login Details</h5>
					
					<br><br>
					
					UserName:<input type="text" name="uname" required>
					Password:	
					<input type="password" name="password" required>
					<br><br>
					<input type="hidden" name="notification" value="0">							<!-- Hidden notification counter -->
					<input type="submit" value="Register Here">
			</form>

						
			<br><br><br><br>

					</div>
		<div id = "Img">
			
			<form action="advanced" method="post">										<!-- Advanced search -->
				<h3> Search For Jobs..</h3>
	
				<ul>
					<li>Job Type:<select name="jobtype" required>
							<option> 
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
					</li>
					
					<br>
					
					<li>Location:<select name = "location1">
							<option> 
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
					</li>
					
					<br>
					
					<li>Experience:<input type="text" name="experience" required></li>
					
					<br>
					
					<li><input type="text" name="salary" value="Expected Salary (per month)"></li>
					
					<br>
					
					<li><input type="submit" value="Search Jobs"></li>
				</ul>
				</form>
				
				<h3>View Feedbacks of our Userbase</h3>
				<form action = "getfeedback" method = "post">
					<input type = "submit" value = "Feedbacks">
				</form>
				<br>
				
			</div>
		
		</div>
		
		
		
		
		<div id = "Footer">
			Copyrights &copy; 2015 NIEC Project.	
		</div>
		
	</div>
</body>

</html>