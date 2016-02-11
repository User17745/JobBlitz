package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Advanced extends ActionSupport
{
	static String jobtype,location1;											//Data fetching from advanced search
	static int experience,salary;
	
	//Generating getters and setters

	public String getJobtype() {
		return jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public String getLocation1() {
		return location1;
	}

	public void setLocation1(String location1) {
		this.location1 = location1;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Advanced()
	{
		this.jobtype=jobtype;
		this.location1=location1;
		this.experience=experience;
		this.salary=salary;
	}
	
	public String execute()
	{
		return "success";
	}
	
		
}
