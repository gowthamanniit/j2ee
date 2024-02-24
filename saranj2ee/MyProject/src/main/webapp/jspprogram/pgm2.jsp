<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="/htmlfile/calljsp1.html"/>

<%

int n1=Integer.parseInt(request.getParameter("t1"));
int n2=Integer.parseInt(request.getParameter("t2"));
int n3=Integer.parseInt(request.getParameter("t3"));
int n4=Integer.parseInt(request.getParameter("t4"));
int n5=Integer.parseInt(request.getParameter("t5"));



int tot=n1+n2+n3+n4+n5;
float avg=tot/5.0f;

%>

<h1>Total : <%=tot%></h1>
<h1>average : <%=avg%></h1>
<%
//getServletContext().getRequestDispatcher("/htmlfile/calljsp1.html").include(request,response);


if (n1>34 && n2>34 && n3>34 && n4>34 && n5>34)
{
%>
<marquee><font size="7" color="green">You Pass</font></marquee>
<%	
}
else
{
%>
<marquee><font size="7" color="red">You Fail</font></marquee>
<%}%>



</body>
</html>