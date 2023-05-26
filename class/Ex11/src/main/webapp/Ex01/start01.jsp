<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-05-24
  Time: 오전 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
  <form action="https://localhost:8080/${pageContext.request.contextPath}/loginController" method="post">
    <label for="id">ID :</label>
    <input type="text" id="id" name="id">
    <br />

    <label for="pw">PW : </label>
    <input type="password" id="pw" name="pw">
  </form>
  </body>
</html>
