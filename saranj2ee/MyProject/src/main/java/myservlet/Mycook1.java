package myservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Mycook1
 */
public class Mycook1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mycook1() {
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
		String username=request.getParameter("user");
		int usernametime=Integer.parseInt(request.getParameter("usertime"));
		String password=request.getParameter("pass");
		int passwordtime=Integer.parseInt(request.getParameter("passtime"));
		String city=request.getParameter("city");
		int citytime=Integer.parseInt(request.getParameter("citytime"));
		
		
				
		Cookie c1=new Cookie("user", username);
		Cookie c2=new Cookie("pass", password);
		Cookie c3=new Cookie("city", city);
		
		c1.setMaxAge(usernametime);
		c2.setMaxAge(passwordtime);
		c3.setMaxAge(citytime);
		
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		
		out.println("cookie 1 :"+c1.getMaxAge());
		out.println("cookie 2 :"+c2.getMaxAge());
		out.println("cookie 3 :"+c3.getMaxAge());
		
		
		
		out.println("Cookie Created successfully and timing fixed");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
