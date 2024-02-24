
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String name; %>
<%
//PrintWriter out=response.getWriter();
response.setContentType("text/html");
out.println("welcome to JSp");
int a=10;
int b=20;
int c=a+b;
out.println("<br>TOtal:"+c);
%>

<%=c%>

<% name="gowthaman"; %>
<h1>This is html code</h1>
<%=name%>


</body>
</html>