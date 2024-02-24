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
	Cookie co[]=request.getCookies();
	out.println("Total Cookies:"+co.length);
	for (int i=0;i<co.length;i++)
	{
	out.println("<br>cookie key:"+co[i].getName()+" -->"+co[i].getValue());	
	}
%>
</body>
</html>