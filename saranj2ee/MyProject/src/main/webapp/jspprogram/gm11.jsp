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
</head>
<body>
<%
int sno=1999;
String sname="gowthaman";
int mark=98;
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	out.println("Driver Accepted");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/saran?user=root&password=12345");
	out.println("connection success");
	Statement st=con.createStatement();	
	int ans=st.executeUpdate("insert into student values("+sno+",'"+sname+"',"+mark+")");
	if(ans>0)
		out.println("insert success");
	else
		out.println("insert failure");
	st.close();
	con.close();
}
catch(Exception e)
{
	out.println("<br>error:"+e.toString());
}
%>
</body>
</html>