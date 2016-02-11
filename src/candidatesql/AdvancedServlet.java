package candidatesql;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdvancedServlet")
public class AdvancedServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int i=0;
		
		Advanced a = new Advanced();
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
			
			Statement stm = con.createStatement();
			
			ResultSet rs;
	
			rs = stm.executeQuery("select CompanyName from recruiters where JobType='" + a.getJobtype() + "' and Location='"+ a.getLocation1() + "' and MinExperience<=" + a.getExperience() + " and MaxSalary >=" + a.getSalary() + ";" );
			
			pw.write("<html>	<body><br><br>Companies Offering Jobs related to your selections");
			
			while(rs.next())
			{	
				if(rs.getString(1)!=null)
				{
					i++;
					pw.write("<br><br>Company Name:" + rs.getString(1) + "<br> <a href='Apply.jsp'>Apply</a>");
					pw.write("</body>	</html>");
				}
			}
			if(i==0)
			{
				pw.write("<br><br>Sorry we could not find any job for your search");
				pw.write("</body>	</html>");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception!!" + e.getMessage());
		}
	}

}
