package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class AdminLogin extends ActionSupport
{
	public String uname,password;

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
	
	//Generating getters and setters
	
	public String execute() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		
		ResultSet rs;
		
		rs = stm.executeQuery("select * from admin");
		
		while(rs.next())
		{
			if( uname.equals(rs.getString(1)) && password.equals(rs.getString(2)))
			{	
				return "success";
			}
		}
		
		return "fail";
	}
}
