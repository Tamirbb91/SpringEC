<%--
  Created by IntelliJ IDEA.
  User: 986214
  Date: 4/16/2018
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Artists</title>
</head>
<body>
<div class="container">
    <jsp:include page="header.jsp"/>
    <h4>Artists</h4>
    <form action="/artists" method="POST">
        <div class="form-group">
            <label>Search by Name or Bio</label>
            <input name="search" class="form-control"/>
            <button type="submit" class="btn btn-success">Search</button>
        </div>
    </form>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Place of Birth</th>
            <th scope="col">Bio</th>
            <th scope="col">Total performed episodes</th>
        </tr>
        </thead>
        <c:forEach items="${artists}" var="artist">
            <tr>
                <td>${artist.name}</td>
                <td>${artist.placeOfBirth}</td>
                <td>${artist.bio}</td>
                <td>${artist.episodes.size()}</td>
            </tr>
        </c:forEach>
    </table>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
