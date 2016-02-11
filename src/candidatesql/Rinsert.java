package candidatesql;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

public class Rinsert extends ActionSupport
{
	private String name,number,adderess,timings,jobtype,location,description,uname,password;		//update details
	
	private String olduname,oldpassword;													//Verification details
	
	private String experience,salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAdderess() {
		return adderess;
	}

	public void setAdderess(String adderess) {
		this.adderess = adderess;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public String getJobtype() {
		return jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String execute() throws Exception
	{
		int exp = Integer.parseInt(experience);
		int sal = Integer.parseInt(salary);
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		
		int i = stm.executeUpdate("insert into recruiters values('" + name + "','" + number + "','" + adderess + "','" + timings + "','" + jobtype + "','" + location + "'," + exp + "," + sal + ",'" + description + "','" + uname + "','" + password +"')");
		
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
