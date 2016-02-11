package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class Delnotification extends ActionSupport
{
	public String execute() throws Exception
	{
		Login l = new Login();
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		
		ResultSet rs;
		
		rs = stm.executeQuery("select notification from candidates where Username='" + l.getUname() + "'");
		while(rs.next())
		{
			if(rs.getInt(1) > 0 )
			{
				stm.executeUpdate("delete from rc where Username='" + l.getUname() + "';");
				stm.executeUpdate("update candidates set Notification = 0 where Username='" + l.getUname() + "'");
				return "success";
			}
		}
		return "fail";
	}
}
