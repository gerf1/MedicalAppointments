  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deposit</title>
</head>
<body>

<form:form action="/account/deposit/" method="post" modelAttribute="account">



<form:label path="amount">Deposit
<form:errors path="amount"/>
<form:input path="amount"/>
</form:label>



<input type="submit" value="Submit"/>
</form:form>
</body>
</html>