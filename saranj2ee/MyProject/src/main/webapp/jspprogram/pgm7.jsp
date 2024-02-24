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
	Cookie c1=new Cookie("username","mythili");
	Cookie c2=new Cookie("password","pass@123");
	c1.setMaxAge(100);
	c2.setMaxAge(50);
	
	response.addCookie(c1);
	response.addCookie(c2);
	out.println("cookie stored successfully");
	%>
</body>
</html>