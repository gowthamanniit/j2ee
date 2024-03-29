package myservlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Servlet implementation class Database1
 */
public class Database1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Database1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		out.println("<h1>Driver Accepted</h1>");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp?user=root&password=12345");
		out.println("<h1>COnnectio success</h1>");
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery("select * from details");
		
		out.println("<table border='3'><tr><th>Employee Number</th><th>Employee Name</th><th>Employee Salary</th></tr>");
		while(rs.next())
		{
			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");
		}
		
		out.println("</table>");
		rs.close();
		st.close();		
		
		con.close();
		}
		catch(Exception e)
		{
			out.println("Error Reason:"+e.toString());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
