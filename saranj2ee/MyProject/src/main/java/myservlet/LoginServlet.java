package myservlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String un=request.getParameter("t1");
		String pa=request.getParameter("t2");
		
		//RequestDispatcher rd1=request.getRequestDispatcher("/Success");
		//RequestDispatcher rd2=request.getRequestDispatcher("/Failure");
		RequestDispatcher rd3=request.getRequestDispatcher("/ResServlet");
		
		request.setAttribute("myuser", un);
		request.setAttribute("mypass", pa);
		
		if(un.equals("admin") && pa.equals("@123"))			
		{
			request.setAttribute("login", "success");
		
		}
		else
		{
			request.setAttribute("login", "failure");
			
		}
		rd3.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
