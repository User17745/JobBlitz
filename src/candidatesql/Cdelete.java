package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Cdelete extends ActionSupport
{
	private String uname;
	
	//Generating getters and setters
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String execute() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		
		int i=stm.executeUpdate("delete from candidates where Username='" + uname + "';");
			
		if(i>0)
		{
			return "success";
		}
		
		else return "fail";
	}
}
