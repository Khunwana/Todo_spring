<%@ include file="common/header.jspf" %>
		<title> Welcome Page</title>
	</head>
	<body>
		<%@ include file="common/navigation.jspf" %>
		<div class="container">
			<h1>
				Welcome ${ name } to  the TODO APP!
			</h1>
			<hr>
			<a href="list-todos">Manage  your todos</a>
		</div>
<%@ include file="common/footer.jspf" %>