<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet">
<title>Registration</title>
</head>
<body>
	
		<div class="container">
		
			<div class="row">
				<div class="col-3"></div>
				<div class="col-6">
				<h2 align="center">Student Registration</h2>
				<form method="post" action="registration">
					<div class="form-group">
						<label for="">First Name</label> <input type="text"
							class="form-control" id="" name="firstName" placeholder="Enter first name" required="required">
					</div>
					<div class="form-group">
						<label for="">Last Name</label> <input type="text"
							class="form-control" id="" name="lastName" placeholder="Enter last name" required="required">
					</div>
					<div class="form-group">
						<label for="">Email address</label> <input type="email"
							class="form-control" id="" aria-describedby="emailHelp"
							placeholder="Enter email" name="email" required="required">
					</div>
					<div class="form-group">
						<label for="">Password</label> <input type="password"
							class="form-control" id="" placeholder="Password" name="password" required="required">
					</div>
					<div class="form-group">
						<label for="">Age</label> <input type="number"
							class="form-control" id="" name="age" placeholder="Enter age" required="required">
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
	       		</form>
	       		<br>
	       		<br>
	       		<br>
	       		
	</div>
	
	<form action="getStudent"><input type="submit" class="btn btn-primary" value="student list"></form>
	
	</div>

</body>
</html>