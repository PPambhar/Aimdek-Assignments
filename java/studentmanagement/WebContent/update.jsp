<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.*" %>
<%@ page import="com.student.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet">
<title>Update</title>
</head>
<body>
		<%
			List<Student> list=(List<Student>)request.getAttribute("student");
   		%>
		<div class="container">
		
			<div class="row">
				<div class="col-3"></div>
				<div class="col-6">
				<h2 align="center">Student Update</h2>
				<form method="post" action="updateStudent">
					<input type="hidden" name="id" value="<%=list.get(0).getId()%>" >
					<div class="form-group">
						<label for="">First Name</label> <input type="text"
							class="form-control" id="" value="<%=list.get(0).getFirstName()%>" name="firstName" placeholder="Enter first name" required="required">
					</div>
					<div class="form-group">
						<label for="">Last Name</label> <input type="text"
							class="form-control" id="" value="<%=list.get(0).getLastName()%>" name="lastName" placeholder="Enter last name" required="required">
					</div>
					<div class="form-group">
						<label for="">Email address</label> <input type="email"
							class="form-control" value="<%=list.get(0).getEmail()%>" id="" aria-describedby="emailHelp"
							placeholder="Enter email" name="email" required="required">
					</div>
					<div class="form-group">
						<label for="">Password</label> <input type="password"
							class="form-control" id="" value="<%=list.get(0).getPassword()%>" placeholder="Password" name="password" required="required">
					</div>
					<div class="form-group">
						<label for="">Age</label> <input type="number"
							class="form-control" value="<%=list.get(0).getAge()%>"id="" name="age" placeholder="Enter age" required="required">
					</div>

					<button type="submit" class="btn btn-primary">update</button>
	       		</form>
	</div>
	<div class="col-3"></div>
	</div>
	</div>

</body>
</html>