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
 <c:set var = "salary" value = "${0*5}"></c:set>
 
 <c:out value = "${salary}"/>
<c:choose>  		
<c:when test="${salary<=0}">
<h1>Salary is very Low to survive.</h1>
         </c:when>
         
         <c:when test = "${salary >= 5000}">
            Salary is good.
         </c:when>             
         
         <c:otherwise>
            No comment sir...
         </c:otherwise>
      </c:choose>
</body>
</html>