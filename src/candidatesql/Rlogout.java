package candidatesql;

import com.opensymphony.xwork2.ActionSupport;

public class Rlogout extends ActionSupport
{
	private static String name,number,adderess,timings,jobtype,location,experience,salary,description,uname,password;				//fetching values for profile

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Rlogout.name = name;
	}

	public static String getNumber() {
		return number;
	}

	public static void setNumber(String number) {
		Rlogout.number = number;
	}

	public static String getAdderess() {
		return adderess;
	}

	public static void setAdderess(String adderess) {
		Rlogout.adderess = adderess;
	}

	public static String getTimings() {
		return timings;
	}

	public static void setTimings(String timings) {
		Rlogout.timings = timings;
	}

	public static String getJobtype() {
		return jobtype;
	}

	public static void setJobtype(String jobtype) {
		Rlogout.jobtype = jobtype;
	}

	public static String getLocation() {
		return location;
	}

	public static void setLocation(String location) {
		Rlogout.location = location;
	}

	public static String getExperience() {
		return experience;
	}

	public static void setExperience(String experience) {
		Rlogout.experience = experience;
	}

	public static String getSalary() {
		return salary;
	}

	public static void setSalary(String salary) {
		Rlogout.salary = salary;
	}

	public static String getDescription() {
		return description;
	}

	public static void setDescription(String description) {
		Rlogout.description = description;
	}

	public static String getUname() {
		return uname;
	}

	public static void setUname(String uname) {
		Rlogout.uname = uname;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		Rlogout.password = password;
	}
	
	//Generating getters and setters
	
	public String execute()
	{
		Rlogin r = new Rlogin(name);
		
		return "success";
	}
}
