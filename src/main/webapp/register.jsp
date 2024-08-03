<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
<form action="register" method="post">
<h1><b>User Register</b></h1>
<table>
<tr>
<td>UserName</td>
<td><input type="text" name="userName" required></td>
</tr>
<tr>
<td>E-Mail</td>
<td><input type="email" name="email" required></td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" name="address" required></td>
</tr>
<tr>
<td>Mobile Number</td>
<td><input type="text" name="mobileNumber" required></td>
</tr>
<tr>
<td>Topic :</td>
<td><input type="checkbox" name="topic" value="Angular"> Angular</td>
<td><input type="checkbox" name="topic" value="Java"> Java</td>
<td><input type="checkbox" name="topic" value="Python"> Python</td>
</tr>
<tr>
<td>Register Date</td>
<td><input type="date" name="registerDate" required></td>
</tr>
<tr>
<td>Parent Contact</td>
<td><input type="text" name="parentContact" required></td>
</tr>
<tr>
<td><input type="submit" value="Register"></td>
</tr>
</table>
</form>
</body>
</html>
