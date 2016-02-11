package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class Rnotification extends ActionSupport
{
	String uname;
	
	Rlogin r = new Rlogin();
	
	//Generating getters and setters
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String execute() throws Exception
	{
		int i = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		Statement stm2 = con.createStatement();
		
		ResultSet rs;
		ResultSet rs2;
		
		rs2 = stm2.executeQuery("select * from rc");
		
		while(rs2.next())	
		{
			if(r.getName().equals(rs2.getString(1)) && uname.equals(rs2.getString(2)))
			{
				return "fail";
			}
		}
		
		
		stm.executeUpdate("insert into rc(CompanyName,Username) values('" + r.getName() + "','" + uname + "')");					//Inserting into rc table in sql
		
		rs = stm.executeQuery("select notification from candidates where Username='" + uname + "'");		//incrementing notification by 1 in candidates
		
		while(rs.next())
		{
			i = rs.getInt(1);
			i++;
	
			stm.executeUpdate("update candidates set Notification='" + i + "' where Username='" + uname + "'");
			break;
		}
			return "success";
	
	}
}
