<%@page import="servlet.Login"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile</title>
</head>
<body>
<%
String userName = null;
String user = (String) session.getAttribute("user");
if(session.getAttribute("user") == null){
    response.sendRedirect("Login.jsp");
}
%>
Welcome <%=user%>!

<form action="LogOut"  method="post">
<input type="submit" value="Logout" >
</form>
</body>
</html>