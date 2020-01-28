
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> JSP COmment Line</h1>
	
	<!--  hai welcome  -->
	<% 
		
	//sadflkjdsklfjsafasdfmasd flksadjsa djfl lskdaf asdlkfj lka
	
	/*fasdfsadf
	sdafasd
	fsad
	fsad
	*/	
	
	%>	
	<%-- gowthaman --%>	
	<h1>Declarations</h1>
	<%! int a=400;
	int b=300;
	int c;		
		int display()
		{
			c=a+b;
			return c;
		}
	%>		
	
	<!--  scriptlet  --> 
	<%		
		out.println("<h1>Sum of Two Numbers:</h1>");
		out.println("<br> first value  a = "+a);
		out.println("<br> Second Value b = "+b);
		int ans=display();
		out.println("<br> total = "+ans);
		
	%>	
	<% 
	if (a>b) 
	{
	%>
	<font size=7 color=red><marquee><%=a%> is Greater</marquee></font>		
	<%
	}
	else
	{
	%>
	<font size=7 color=red><marquee><%=b%> is Greater</marquee></font>
	<%
	}
	%>	
</body>
</html>