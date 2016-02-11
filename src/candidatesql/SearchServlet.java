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

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		Login l = new Login();
		
		Search s = new Search();
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		pw.write("<html>	<body text='blue'>");
		try
		{
			int i=0;
			
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
			Statement stm = con.createStatement();
		
			ResultSet rs;
		
			rs = stm.executeQuery("select * from recruiters where JobType='" + l.getJobtype() + "' and Location='"+ l.getLocation() + "' and MinExperience<='" + Integer.parseInt(l.getExperience()) + "' and MaxSalary >='" + s.getSearchsalary() + "';" );
			
			
			pw.write("Companies Offering Jobs related to your profile:<br><br>");
		
			while(rs.next())
			{	
				if(rs.getString(1)!=null)
				{
					pw.write("<table border='1'><tr><td>Company Name:</td><td>" + rs.getString(1) + "</td></tr><tr><td>Contacts:</td><td>" + rs.getString(2) + "</td></tr><tr><td>Office Address:</td><td>" + rs.getString(3) + "</td></tr><tr><td>Interview Timings:</td><td>" + rs.getString(4) + "</td></tr><tr><td>JobTypes:</td><td>" + rs.getString(5) + "</td></tr><tr><td>Salary:</td><td>" + rs.getString(8) + "</td></tr><tr><td>Description:</td><td>" + rs.getString(9) + "</table> <br>");
					i=1;
				}
			}
			
			if(i!=1)
			{
				pw.write("<br><br>Sorry we could not find any job for you.");
				pw.write("</body>	</html>");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception!!" + e.getMessage());
		}
		pw.write("</body>	</html>");

	}
}