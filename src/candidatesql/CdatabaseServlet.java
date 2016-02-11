package candidatesql;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

@WebServlet("/CdatabaseServlet")
public class CdatabaseServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("hello");
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
		
			Statement stm = con.createStatement();
		
			ResultSet rs;
		
			rs = stm.executeQuery("select * from candidates" );
			
			pw.write("<html>	<body text='blue'>");
			pw.write("Candidate database:<br><br>");
			
			while(rs.next())
			{	
				
				pw.write("<table border='1'><tr><td>Candidate Name:</td><td>" + rs.getString(1) + "</td></tr><tr><td>BirthDate:</td><td>" + rs.getString(2) + "</td></tr><tr><td>Nationality:</td><td>" + rs.getString(3) + "</td></tr><tr><td>Location:</td><td>" + rs.getString(4) + "</td></tr><tr><td>Phone Number:</td><td>" + rs.getString(5) + "</td></tr><tr><td>Gender:</td><td>" + rs.getString(6) + "</td></tr><tr><td>Job Type:</td><td>" + rs.getString(7) + "</td></tr><tr><td>Working Experience:</td><td>" + rs.getString(8) + "</td></tr><tr><td>Expected Salary:</td><td>" + rs.getString(9) + "</td></tr><tr><td>Username:</td><td>" + rs.getString(10) + "</td></tr><tr><td>Password:</td><td>" + rs.getString(11) + "</table> <br>");
			
			}
			pw.write("	</body>		</html>");
		}
		catch(Exception e)
		{
			System.out.println("Exception!!" + e.getMessage());
		}

	}

}
