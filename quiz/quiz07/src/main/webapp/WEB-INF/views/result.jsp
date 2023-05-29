<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>$Title$</title>
        <%
            request.setCharacterEncoding("UTF-8");
            String userName = request.getParameter("userName");
            String userAge = request.getParameter("userAge");
            String userEmail = request.getParameter("userEmail");
            String userID = request.getParameter("userID");
            String userPW = request.getParameter("userPW");
            String userClass = request.getParameter("userClass");
            String userClassTime = request.getParameter("userClassTime");
        %>
    </head>
    <body>
        <fieldset>
            <legend><%=userName%>'s Info</legend>
            <h3>Name : <%=userName%></h3>
            <h3>Age : <%=userAge%></h3>
            <h3>Email : <%=userEmail%></h3>
            <h3>ID : <%=userID%></h3>
            <h3>PW : <%=userPW%></h3>
            <h3>class : <%=userClass%></h3>
            <h3><%=userClass%>'s time : <%=userClassTime%></h3>
        </fieldset>
    </body>
</html>