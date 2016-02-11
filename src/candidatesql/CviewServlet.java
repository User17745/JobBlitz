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

@WebServlet("/CviewServlet")
public class CviewServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Login l = new Login();
		
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");

			Statement stm = con.createStatement();
			Statement stm2 = con2.createStatement();

			ResultSet rs1;
			
			pw.write("<html>	<body text='blue'>");
			
			if( Integer.parseInt(l.getNotification()) > 0 )
			{
				
				rs1 = stm.executeQuery("select * from rc where Username='" + l.getUname() + "'");
				
				while(rs1.next())
				{
					String a;
					System.out.println(l.getUname());
					ResultSet rs2 = stm2.executeQuery("select * from recruiters where CompanyName='" + rs1.getString(1) + "'");
					

					while(rs2.next())
					{
						pw.write("<table border='1'><tr><td>Company Name:</td><td>" + rs2.getString(1) + "</td></tr><tr><td>Contacts:</td><td>" + rs2.getString(2) + "</td></tr><tr><td>Office Address:</td><td>" + rs2.getString(3) + "</td></tr><tr><td>Interview Timings:</td><td>" + rs2.getString(4) + "</td></tr><tr><td>JobTypes:</td><td>" + rs2.getString(5) + "</td></tr><tr><td>Salary:</td><td>" + rs2.getString(8) + "</td></tr><tr><td>Description:</td><td>" + rs2.getString(9) + "</table> <br>");
					}
				}
				
				pw.write("</body>	</html>");
			}
			
			else
			{
				pw.write("<br><br>Sorry!! There is no job notification for you.");
			}
			
			pw.write("</body>	</html>");
		}
		catch(Exception e)
		{
			System.out.println("Exception!!" + e.getMessage());
			e.printStackTrace();
		}
	}
}
