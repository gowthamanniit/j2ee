<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int a,n;
a=Integer.parseInt(request.getParameter("t1"));
n=Integer.parseInt(request.getParameter("t2"));
%>

<form action="/DBWork_Sunday/JSPFile/pgm1.jsp">
Enter Mark<input type="Text" name="t1" value="0">
Enter No. of times Display:<input type="Text" name="t2" value="0">
<input type="submit" value="clickme">
<INPUT Type="text" value=<%=a+n%>>
</form>

<%
out.println("<font size=7>Your Mark = "+a+"</font>");
%>

<%
if (a>=50)
{
	try
	{
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	out.println("Driver Accpeted");
	Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;databasename=emp","sa","12345");
	out.println("connection Success");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from pdetails");
	boolean check=false;
	out.println("<table border='2'><tr><th>Emp Number</th><th>Employee name</th><th>Salary</th><th>Date Of Birth</th></tr>");
	while(rs.next()==true)
	{
			check=true;
		
		out.println("<tr><td>"+rs.getString("empno")+"</td>");
		out.println("<td>"+rs.getString("ename")+"</td>");
		out.println("<td>"+rs.getString("esal")+"</td>");
		out.println("<td>"+rs.getString("dob")+"</td></tr>");

	}
	out.println("</table>");
	}
	catch(Exception e)
	{
		out.println("error name "+e.toString());
	}	
%>
<font size=7 color="white"><marquee loop=<%=n%> bgcolor="green" behavior="alternate">You PASS</marquee></font>
<%	
  }else{
 %>
<font size=7 color="white"><marquee loop=<%=n%> bgcolor="red" behavior="alternate">You FAIL</marquee></font>

<%}%>

</body>
</html>