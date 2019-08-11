

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 
 */
@WebServlet("/lk")
public class lk extends HttpServlet 
{
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
	
		RequestDispatcher rd=request.getRequestDispatcher("/htmlfile/insertForm.html");
		rd.include(request, response);
		
		int rn=Integer.parseInt(request.getParameter("t3"));
		String name=request.getParameter("t1");
		int ma=Integer.parseInt(request.getParameter("t2"));
		
		
		
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//pw.println("Diver acepted");
			  
	Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;database=kuppus","sa","12345");
			//pw.println("connection accepted");
			
		Statement st=con.createStatement();
		
		int res=st.executeUpdate("INSERT INTO keerthi VALUES("+ma+",'"+name+"',"+rn+")");
		if(res>0)
			pw.print("inserted success");
		else
			pw.print("inserted failure");
	
		
		
		
		ResultSet rs=st.executeQuery("select * from keerthi");
		int col=rs.getMetaData().getColumnCount();
		//pw.println("<br>No of column:"+col);
		String colname[]=new String[col];
		for(int i=0;i<col;i++)
		{
			colname[i]=rs.getMetaData().getColumnName(i+1);
			
		}
		pw.println("<html><center><table border='1'><tr>");
		for(int k=0;k<col;k++)
		{
			pw.println("<th>"+colname[k]+"</th>");
		}
		pw.println("</tr>");
		while(rs.next()==true)
		{
			pw.println("<tr>");
			for(int j=0;j<col;j++)
			{
				pw.println("<td>"+rs.getString(colname[j])+"</td>");
				
			}
			pw.println("</tr>");				
		}
		pw.println("</table></center></html>");
		rs.close();
		st.close();
		con.close();
		}
		
		
		
		
		
		
		/*while(rs.next()==true)
		{
			pw.print("Roll no : "+rs.getInt("mark"));
			pw.print("Sname   : "+rs.getString("name"));
			pw.println("Mark  : "+rs.getInt("reg"));
		}
			rs.close();
			st.close();
			con.close();
		}*/
		catch(Exception e)
		
		{
			pw.println("error mesage:"+e.toString());
		}
	}
	


	
}