package candidatesql;

import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;

public class Insert extends ActionSupport
{
	private String name,dob,nationality,location,phno,gender;				//Personal Details
	
	private String jobtype,experience,salary;													//Professional Details
	
	private String uname,password;											//Login Details
	
	private String notification;											//hidden notifications
	
	//Generating Getters and Setters
	

	public String getName() {
		return name;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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
	
	public Insert()
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
	}
	
	public String execute() throws Exception					//Insertion into table candidates in sql
	{
		int exp = Integer.parseInt(experience);
		int sal = Integer.parseInt(salary);
		int note = Integer.parseInt(notification);
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		
		int i = stm.executeUpdate("insert into candidates(Name,BirthDate,Nationality,Location,PhoneNumber,Gender,JobType,Experience,Salary,Username,Password,Notification) values('" + name + "','" + dob + "','" + nationality + "','" + location + "','" + phno + "','" + gender + "','" + jobtype + "'," + exp + "," + sal + ",'" + uname + "','" + password + "'," + note + ")");
		
		if(i>0)
		{	
			return "success";
		}
		else
		{
			return "fail";
		}	
	}
}
