
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var = "dis" driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"
         url = "jdbc:sqlserver://localhost\\sqlexpress;databasename=emp"
         user = "sa"  password = "12345"/>
         
         
        <sql:update dataSource="${dis}" var="insert">  
		INSERT INTO pdetails (empno,ename,esal,dob)VALUES (153,'madhanagopal', 17000, '12/01/2000');  
		</sql:update>
	
	   <sql:query dataSource = "${dis}" var = "result">
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