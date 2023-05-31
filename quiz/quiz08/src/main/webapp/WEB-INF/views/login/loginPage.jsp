<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>$Title$</title>
    </head>
    <body>
        <form action="/login" method="POST">
            <fieldset>
                <legend>Login</legend>
                <label for="userID">ID : </label><input type="text" name="id" id="userID" required> <br />
                <label for="userPW">PW : </label><input type="password" name="pw" id="userPW" required> <br />
                <button type="submit" name="login">Login</button>
            </fieldset>
        </form>
    </body>
</html>