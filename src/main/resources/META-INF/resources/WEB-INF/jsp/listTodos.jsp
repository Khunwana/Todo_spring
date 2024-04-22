<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title> List Todos Pages</title>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
	</head>
	<body>
		<div>
			<h1>Welcome ${ name } to  the TODO APP!</h1>
		</div>
		<hr>
		<div><h2>Your have the following things to-do</h2></div>
		<table>
			<thead>
				<tr>
					<th>Id</th>
					<th>Description</th>
					<th>TargetDate</th>
					<th>Is Done</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate }</td>
					<td>${todo.done}</td>
				</tr>
			</c:forEach>			
			</tbody>
		</table>
	</body>
</html>