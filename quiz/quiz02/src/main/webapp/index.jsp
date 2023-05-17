<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
        <script>
            function updateAction() {
                let selectElement = document.getElementById("Page");
                let selectedValue = selectElement.value;
                let formElement = document.getElementById("pageForm");
                formElement.action = selectedValue + ".jsp";
            }
        </script>
    </head>
    <body>
        <fieldset>
            <legend>Page Move</legend>
            <form id="pageForm" method="post">
                <label for="Page">Page : </label>
                <select id="Page" name="Page" onchange="updateAction()">
                    <option value="null">Select Page</option>
                    <option value="Page1">Page 1</option>
                    <option value="Page2">Page 2</option>
                    <option value="Page3">Page 3</option>
                </select>
                <br />
                <button type="submit">Move Page</button>
            </form>
        </fieldset>
    </body>
</html>
