<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
        <form action="https://localhost:8080/${pageContext.request.contextPath}/loginController" method="post">
            <label for="id">ID :</label>
            <input type="text" id="id" name="id">
            <br />

            <label for="pw">PW : </label>
            <input type="password" id="pw" name="pw">
            <button>Submit</button>
        </form>
    </body>
</html>