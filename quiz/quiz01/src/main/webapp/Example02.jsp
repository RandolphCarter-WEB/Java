<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-05-16
  Time: 오후 6:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
    <%
      String location = "";
      request.setCharacterEncoding("UTF-8");
      if(request.getParameter("HOME")!= null) {
        location = request.getParameter("HOME");
      } else if (request.getParameter("NOTICE")!= null) {
        location = request.getParameter("NOTICE");
      } else if (request.getParameter("BBS")!= null) {
        location = request.getParameter("BBS");
      } else {
        location = "ERROR";
      }
    %>

    <h1><%=location%></h1>
  </body>
</html>
