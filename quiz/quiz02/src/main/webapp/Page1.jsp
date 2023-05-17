<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2023-05-16
  Time: 오후 6:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
    <style>
      body {
        display: flex;
        flex-direction: column;
        box-sizing: border-box;
        padding: 0;
      }

      nav { background-color: pink; width: 100%; height: 10vh; }
      section[id="01"] { background-color: gray; }
      section[id="02"] { background-color: darkgray; }
      section[id="03"] { background-color: dimgray; }
      footer { background-color: brown; width: 100%; height: 10vh; }

      #container {
        display: grid;
        grid-template-columns: 2fr 1fr 1fr;

        width: 100%;
        height: 80vh;
      }
    </style>
  </head>
  <body>
    <nav>
      <h1>Test Page 1</h1>
    </nav>

    <div id="container">
      <section id="01"></section>
      <section id="02"></section>
      <section id="03"></section>
    </div>

    <footer></footer>
  </body>
</html>
