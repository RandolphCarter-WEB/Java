<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
        <h1>Quiz01-01</h1>
        <form action="Example01.jsp" method="post">
            <label for="User_id">ID : </label>
            <input type="text" id="User_id" name="User_id" />
            <br />

            <label for="User_pw">PW : </label>
            <input type="password" id="User_pw" name="User_pw" />
            <br />

            <button type="submit">Send</button>
        </form>

        <h1>Quiz01-02</h1>
        <form action="Example02.jsp" method="post">
            <button type="submit" name="HOME" value="HOME">HOME</button>
            <button type="submit" name="NOTICE" value="NOTICE">NOTICE</button>
            <button type="submit" name="BBS" value="BBS">BBS</button>
        </form>
    </body>
</html>