<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>$Title$</title>
    </head>
    <body>
        <h1>Request Parameter Example01</h1>
        <h2>first Example</h2>
        <a href="example01/test1?data1=100&data2=200">test01</a>

        <hr>
        <h2>seconds Example</h2>

        <fieldset>
            <legend>Second Data Input</legend>
            <form action="example01/test2" method="POST">
                <label for="data1">Data1 >> </label><input type="text" name="data1" id="data1"> <br />
                <label for="data2">Data2 >> </label><input type="text" name="data2" id="data2"> <br />

                CheckBox Data3 >>
                <label for="data3_data1">300</label><input type="checkbox" name="data3" id="data3_data1" value="300">
                <label for="data3_data2">400</label><input type="checkbox" name="data3" id="data3_data2" value="400">
                <label for="data3_data3">500</label><input type="checkbox" name="data3" id="data3_data3" value="500">

                <button type="submit" id="submitBtn1">submit</button>
            </form>
        </fieldset>

        <hr>
        <h2>Third Example</h2>
        <a href="example01/test3">test03 GET</a>

        <hr>
        <h2>Fourth Example</h2>
        <a href="example01/test4">test04 GET</a>

        <hr>
        <h2>Fifth Example</h2>
        <fieldset>
            <legend>Fifth Data Input</legend>
            <form action="example01/test5" method="POST">
                <label for="data5_data1">Data1 >> </label><input type="text" name="data1" id="data5_data1"> <br />
                <label for="data5_data2">Data2 >> </label><input type="text" name="data2" id="data5_data2"> <br />

                CheckBox Data3 >>
                <label for="data5_data3">300</label><input type="checkbox" name="data3" id="data5_data3" value="300">
                <label for="data5_data4">400</label><input type="checkbox" name="data3" id="data5_data4" value="400">
                <label for="data5_data5">500</label><input type="checkbox" name="data3" id="data5_data5" value="500">

                <button type="submit" id="submitBtn2">submit</button>
            </form>
        </fieldset>
    </body>
</html>