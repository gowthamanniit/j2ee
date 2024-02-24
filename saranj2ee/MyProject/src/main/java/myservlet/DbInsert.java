package myservlet;

import jakarta.servlet.RequestDispatcher;
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
 * Servlet implementation class DbInsert
 */
public class DbInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DbInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		
		int rno=Integer.parseInt(request.getParameter("t1"));	
		String sname=request.getParameter("t2");
		int smark=Integer.parseInt(request.getParameter("t3"));
		
		//RequestDispatcher rd=request.getRequestDispatcher("/htmlfile/DbInsert.html");
		//rd.include(request, response);
		
				
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//out.println("<h1>Driver Accepted</h1>");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/saran?user=root&password=12345");
		//out.println("<h1>COnnectio success</h1>");
		
		Statement st=con.createStatement();
		
		st.executeUpdate("insert into student values("+rno+",'"+sname+"',"+smark+")");
		
		
		//out.println("<h1>Successfully Inserted:");
		//response.sendRedirect("/MyProject/jspprogram/pgm10.jsp");
		request.setAttribute("myname", "Show all data in database");
		RequestDispatcher rd=request.getRequestDispatcher("/jspprogram/pgm10.jsp");
		rd.forward(request, response);
		
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
