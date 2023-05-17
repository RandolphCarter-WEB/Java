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

      nav { background-color: blue; height: 100%; }
      div > nav { background-color: pink; width: 100%; height: 10vh; }
      section[id="01"] { background-color: gray; }
      section[id="02"] { background-color: darkgray; }
      footer { background-color: brown; width: 100%; height: 10vh; }

      #container {
        display: grid;
        grid-template-columns: 2fr 1fr;

        width: 100%;
        height: 80vh;
      }
    </style>
  </head>
  <body>
    <nav></nav>

    <div>
      <nav>Test Page2</nav>
      <div id="container">
        <section id="01"></section>
        <section id="02"></section>
      </div>
      <footer></footer>
    </div>
  </body>
</html>
