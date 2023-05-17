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
        display: grid;
        grid-template-columns: 1fr 5fr;
        box-sizing: border-box;
        padding: 0;
      }
      #content {
        display: grid;
        grid-template-rows: 1fr 5fr;
      }
      #mainContainer {
        display: grid;
        grid-template-columns: 5fr 1fr;
      }
      #main {
        display: grid;
        grid-template-rows: 5fr 1fr;
      }
      nav { background-color: gray; height: 100%; }
      #content > nav { background-color: green; width: 100%; }
      #mainContainer > nav { background-color: blue; height: 100%; }
      #main > div { background-color: red; width: 100%; }
      #main > footer { background-color: yellow; width: 100%; }
    </style>
  </head>
  <body>
    <nav></nav>
    <div id="content">
      <nav>
        <h1>Page 3 test</h1>
      </nav>

      <div id="mainContainer">
        <div id="main">
          <div></div>
          <footer></footer>
        </div>
        <nav></nav>
      </div>
    </div>
  </body>
</html>
