<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-05-16
  Time: 오후 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
      <title>Title</title>
  </head>
  <body>

    <ul>
      <%
        int Count = Integer.parseInt(request.getParameter("Count"));

        for (int i = 0; i < Count; i++) { %>
          <li><%=i+1%></li>
      <%
        }
      %>
    </ul>

  </body>
</html>
