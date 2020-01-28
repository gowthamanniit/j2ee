package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieWork
 */
@WebServlet("/CookieWork")
public class CookieWork extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieWork() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter pw=response.getWriter();
		
		Cookie c1=new Cookie("raja", "90");
		Cookie c2=new Cookie("ram", "50");
		Cookie c3=new Cookie("gopal", "60");
		Cookie c4=new Cookie("mugil", "30");
		Cookie c5=new Cookie("banu", "92");
		
		c1.setMaxAge(100);
		c2.setMaxAge(32);
		c3.setMaxAge(23);
		c4.setMaxAge(34);
		c5.setMaxAge(45);
	
		c1.setMaxAge(10);
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		response.addCookie(c4);
		response.addCookie(c5);
			
		pw.print(" get max age :"+c1.getMaxAge());
		pw.print(" get max age :"+c2.getMaxAge());
		pw.print(" get max age :"+c3.getMaxAge());
		pw.print(" get max age :"+c4.getMaxAge());
		pw.print(" get max age :"+c5.getMaxAge());
				
		pw.println("cookies created");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
