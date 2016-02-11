package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Rupdate extends ActionSupport
{
	private String name,number,adderess,timings,jobtype,location,experience,salary,description,uname,password;	//Update details
	
	private String olduname,oldpassword;														//Verification login details
	
	//Generating getters and setters
	
	
	
	public String getName() {
		return name;
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

	public String getOlduname() {
		return olduname;
	}

	public void setOlduname(String olduname) {
		this.olduname = olduname;
	}

	public String getOldpassword() {
		return oldpassword;
	}

	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}
	
	
	public String execute()
	{
		return "success";
	}

	
	public String execute2() throws Exception
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		
		ResultSet rs;
		
		rs = stm.executeQuery("select * from recruiters");
		
		while(rs.next())
		{
			if( olduname.equals(rs.getString(10)) && oldpassword.equals(rs.getString(11)))
			{
	
				stm.executeUpdate("update recruiters set CompanyName='" + name + "' where Username='" + olduname + "'");
				stm.executeUpdate("update recruiters set ContactNumber='" + number + "' where Username='" + olduname + "'");
				stm.executeUpdate("update recruiters set OfficeAdderess='" + adderess + "' where Username='" + olduname + "'");
				stm.executeUpdate("update recruiters set InterviewTiming='" + timings + "' where Username='" + olduname + "'");
				stm.executeUpdate("update recruiters set JobType='" + jobtype + "' where Username='" + olduname + "'");
				stm.executeUpdate("update recruiters set Location='" + location + "' where Username='" + olduname + "'");
				stm.executeUpdate("update recruiters set MinExperience=" + Integer.parseInt(experience) + " where Username='" + olduname + "'");
				stm.executeUpdate("update recruiters set MaxSalary=" + Integer.parseInt(salary) + " where Username='" + olduname + "'");
				stm.executeUpdate("update recruiters set Description='" + description + "' where Username='" + olduname + "'");
				stm.executeUpdate("update recruiters set Username='" + uname + "' where Username='" + olduname + "'");
				stm.executeUpdate("update recruiters set Password='" + password + "' where Username='" + olduname + "'");
			
				return "success";
		
			}
		}
		
		return "fail";
	}
	
}
