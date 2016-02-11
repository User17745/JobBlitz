package candidatesql;

import com.opensymphony.xwork2.ActionSupport;

import java.sql.*;

public class Update extends ActionSupport
{
	private String name,dob,nationality,location,phno,gender;				//Personal Details
	
	private String jobtype,experience,salary;										//Professional Details
	
	private String uname,password;											//Login Details
	
	private String olduname,oldpassword;									//Previous login details
	
	//Generating getters and setters.
	
	
	
	public String getName() {
		return name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
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

	public String execute()
	{
		return "success";
	}
	
	public String execute2() throws Exception
	{
		int exp = Integer.parseInt(experience);
		int sal = Integer.parseInt(salary);
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		
		ResultSet rs;
		
		rs = stm.executeQuery("select * from candidates");
		
		while(rs.next())
		{
			if( olduname.equals(rs.getString(10)) && oldpassword.equals(rs.getString(11)))
			{	
		
				stm.executeUpdate("update candidates set Name='" + name + "' where Username='" + olduname + "'");
				stm.executeUpdate("update candidates set BirthDate='" + dob + "' where Username='" + olduname + "'");
				stm.executeUpdate("update candidates set Nationality='" + nationality + "' where Username='" + olduname + "'");
				stm.executeUpdate("update candidates set Location='" + location + "' where Username='" + olduname + "'");
				stm.executeUpdate("update candidates set PhoneNumber='" + phno + "' where Username='" + olduname + "'");
				stm.executeUpdate("update candidates set Gender='" + gender + "' where Username='" + olduname + "'");
				stm.executeUpdate("update candidates set JobType='" + jobtype + "' where Username='" + olduname + "'");
				stm.executeUpdate("update candidates set Experience=" + exp + " where Username='" + olduname + "'");
				stm.executeUpdate("update candidates set Salary=" + sal + " where Username='" + olduname + "'");
				stm.executeUpdate("update candidates set Username='" + uname + "' where Username='" + olduname + "'");
				stm.executeUpdate("update candidates set Password='" + password + "' where Username='" + olduname + "'");
				
				return "success";
			}
		}
		
		return "fail";
	}
}
