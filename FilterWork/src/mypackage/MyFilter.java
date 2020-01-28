package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/MathanFilter")
public class MyFilter implements Filter {

   
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		// pass the request along the filter chain
		PrintWriter out=response.getWriter();
		System.out.println("------------------------------Filter Servlet");
		
		int id=Integer.parseInt(request.getParameter("t1"));
		String name=request.getParameter("t2");
		
		if(id>0 && name.length()>2)
		chain.doFilter(request, response);
		else
		out.println("<h1>Filter Not Allow Because You Entered 0 or -ve value /<br> name length should be 3 char minimum</h1>");
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
