<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credentials</title>
</head>
<style>
input {color:red;}
</style>
<body>
<table>
<form method="post" action="validate">
<tr>
<td>USERNAME</td><td><input type="text" placeholder="username" name="userName"/></td>
</tr>
<tr>
<td>PASSWORD</td><td><input type="password" placeholder="password" name="password"/></td>
</tr>
<tr>
<td><input type="submit" value="login"/></td>
</tr>
</form>
</table>
</body>
</html>