<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
        <%
            String str1 = "This is made by main.jsp";
            String str2 = "This is test Text by main.jsp";
        %>
    </head>
    <body>
        <h1>This is main Page</h1>
        <jsp:forward page="./ex01/Example01.jsp">
            <jsp:param name="str1" value="<%=str1%>"/>
            <jsp:param name="str2" value="<%=str2%>" />
        </jsp:forward>
    </body>
</html>