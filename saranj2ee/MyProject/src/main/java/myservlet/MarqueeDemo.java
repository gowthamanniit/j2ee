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
 * Servlet implementation class MarqueeDemo
 */
public class MarqueeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MarqueeDemo() {
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
		
		RequestDispatcher rd=request.getRequestDispatcher("/htmlfile/marquee1.html");
		
		
		String text=request.getParameter("t1");
		String colorname=request.getParameter("cn");
		String color2=request.getParameter("cn2");
		int size=Integer.parseInt(request.getParameter("si"));
		int count=Integer.parseInt(request.getParameter("nt"));
		
		String direction=request.getParameter("dir");
		pw.println("<h1>Maruee Demo</h1>");
		pw.println("<marquee loop="+count+" direction="+direction+" bgcolor="+colorname+"><font size="+size+" color="+color2+">"+text+"</font></marquee>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
