<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
body {
    background-image: url("signup1.jpg");
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
}
</style>
<title>Insert title here</title>
</head>
<body>
<center>
<form action="insertUser" method="get"> 
First Name       :<input type="text" name="firstname"/><br></br> 
Last Name        :<input type="text" name="lastname"/><br></br> 
Email            :<input type="text" name="email"/><br></br> 
Date of Birth    :<input type="text" name="dob"/><br></br> 
Mobile Number    :<input type="text" name="phonenumber"/><br></br> 
User Name        :<input type="text" name="username"/><br></br> 
Password         :<input type="text" name="password"/><br></br> 
Re-enter Password:<input type="text" name="password"/><br></br>
<input type="submit"  value="SIGNUP"/> 
</form>
</center>
</body>
</html>