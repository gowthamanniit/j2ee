package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd=request.getRequestDispatcher("HtmlFile/Emp_Form.html");
		rd.include(request, response);
		
		PrintWriter pw=response.getWriter();
		
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			pw.println("<br>Driver Accepted");
			
			Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;databasename=emp","sa","12345");
			pw.println("Connection Success");
			
			Statement st=con.createStatement();
			
			//int eno=Integer.parseInt(request.getParameter("t1"));
			String ename=request.getParameter("t2");
			/*int esal=Integer.parseInt(request.getParameter("t3"));
			String dob=request.getParameter("t4");
			*/
			//int ans=st.executeUpdate("insert into pdetails values("+eno+",'"+ename+"',"+esal+",'"+dob+"')");
			
			//if(ans>0)
			//{
				//JOptionPane.showMessageDialog(null, "Successfully Inserted to db");
				ResultSet rs=st.executeQuery("select * from pdetails where ename like '%"+ ename +"%'");
				boolean check=false;
				pw.println("<table border='2'><tr><th>Emp Number</th><th>Employee name</th><th>Salary</th><th>Date Of Birth</th></tr>");
				while(rs.next()==true)
				{
					//if(eno==Integer.parseInt(rs.getString("empno")))
					//if(ename.equals(rs.getString("ename")))
					//{
						check=true;
					
					pw.println("<tr><td>"+rs.getString("empno")+"</td>");
					pw.println("<td>"+rs.getString("ename")+"</td>");
					pw.println("<td>"+rs.getString("esal")+"</td>");
					pw.println("<td>"+rs.getString("dob")+"</td></tr>");
				
					//break;
					//}
				}
				pw.println("</table>");
				if(check==false)
				{
					pw.println("<h1>Not Found In DataBase</h1>");
				}
				rs.close();
				
				
									
			//}
			//else
				//JOptionPane.showMessageDialog(null, "Insert Error");			
			
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			pw.println("<br><br>error name:"+e.toString());			
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
