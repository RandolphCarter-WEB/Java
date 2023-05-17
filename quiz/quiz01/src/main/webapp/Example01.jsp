<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
    <%
      request.setCharacterEncoding("UTF-8");
      String id = request.getParameter("User_id");
      String pw = request.getParameter("User_pw");
    %>

    <div id="content">
      <h1>Hello, <%=id%></h1>
      <h1>PW : <%=pw%></h1>
    </div>
  </body>
</html>
