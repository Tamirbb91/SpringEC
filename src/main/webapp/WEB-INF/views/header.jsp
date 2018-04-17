<%--
  Created by IntelliJ IDEA.
  User: 986214
  Date: 4/16/2018
  Time: 6:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Header</title>
    <link href="https://use.fontawesome.com/releases/v5.0.8/css/all.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          type="text/css">
    <style>
        #header{
            width: 100%;
            height: 70px;
            top: 0;
            border-bottom: 1px solid aliceblue;
        }

        #webname{
            position: absolute;
            vertical-align: center;
            text-align: center;
        }
    </style>
</head>
<body>
<div id="header">
    <a href="/shows">Shows</a>
    |
    <a href="/artists">Artists</a>
    |
    <a href="/seasons">Seasons</a>
    |
    <a href="/episodes">Episodes</a>
    |
    <a href="/comments">Comments</a>
    <h2 id="webname">IMDB</h2>
</div>
</body>
</html>
