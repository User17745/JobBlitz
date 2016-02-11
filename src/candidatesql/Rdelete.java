package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Rdelete extends ActionSupport
{
	private String deluname,delpassword;												//fetching data from varification form of recruiters
	
	//Generating getters and setters 
	
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
		System.out.println(deluname);
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
		Statement stm = con.createStatement();
		
		int i=stm.executeUpdate("delete from recruiters where Username='" + deluname + "';");
			
		if(i>0)
		{
			return "success";
		}
		
		else return "fail";
	}
}
