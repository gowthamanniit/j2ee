package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class EmpUpdateServlet
 */
@WebServlet("/EmpUpdateServlet")
public class EmpUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//RequestDispatcher rd=request.getRequestDispatcher("HtmlFile/UpdateEmp.html");
		//rd.include(request, response);
		
		PrintWriter pw=response.getWriter();
		
		int eno=Integer.parseInt(request.getParameter("t1"));
		String ename=request.getParameter("t2");
		int esal=Integer.parseInt(request.getParameter("t3"));
		String dob=request.getParameter("t4");
		
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			pw.println("<br>Driver Accepted");
			
			Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;databasename=emp","sa","12345");
			pw.println("Connection Success");
			
			Statement st=con.createStatement();
			
			int ans=st.executeUpdate("update pdetails set ename='"+ename+"',esal="+esal+",dob='"+dob+"' where empno="+eno);
			
			if(ans>0)
			{
				//JOptionPane.showMessageDialog(null, "successfully updated");
				pw.println("successfully updated");
			}
			else
			{
				//JOptionPane.showMessageDialog(null, "error updated");
				pw.println("error updated");
			}
			
		}
		catch(Exception e)
		{
			pw.print("error updated "+e.toString());
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
