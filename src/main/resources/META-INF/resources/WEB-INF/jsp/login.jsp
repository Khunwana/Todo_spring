<html>
	<head>
		<title> Login Page</title>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</head>
	<body>
		<div>Welcome to  the login page!</div>
		<hr>
		<pre>${errorMessage }</pre>
		<form method="Post">
			Name : <input type="text" name="name">
			Password : <input type="password" name="password">
			<input type="submit">
		</form>
	</body>
</html>