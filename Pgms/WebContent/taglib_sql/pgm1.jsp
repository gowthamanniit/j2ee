<%@ page import = "java.io.*,java.util.*,java.sql.*,java.text.*,java.util.Date"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var = "snapshot" driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
         url = "jdbc:sqlserver://localhost\\sqlexpress;databasename=emp"
         user = "sa"  password = "12345"/>

		<sql:update dataSource="${snapshot}" var="count">  
		INSERT INTO pdetails (empno,ename,esal,dob)VALUES (154,'Nasreen', 15000, '12/12/2000');  
		</sql:update>
		  
		  <c:set var="empno" value="1019"/> 
		  <sql:update dataSource="${snapshot}" var="count">  
				DELETE FROM pdetails WHERE empno = ?  
 			<sql:param value="${empno}" />  
		 </sql:update>  
		 
		 
		    <%  
			Date DoB = new Date("2000/10/16");  
			int empno = 1018;  
			%> 
			 
<sql:update dataSource="${snapshot}" var="count">  
   UPDATE pdetails SET dob = ? WHERE empno = ?  
   <sql:dateParam value="<%=DoB%>" type="DATE" />  
   <sql:param value="<%=empno%>" />  
</sql:update>

		  
		  
		  
		  
<sql:transaction dataSource="${snapshot}">  
   <sql:update var="count">  
      UPDATE pdetails SET ename = 'kandasamy' WHERE empno = 1003  
   </sql:update>  
   <sql:update var="count">  
      UPDATE pdetails SET ename = 'kandasamy' WHERE empno = 1008  
   </sql:update>  
   <sql:update var="count">  
      UPDATE pdetails SET ename = 'kandasamy' WHERE empno = 154  
   </sql:update>
     
</sql:transaction> 
		  
		  
         <sql:query dataSource = "${snapshot}" var = "result">
            SELECT * from pdetails;
         </sql:query>
 
      <table border = "1" width = "100%">
         <tr>
            <th>Emp ID</th>
            <th>Emp Name</th>
            <th>Emp Salary</th>
            <th>Emp DOB</th>
         </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td> <c:out value = "${row.empno}"/></td>
               <td> <c:out value = "${row.ename}"/></td>
               <td> <c:out value = "${row.esal}"/></td>
               <td> <c:out value = "${row.dob}"/></td>
            </tr>
         </c:forEach>
      </table>

 
</body>
</html>