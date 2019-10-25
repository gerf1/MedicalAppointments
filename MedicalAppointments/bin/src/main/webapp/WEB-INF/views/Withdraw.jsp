  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Withdraw</title>
</head>
<body>

<form:form action="/account/withdraw/" method="POST" modelAttribute="account">


<c:if test="${errorMessage != null}">
        <c:out value="${errorMessage}"></c:out>
    </c:if>
<form:label path="amount">Withdraw
<form:errors path="amount"/>
<form:input path="amount"/>
</form:label>



<input type="submit" value="Submit"/>
</form:form>
</body>
</html>