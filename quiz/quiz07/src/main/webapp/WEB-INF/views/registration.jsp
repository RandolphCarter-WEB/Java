<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>$Title$</title>
        <%
            request.setCharacterEncoding("UTF-8");
            String userName = request.getParameter("userName");
        %>
    </head>
    <body>
        <h2><%=userName%>님 안녕하세요.</h2>
        <form action="/result" method="post">
            <fieldset>
                <legend>Course Registration</legend>
                <label for="className">Class : </label>
                <select name="className" id="className" required>
                    <option value="default" selected>choose Registration Class</option>
                    <option value="C programing">C Programing</option>
                    <option value="C++ programing">C++ Programing</option>
                    <option value="java programing">java programing</option>
                    <option value="Rust programing">Rust programing</option>
                </select>

                <label for="classTime">ClassTime : </label>
                <select name="classTime" id="classTime" required>
                    <option value="am 09:00 ~ 11:00">am 09:00 ~ 11:00</option>
                    <option value="am 11:00 ~ 13:00">am 11:00 ~ 13:00</option>
                    <option value="pm 13:00 ~ 15:00">pm 13:00 ~ 15:00</option>
                    <option value="pm 15:00 ~ 17:00">pm 15:00 ~ 17:00</option>
                </select>
            </fieldset>
            <button type="submit">register</button>
            <button type="button">Reset</button>
        </form>
    </body>
</html>