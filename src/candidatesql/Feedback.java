package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Feedback extends ActionSupport
{
	private String feedback;

	//generating getters and setters
	
	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public String execute() throws Exception
	{
		Login l = new Login();
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		
		int i = stm.executeUpdate("update candidates set Feedback='" + feedback + "' where Username='" + l.getUname() +"'");
		
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
