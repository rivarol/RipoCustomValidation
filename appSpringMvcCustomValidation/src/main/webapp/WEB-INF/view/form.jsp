<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="phoneModele" action="addValidatePhone">
		<table>
    		<tr><td colspan="2"><label for="phoneInput">Téléphone </label></td></tr>
    		<tr>
    			<td><form:input path="phone" id="phoneInput" /></td>
    			<td><form:errors path="phone" cssClass="error" /></td>
    		</tr>
    		<tr><td colspan="2"><input type="submit" value="Submit" /></td></tr>
    	</table>
	</form:form>
	<br/>
	<h2>${message}</h2>
</body>
</html>