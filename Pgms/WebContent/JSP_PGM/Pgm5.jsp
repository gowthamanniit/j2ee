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

<c:set var="mark1" value="6"></c:set>

<c:if test="${mark1>34}">
Result = <c:out value="pass"></c:out>
</c:if>
<c:if test="${mark1<35}">
Result = <c:out value="Fail"></c:out>
</c:if>



</body>
</html>