<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>$Title$</title>
    </head>
    <body>
        <fieldset>
            <legend>Join membership</legend>
            <form:form modelAttribute="userDataDTO"  action="example02" method="POST">
                <label for="userID">ID : </label><form:input  path="userID"/>
                <label for="userPW">PW : </label><form:password path="userPW" showPassword="true" />
                <label for="userName">Name : </label><form:input path="userName" />
                <label for="userEmail">Email : </label><form:input path="userEmail" />
                <label for="userPostNum">PostNum : </label><form:input path="userPostNum" />
                <label>Address <br />
                    Country : <form:input path="userCountryAddress" /> <br />
                    Region : <form:input path="userRegionAddress" /> <br />
                    City : <form:input path="userCityAddress" /> <br />
                </label> <br />

                <button type="submit" id="submitBtn">Submit</button>
            </form:form>
        </fieldset>
    </body>
</html>