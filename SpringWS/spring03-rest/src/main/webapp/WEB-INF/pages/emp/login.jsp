<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

	<h1>Employee Login Page</h1>


	<div class="container">
		<form>
			<div class="form-group row">
				<label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
				<div class="col-sm-10">
					<input type="text" id="email" class="form-control"
						id="staticEmail" placeholder="email@example.com">
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
				<div class="col-sm-10">
					<input type="password" id="password" class="form-control" id="inputPassword"
						placeholder="Password">
				</div>
			</div>
			<!-- <button onclick="getLogin()" type="button" class="btn btn-primary">Submit</button> -->
			<button id="loginBtn" type="button" class="btn btn-primary">Submit</button>
		</form>
	</div>


<script>

	var getLogin = function(){
		var email = document.getElementById('email').value;
		var password = document.getElementById('password').value;
		
		console.log('send login req');
		fetch('//localhost:8080/spring03-rest/rest/user/login', { 
			  method: 'POST',
			  body: JSON.stringify({"email": email, "password": password}),
			  headers:{
			    'Content-Type': 'application/json'
			  }
			  })
			
			  .then(res => res.json())
			  .then(response => console.log('Success:', response))
			  .catch(error => console.error('Error:', error));
	}
	
document.getElementById("loginBtn").addEventListener('click', getLogin);
	

</script>
</body>
</html>