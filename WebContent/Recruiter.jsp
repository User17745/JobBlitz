<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Recruiter</title>

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
					<li> <a href = "AboutUs.jsp">About Us</a> </li>
					<li> <a href = "Contact.jsp">Contact Us</a> </li>
				</ul>
			</div>
		</div>	
		
		<div id = "Mid">
			
			
			
			<h3>Welcome Recruiter</h3>
			<br>
			<br>											
			<div id = "Form">
				<h4>Already a member?</h4>
								
				<form action="rlogin" method="post">										<!-- Login form -->
					UserName:<input type="text" name="uname" required>
					Password:<input type="password" name="password" required>
					<br><br>
					<input type="submit" value="Login Here">
				</form>
				<br>
				
				<hr>
				
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				<br>
				
				<img src = "CompanyReg.png">
			</div>
			
			<div id = "Img">
				<h4>Getting started..</h4>
				<br>
				<h5>Company Details</h5>
				<form action="rregister" method="post">							<!-- Registration form for recruiter-->
					Company Name:<input type="text" name="name" required>	<br>		Contact Number:<input type="text" name="number" required>
					<br><br>
					Office Adderess:<input type="text" name="adderess" required>	<br>	<input type="text" name="timings" value="Interview Timings">
					<br><br>
					
					Please Select JobType:														
						<select name="jobtype" required>
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
						<br>
						And Location:
						<select name="location" required>
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
						
						<br><br><br>
						
					Minimum Experience:<input type="text" name="experience" required>   
					<input type="text" name="salary" value="Salary" required>		
					<br><br>
					<textarea name="description" rows="5" cols="40" >Description about company</textarea>
					<br><br><br>

					<h5>Login Details</h5>
									
					Username:<input type="text" name="uname" required>
					Password:
					<input type="password" name="password" required>
					<br><br>
					<input type="submit" value="Register Here">
				</form>
			</div> 
		</div>
	
		<div id = "Footer">
			Copyrights &copy; 2015 NIEC Project.	
		</div>
	</div>	
</body>
</html>