<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>$Title$</title>
    </head>
    <body>
        <h1>test5</h1>
        <p>test5 data >> ${dto.data1}</p>
        <p>test5 data >> ${dto.data2}</p>
        <p>test5 data >>
            <c:forEach var="item" items="${dto.data3}">
                <c:out value="${item}" />
            </c:forEach>
        </p>
    </body>
</html>