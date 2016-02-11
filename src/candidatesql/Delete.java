package candidatesql;

import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.opensymphony.xwork2.ActionSupport;

public class Delete extends ActionSupport
{	
	private String deluname,delpassword;								//Fetching username and password taken for varification
	
	//Generating Getters and Setters
	
	public String getDeluname() {
		return deluname;
	}

	public void setDeluname(String deluname) {
		this.deluname = deluname;
	}

	public String getDelpassword() {
		return delpassword;
	}

	public void setDelpassword(String delpassword) {
		this.delpassword = delpassword;
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
		
		int i=stm.executeUpdate("delete from candidates where Username='" + deluname + "';");
			
		if(i>0)
		{
			return "success";
		}
		
		else return "fail";
	}		
}
