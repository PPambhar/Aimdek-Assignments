<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="com.student.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<table class="table" border="1">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">first-name</th>
      <th scope="col">last-name</th>
      <th scope="col">email</th>
      <th scope="col">age</th>
      <th scope="col">update</th>
      <th scope="col">delete</th>
    </tr>

  </thead>
  <tbody>
  <%
	List<Student> list=(List<Student>)request.getAttribute("students");
	for(Student item:list){
   %>
 		<tr>
  			<td><%=item.getId()%> </td>
  			<td><%=item.getFirstName()%></td>
  			<td><%=item.getLastName()%></td>
  			<td><%=item.getEmail()%></td>
  			<td><%=item.getAge()%></td>
  			<td><a href="getStudentById?id=<%=item.getId()%>">update</a></td>
  			<td><a href="deleteStudent?id=<%=item.getId()%>">delete</a></td>
  		</tr>
  		<% } %>
  </tbody>
</table>
<br>
<br>
<form action="registration.jsp"><input type="submit" value="add student"></form>
</body>
</html>