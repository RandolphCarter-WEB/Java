<%@ page import="jakarta.servlet.http.Cookie" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
    <%
        String name = "";
        String value = "";
        Cookie[] cookies = request.getCookies();

        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("name")) {
                name = cookie.getName();
                value = cookie.getValue();

                cookie.setMaxAge(0);
            }
        }
    %>
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