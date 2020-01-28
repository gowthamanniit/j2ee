

<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<fmt:formatNumber value="123456.2342400" type="currency"></fmt:formatNumber>
<fmt:formatNumber value="123456.2342400" type="number"></fmt:formatNumber>
<fmt:formatNumber value="123456.2342400" type="percent"></fmt:formatNumber>

  
<c:set var = "now1" value = "<%=new java.util.Date()%>" />

      <p>Formatted Date (1): <fmt:formatDate type = "time"  
         value = "${now1}" /></p>

	<p>Formatted Date (1): <fmt:formatDate type = "date" 
         value = "${now1}" /></p>

	<p>Formatted Date (1): <fmt:formatDate type = "both" dateStyle="short"
         value = "${now1}" /></p>
 
 



           
         
         <c:forEach var = "zone"
            items = "<%=java.util.TimeZone.getAvailableIDs()%>">
                  <c:out value = "${zone}" /> = <fmt:timeZone value = "${zone}">
                  <fmt:formatDate value = "${now1}" timeZone = "${zone}"
                     type = "both" /><br>
                     </fmt:timeZone>
         </c:forEach>
         
         
         
         
                        
               <%--
                  <fmt:timeZone value = "${zone}"><br>
                   <fmt:formatDate value = "${now1}" timeZone = "${zn}"
                     type = "both" />
                  </fmt:timeZone>--%>
               



</body>
</html>