package candidatesql;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Cview extends ActionSupport
{
	private Login l = new Login();
	
	public String execute() throws Exception
	{
		return "success";
	}
}
