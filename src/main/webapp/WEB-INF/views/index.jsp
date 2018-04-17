<%--
  Created by IntelliJ IDEA.
  User: 986214
  Date: 4/16/2018
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>TV Series</title>
</head>
<body>
<div class="container">
    <jsp:include page="header.jsp"/>
    <h4>All shows</h4>
    <form action="/shows" method="POST">
        <div class="form-group">
            <label>Search by</label>
            <select name="searchType" class="form-control">
                <option value="name">Name</option>
                <option value="genre">Genre</option>
                <option value="rating">Rating</option>
                <option value="artistName">Artist name</option>
                <option value="charName">Character name</option>
                <option value="director">Director</option>
            </select>
            <input name="search" class="form-control"/>
            <button type="submit" class="btn btn-success">Search</button>
        </div>
    </form>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Rating</th>
            <th scope="col">Description</th>
            <th scope="col">Studio</th>
            <th scope="col">Director</th>
            <th scope="col">Genre</th>
            <th scope="col">Total series</th>
        </tr>
        </thead>
        <c:forEach items="${shows}" var="show">
            <tr>
                <td>${show.name}</td>
                <td>${show.rating}</td>
                <td>${show.description}</td>
                <td>${show.studio}</td>
                <td>${show.director}</td>
                <td>${show.genre}</td>
                <td><a href="/shows/${show.id}/seasons">${show.seasons.size()}</a></td>
            </tr>
        </c:forEach>
    </table>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
