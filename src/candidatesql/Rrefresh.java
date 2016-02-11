package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Rrefresh extends ActionSupport
{
	private String name,number,adderess,timings,jobtype,location,experience,salary,description,uname,password;				//fetching values for profile

	//Generating getters and setters
	
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

	
	
	public String execute() throws Exception
	{
		Rlogin l = new Rlogin();
			
		uname = l.getUname();
		password=l.getPassword();
		
		Class.forName("com.mysql.jdbc.Driver");
			
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
			
		Statement stm = con.createStatement();
			
		ResultSet rs;
			
		rs = stm.executeQuery("select * from recruiters");
		
		while(rs.next())
		{
			if( uname.equals(rs.getString(10)) && password.equals(rs.getString(11)))
			{
																							//Fetching values to show profile
				name=rs.getString(1);
				number=rs.getString(2);
				adderess=rs.getString(3);
				timings=rs.getString(4);
				jobtype=rs.getString(5);
				location=rs.getString(6);
				experience=rs.getString(7);
				salary=rs.getString(8);
				description=rs.getString(9);
				
				return "success";
			}
		}
		return "success";
	}

}
	
