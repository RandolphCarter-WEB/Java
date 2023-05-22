<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-05-22
  Time: 오후 1:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
    <%
      request.setCharacterEncoding("utf-8");
      String str2 = request.getParameter("str2");
    %>
  </head>
  <body>
    <h1>This is Example03.jsp Page</h1>
    <h1><%=str2%></h1>
  </body>
</html>
