<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-05-22
  Time: 오후 1:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <%
            request.setCharacterEncoding("utf-8");
            String str1 = request.getParameter("str1");
            String str2 = request.getParameter("str2");
        %>
    </head>
    <body>
        <h1>This is Example01.jsp</h1>
            <h1><%=str1%></h1>
        <jsp:include page="Example02.jsp">
            <jsp:param name="str2" value="<%=str2%>"/>
        </jsp:include>
    </body>
</html>
