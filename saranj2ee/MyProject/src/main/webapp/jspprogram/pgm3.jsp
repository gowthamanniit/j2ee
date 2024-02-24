<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%=request.getParameter("t1")%>
<%=request.getParameter("t2")%>
<%=request.getParameter("t3")%>
<%=request.getParameter("t4")%>
<%=request.getParameter("t5")%>

<%
	Enumeration<String> k=request.getParameterNames();
	while(k.hasMoreElements())
	{
		String element=k.nextElement();
		out.println("<br>"+element+"="+ request.getParameter(element));
		
	}

%>
 

 

</body>
</html>