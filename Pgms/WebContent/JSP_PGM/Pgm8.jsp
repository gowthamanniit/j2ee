
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- basic -->
<!-- 
<c:forEach var="k" begin="1" end="10">
<c:out value="${k}"></c:out>

</c:forEach>
 -->
 !-- advanced -->
 <c:forEach var="i" begin="1" end="10">
 <c:set var="sum" value="${sum+i}"></c:set>
 
 </c:forEach>
 Total<c:out value="${sum}"></c:out>
</body>
</html>