<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
            <h1>Edit Employee</h1>  
           <form:form method="POST" action="../update">    
            <table>    
            <tr>  
            <td></td>    
             <td><form:hidden  path="empId" /></td>  
             </tr>   
             <tr>    
              <td>Name : </td>   
              <td><form:input path="empName"  /></td>  
             </tr>    
             <tr>    
              <td>Salary :</td>    
              <td><form:input path="empSalary" /></td>  
             </tr>   
             <tr>    
              <td>Designation :</td>    
              <td><form:input path="empDesignation" /></td>  
             </tr>   
               
             <tr>    
              <td> </td>    
              <td><input type="submit" value="update"/></td>    
             </tr>    
            </table>    
           </form:form>    
</body>
</html>