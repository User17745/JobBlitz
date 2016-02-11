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


@WebServlet("/RappliedServlet")
public class RappliedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			PrintWriter pw = response.getWriter();
			pw.write(" <html>  <body>");
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3307/project", "root", "root");
			
			Statement stm = con.createStatement();
			Statement stm2 = con2.createStatement();
		
			ResultSet rs;
			ResultSet rs2;
		
			rs = stm.executeQuery("select * from rc");
			
			while(rs.next())
			{
				if(rs.getString(3)!=null)
				{
					pw.write("<br><br>Username:" + rs.getString(2));
				}
			}pw.write("</body>	</html>");
			
		}
		catch(Exception e)
		{
			
		}
	}

}
