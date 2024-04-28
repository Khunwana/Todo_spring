<%@ include file="common/header.jspf" %>
		<title> List Todos Pages</title>
	</head>
	<body>
	
		<%@ include file="common/navigation.jspf" %>
		<div class="container">
		
			<div><h2>To-Do details</h2></div>
			<hr>
			<form:form method="Post" modelAttribute="todo">
			<fieldset class="mb-3">
				<form:label path="username">User Name </form:label>
				<form:input type="text" path="username" required="required"/>
				<form:errors path="description" cssClass="text-warning"/><br>
			</fieldset>	
			<fieldset class="mb-3">
				<form:label path="description">Description</form:label>
				<form:input type="text" path="description" required="required"/>
				<form:errors path="description" cssClass="text-warning"/><br>
			</fieldset>	
			<fieldset class="mb-3">
				<form:label path="targetDate">Target Date</form:label>
				<form:input type="text" path="targetDate" required="required"/>
				<form:errors path="targetDate" cssClass="text-warning"/><br>
			</fieldset>	
				<form:input type="hidden" path="id" />
				<form:input type="hidden" path="done" />
				
				<input type="submit" class="btn btn-success">
			</form:form>
		</div>
<%@ include file="common/footer.jspf" %>

