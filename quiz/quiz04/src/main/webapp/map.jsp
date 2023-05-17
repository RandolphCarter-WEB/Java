<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-05-17
  Time: 오전 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
    <style>
      table {
        border-collapse: collapse;
        width: 100%;
        border: 1px solid black;
      }
      td {
        border: 1px solid black;
        padding: 5px;
      }
      h1 {
        text-align: center;
      }
    </style>
  </head>
  <body>
    <%
      int X = Integer.parseInt(request.getParameter("X_Value"));
      int Y = Integer.parseInt(request.getParameter("Y_Value"));
      int i, j;
    %>
      <table>
          <%
            for (i = 0; i < X; i++) {
          %>
            <tr>
              <%
                for (j = 0; j < Y; j++) {
              %>
                <td><h1><%=i+1%>-<%=j+1%></h1></td>
              <%
                }
              %>
            </tr>
          <%
            }
          %>
      </table>
  </body>
</html>
