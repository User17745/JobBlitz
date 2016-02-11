package candidatesql;

import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Cookie;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport
{	
	private static String dob,name,nationality,location,phno,gender;				//Personal Details
	
	private static String jobtype,experience,salary;								//Professional Details
	
	private static String uname,password;													//Login Details
	
	private static String notification;												//Hidden data

	//Generating getters and setters
	
	

	public String getDob() {
		return dob;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJobtype() {
		return jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//Generating constructors for searching to fetch username and password.
	
	public Login()
	{
		this.name=name;
		this.dob=dob;
		this.nationality=nationality;
		this.location=location;
		this.phno=phno;
		this.gender=gender;
		this.jobtype=jobtype;
		this.experience=experience;
		this.salary=salary;
		
		this.uname=uname;
		this.password=password;
		
		this.notification=notification;
	}
	
	public Login(String name)
	{
		this.name=null;
		this.dob=null;
		this.nationality=null;
		this.location=null;
		this.phno=null;
		this.gender=null;
		this.jobtype=null;
		this.experience=null;
		this.salary=null;
		
		this.uname=null;
		this.password=null;
		
		this.notification=null;
	}
	
	public String execute() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		
		ResultSet rs;
		
		rs = stm.executeQuery("select * from candidates");
		
		while(rs.next())
		{
			if( uname.equals(rs.getString(10)) && password.equals(rs.getString(11)))
			{	
				
																							//Fetching values to show profile
				name=rs.getString(1);
				dob=rs.getString(2);
				nationality=rs.getString(3);
				location=rs.getString(4);
				phno=rs.getString(5);
				gender=rs.getString(6);
				jobtype=rs.getString(7);
				experience=rs.getString(8);
				salary=rs.getString(9);
				notification=rs.getString(12);
			
				
				return "success";
			}
		}
		
		return "fail";
	}
}
