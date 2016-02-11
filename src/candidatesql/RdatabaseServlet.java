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


@WebServlet("/RdatabaseServlet")
public class RdatabaseServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
			Statement stm = con.createStatement();
		
			ResultSet rs;
		
			rs = stm.executeQuery("select * from recruiters");
			
			pw.write("<html>	<body text='blue'>		Recruiter databasse:<br><br>");
		
			while(rs.next())
			{	
				pw.write("<table border='1'><tr><td>Company Name:</td><td>" + rs.getString(1) + "</td></tr><tr><td>Contacts:</td><td>" + rs.getString(2) + "</td></tr><tr><td>Office Address:</td><td>" + rs.getString(3) + "</td></tr><tr><td>Interview Timings:</td><td>" + rs.getString(4) + "</td></tr><tr><td>JobTypes:</td><td>" + rs.getString(5) + "</td></tr><tr><td>Salary:</td><td>" + rs.getString(8) + "</td></tr><tr><td>Description:</td><td>" + rs.getString(9) + "</td></tr><tr><td>Username:</td><td>" + rs.getString(10) + "</td></tr><tr><td>Password:</td><td>" + rs.getString(11) + "</table> <br>");
			
			}
			pw.write("</body>	</html>");
		}
			catch(Exception e)
			{
				System.out.println("Exception!!" + e.getMessage());
			}

	}

}
