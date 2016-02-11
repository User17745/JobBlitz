package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;


public class Aupdate extends ActionSupport
{
	String olduname,oldpassword,uname,password;

	
	//Generating getters and setters
	
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
	
	public String execute() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		
		ResultSet rs;
		
		rs = stm.executeQuery("select * from admin");
		
		while(rs.next())
		{
			if( olduname.equals(rs.getString(1)) && oldpassword.equals(rs.getString(2)))
			{	
				stm.executeUpdate("update admin set Username='" + uname + "'");
				stm.executeUpdate("update admin set Password='" + password + "'");
				return "success";
			}
		}
		return "fail";
	}

}

