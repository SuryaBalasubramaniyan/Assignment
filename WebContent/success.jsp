<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login successful</title>
</head>
<body>
<h1>
		
	<% Integer check=(Integer)request.getAttribute("check");

%>
<% if (check==0) { %>
   
    <%=request.getParameter("name")%>,Account registered
    <jsp:include page="login.html"></jsp:include>
<% } if(check==1) {%>
    
    <%=request.getParameter("name")%>,Account Already Exists!
    <jsp:include page="login.html"></jsp:include>
<% } %>
			</h1>
</body>
</html>