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

@WebServlet("/GetfeedbackServlet")
public class GetfeedbackServlet extends HttpServlet 
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
			
			rs = stm.executeQuery("select Username,Feedback from candidates");
			
			pw.write("<html>	<body><br><br>Feedbacks from the existing users:");
			
			while(rs.next())
			{
				if(rs.getString(2)!=null)
				{
					pw.write("<br><br>Username : " + rs.getString(1) + "<br>Feedback : " + rs.getString(2)); 
				}
			}
			
			pw.write("<br><br><a href='Candidate.jsp'>HomePage</a>");
			pw.write("</body>	</html>");
		}
		catch(Exception e)
		{
			System.out.println("Exception!!" + e.getMessage());
		}

	}

}
