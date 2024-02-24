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
 * Servlet implementation class Mycook2
 */
public class Mycook2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mycook2() {
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
		Cookie c[]=request.getCookies();
		/*
		out.println("cookie name:"+c[0].getName());
		out.println("cookie value:"+c[0].getValue());
		out.println("cookie name:"+c[1].getName());
		out.println("cookie value:"+c[1].getValue());
		out.println("cookie name:"+c[2].getName());
		out.println("cookie value:"+c[2].getValue());
		*/
		
		if(c==null)
		{			
			out.println("the cookie is empty");
			return;
		}
		
			
		for (int i=0;i<c.length;i++)
		{
			out.println("cookie name:"+c[i].getName());
			out.println("cookie value:"+c[i].getValue()+" Time in secs:"+c[i].getMaxAge());
				
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
