

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		try
		
		{
		pw.println("<body>");
		pw.println("<h1>middle</h1>");
		pw.println("</body>");
		}
		catch(Exception e)
		{
			pw.close();
		}
		/*
		HttpSession session=request.getSession(false);
		session.setAttribute("sid", "gowtham");
		pw.println((String)session.getAttribute("sid"));
		
		
		// request.getParameter is not worked servelet to servelt
	/* String first=request.getParameter("n1");
		String second=request.getParameter("n2");*/
		
		//pw.println(" Testing 2 nd servlet");
		
		
		/*
		 * String first=request.getAttribute("no1").toString();
		 
		String second=(String) request.getAttribute("no2");
		pw.println(" Testing 2 nd servlet,<br> Error Reaseon "+first+"+"+second+" can not add");
		
		Cdetails c2=new Cdetails();
		c2=(Cdetails) request.getAttribute("alldetails");
		pw.println("Name  = "+c2.name);
		pw.println("mark1 = "+c2.number1);
		pw.println("mark2 = "+c2.number2);
	}
*/
	}
	
	/**
	 * @throws IOException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		// TODO Auto-generated method stub		
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
	}

}
