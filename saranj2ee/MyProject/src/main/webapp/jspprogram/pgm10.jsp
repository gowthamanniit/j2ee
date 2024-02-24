<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
<style type="text/css">
#inner
{
	background-color: rgb(112,200,10);
	width:44%;
	align:center;
	box-shadow: 10px 1px 25px 15px black;
	
}
</style>
</head>
<body>
<div align="center">
<div id="inner">
<%
//response.setIntHeader("Refresh", 5);
out.println(request.getAttribute("myname"));
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	out.println("Driver Accepted");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/saran?user=root&password=12345");
	out.println("connection success");
	Statement st=con.createStatement();	
	ResultSet rs=st.executeQuery("select * from student");
	out.println("<table bgcolor='green' align='center' cellpadding='15' border='3'><tr bgcolor='yellow'><th>sno</th><th>sname</th><th>mark</th></tr>");
	while (rs.next())
	{
		out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");
	}	
	out.println("</table>");
	rs.close();
	st.close();
	con.close();
}
catch(Exception e)
{
	out.println("<br>error:"+e.toString());
}
%>
</div>
</div>
</body>
</html>