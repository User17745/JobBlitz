package candidatesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Capply extends ActionSupport
{
	private String companyname;
	
	//Genrating getters and setterss
	
	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	
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
			if(rs.getInt(1) > 0)
			{
				int i = stm.executeUpdate("update rc set Apply='yes' where CompanyName='" + companyname + "' and Username='" + l.getUname() + "'");
				if(i>0)
				{
					return "success";
				}
				else
				{
					return "fail2";
				}
			}
		}
		return "fail";
	}
}
	

