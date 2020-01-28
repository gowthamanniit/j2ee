

import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter pw=response.getWriter();		
		try
		{
		pw.println("hai1");
		RequestDispatcher rd1=getServletContext().getRequestDispatcher("/FailureServlet");
		rd1.include(request, response);  // redirect this page
		pw.println("hai2");
		}
		catch(Exception e)
		{
			pw.close();
		}
//		RequestDispatcher rd=request.getRequestDispatcher("html/pgm1.html");
//		rd.include(request, response);  // html full window output stored here.

		
//		String name=request.getParameter("n");
	//	String first=request.getParameter("n1");
		//String second=request.getParameter("n2");
		
		
		//request.setAttribute("no1", first);
      //request.setAttribute("no2", second);

		// store object values
		//Cdetails c1=new Cdetails();
		//c1.store(name, first, second);
        
		
		//request.setAttribute("alldetails", c1);
		
				
		/*if(first.matches("[0-9]+") && second.matches("[0-9]+"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("/html/pgm1.html");
			rd.include(request, response);  // html full window output stored here.
			
		int tot=Integer.parseInt(first)+Integer.parseInt(second);		
		pw.println("<br><hr>Total  = "+tot);
 			return;
		}
		else
		{
//			RequestDispatcher rd=request.getRequestDispatcher("html/pgm1.html");
//			rd.include(request, response);  // html full window output stored here.

			RequestDispatcher rd1=request.getRequestDispatcher("/FailureServlet");
			rd1.forward(request, response);  // redirect this page
			
			//response.sendRedirect("/Pgms/FailureServlet");
			return;			
		}
		//pw.println("<br>Password = "+passName);
		/*if(userName.equals("niit") && passName.equals("password"))
			JOptionPane.showMessageDialog(null, "Login Success");
		else
			JOptionPane.showMessageDialog(null, "Login Failure");
			*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
