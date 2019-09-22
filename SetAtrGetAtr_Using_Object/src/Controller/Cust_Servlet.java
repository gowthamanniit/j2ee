package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Cdetails;

/**
 * Servlet implementation class Cust_Servlet
 */
@WebServlet("/Cust_Servlet")
public class Cust_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cust_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String cno=request.getParameter("cno");
		String cname=request.getParameter("name");
		int tmark=Integer.parseInt(request.getParameter("tamil"));
		float height=Float.parseFloat(request.getParameter("height"));
		char martial=request.getParameter("martial").charAt(0);
		
		Cdetails c=new Cdetails(cno, cname, tmark, height, martial);
		
		request.setAttribute("alld", c);
		

		RequestDispatcher rd=request.getRequestDispatcher("DisplayServlet");
		rd.forward(request, response);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
