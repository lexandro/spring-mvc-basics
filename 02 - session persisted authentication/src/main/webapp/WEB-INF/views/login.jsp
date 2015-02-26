<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring MVC - Login Page</title>
    <style>
        html, body {
            height: 100%;
        }

        html {
            display: table;
            margin: auto;
            horiz-align: center;
        }

        body {
            display: table-cell;
            vertical-align: middle;
        }

    </style>
</head>
<body>

<h2>Login - WebApp2</h2>

<form action="login" method="post">
    User name:<br>
    <input type="text" name="username">
    <br>
    Password:<br>
    <input type="password" name="password">
    <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>