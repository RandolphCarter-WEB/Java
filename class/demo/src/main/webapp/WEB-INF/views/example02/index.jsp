<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>$Title$</title>
    </head>
    <body>
        <h1>Response Parameter Example Page</h1>
        <hr>
        <h2>First Example</h2>
        <a href="example02/test1?data1=100&data2=200&data3=300&data3=400">test01 GET</a>
        <hr>
        <h2>Second Example</h2>
        <form method="POST" action="example02/test2">
            <label for="data1">data1 : </label><input type="text" name="data1" id="data1"> <br />
            <label for="data2">data2 : </label><input type="text" name="data2" id="data2"> <br />
            <label>data3 :
                <input type="checkbox" name="data3" value="300"> 300
                <input type="checkbox" name="data3" value="400"> 400
                <input type="checkbox" name="data3" value="500"> 500
            </label>
            <button type="submit" id="submitBtn">submit</button>
        </form>

        <hr>
        <h2>Third Example</h2>
        <a href="example02/test3/100/200/300">test3 GET</a>
    </body>
</html>