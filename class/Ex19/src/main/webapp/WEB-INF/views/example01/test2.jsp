<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>$Title$</title>
    </head>
    <body>
        <h1>test2</h1>
        <p>test2 data >> ${param.data1}</p>
        <p>test2 data >> ${param.data2}</p>
        <p>test2 data >>
            <c:forEach var="item" items="${paramValues.data3}">
                <c:out value="${item}" />
            </c:forEach>
        </p>
    </body>
</html>