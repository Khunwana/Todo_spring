<%@ include file="common/header.jspf" %>
		<title> Login Page</title>
	</head>
	<body>
		<%@ include file="common/navigation.jspf" %>
		<div class="container">
		
			<div><h1>Login</h1></div>
			<hr>
			<pre>${errorMessage }</pre>
			<form method="Post">
				Name : <input type="text" name="name">
				Password : <input type="password" name="password">
				<input type="submit">
			</form>
			
		</div>
<%@ include file="common/footer.jspf" %>