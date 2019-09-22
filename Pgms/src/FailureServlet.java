

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FailureServlet
 */
@WebServlet("/FailureServlet")
public class FailureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FailureServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw=response.getWriter();
		
		
		// request.getParameter is not worked servelet to servelt
	/* String first=request.getParameter("n1");
		String second=request.getParameter("n2");*/
		
		//pw.println(" Testing 2 nd servlet");
		
		
		/*
		 * String first=request.getAttribute("no1").toString();
		 
		String second=(String) request.getAttribute("no2");
		pw.println(" Testing 2 nd servlet,<br> Error Reaseon "+first+"+"+second+" can not add");
		*/
		Cdetails c2=new Cdetails();
		c2=(Cdetails) request.getAttribute("alldetails");
		pw.println("Name  = "+c2.name);
		pw.println("mark1 = "+c2.number1);
		pw.println("mark2 = "+c2.number2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		doGet(request, response);
	}

}
