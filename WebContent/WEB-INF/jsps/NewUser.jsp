<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<style type="text/css">
	.err {color: red; font-family: fantasy; font-size: 14 }
</style>
</head>
<body>
	<h1 align="center">Enter Your Details</h1>
	<f:form action="addUser" method="post" commandName="user">
		<table align="center">
		
		
		<tr>
				<td>UserId</td><td><f:input path="userId"/>
					<f:errors path="userId" cssClass="err"/>
				</td>
			</tr>
			
			
			<tr>
				<td>UserName</td><td><f:input path="userName"/>
					<f:errors path="userName" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td>Password</td><td><f:password path="password"/>
					<f:errors path="password" cssClass="err"/>
				</td>
			</tr>
			
			
			<tr><td><input type="submit" value="AddUserDetails"></td></tr>
		</table>
	</f:form>
</body>
</html>