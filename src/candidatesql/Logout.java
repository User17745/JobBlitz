package candidatesql;

import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport
{
	private static String dob,name,nationality,location,phno,gender;				//Personal Details
	
	private static String jobtype,experience,salary;								//Professional Details
	
	private static String uname,password;													//Login Details
	
	private static String notification;												//Hidden data

	public static String getDob() {
		return dob;
	}

	public static void setDob(String dob) {
		Logout.dob = dob;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Logout.name = name;
	}

	public static String getNationality() {
		return nationality;
	}

	public static void setNationality(String nationality) {
		Logout.nationality = nationality;
	}

	public static String getLocation() {
		return location;
	}

	public static void setLocation(String location) {
		Logout.location = location;
	}

	public static String getPhno() {
		return phno;
	}

	public static void setPhno(String phno) {
		Logout.phno = phno;
	}

	public static String getGender() {
		return gender;
	}

	public static void setGender(String gender) {
		Logout.gender = gender;
	}

	public static String getJobtype() {
		return jobtype;
	}

	public static void setJobtype(String jobtype) {
		Logout.jobtype = jobtype;
	}

	public static String getExperience() {
		return experience;
	}

	public static void setExperience(String experience) {
		Logout.experience = experience;
	}

	public static String getSalary() {
		return salary;
	}

	public static void setSalary(String salary) {
		Logout.salary = salary;
	}

	public static String getUname() {
		return uname;
	}

	public static void setUname(String uname) {
		Logout.uname = uname;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Logout.password = password;
	}

	public static String getNotification() {
		return notification;
	}

	public static void setNotification(String notification) {
		Logout.notification = notification;
	}
	
	//Generate getters and setters
	
	public String execute()
	{
		Login l = new Login(name);
		
		return "success";
	}
}
