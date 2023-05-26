<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-05-24
  Time: 오전 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("UTF-8");

    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
%>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h1>Hello, <%=id%></h1>
        <h1>PW >> <%=pw%></h1>
    </body>
</html>
