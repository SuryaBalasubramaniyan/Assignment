<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page reloading</title>
</head>
<body>
<h1>
		<%=request.getParameter("name")%>,Account Already Exists!
	</h1>
	<jsp:include page="login.html" />
</body>
</html>