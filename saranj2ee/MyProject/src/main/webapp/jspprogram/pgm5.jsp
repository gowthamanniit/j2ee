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
	String name=request.getParameter("t1");
	out.println("test");
	out.println("<form action='pgm6.jsp'>");
	out.println("<input type='hidden' name='h' value="+name+">");
	out.println("<input type='submit' value='clickme'>");
	out.println("</form>");
%>
</body>
</html>