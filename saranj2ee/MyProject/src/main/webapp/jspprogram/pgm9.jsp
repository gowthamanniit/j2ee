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

try
{
	//int c=0/0;
	//out.println("value ok");
	int arr[]={11,22,33};
	out.println(arr[2]);
	int brr[]=new int[-10];
	out.println("array size accepted");
	
	
	
}
catch(ArithmeticException e)
{
	out.println("Exception Error:"+e.toString());
}
catch(ArrayIndexOutOfBoundsException e)
{
	out.println("array index out of bounds exception");
}
catch(NegativeArraySizeException e)
{
	out.println("<h1>Negative Array Size Exception</h1>");
}
%>
</body>
</html>