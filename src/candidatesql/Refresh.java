package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Refresh extends ActionSupport
{
	private String dob,name,nationality,location,phno,gender;				//Personal Details
	
	private String jobtype,experience,salary;								//Professional Details
	
	private String uname,password;													//Login Details
	
	private String notification;												//Hidden data
	
	//Generating getters and setters
	
	public String getDob() {
		return dob;
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
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

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	
	public String execute() throws Exception
	{
		Login l = new Login();
		
		uname = l.getUname();
		password=l.getPassword();
	
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
		
		return "success";
	}

}
