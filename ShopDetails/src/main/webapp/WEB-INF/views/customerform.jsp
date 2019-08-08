<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<style>
h1 {color:blue;}

</style>
<body>
<h1> 

<table>
        <form action="customeradd" method="Get">
        <tr>
        
        <td>USERNAME</td>
        <td><input type="text" name="firstname"/></td>
        </tr>
         <tr>
        
        <td>ADDRESS</td>
        <td><input type="textarea" name="address"/></td>
        </tr>
         <tr>
        <td colspan="2"><input type="submit" value="add customers"/></td>
        </tr>
        </form>
</h1>
</body>
</html>