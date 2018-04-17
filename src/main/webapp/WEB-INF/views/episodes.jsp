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
    <title>Episodes</title>
</head>
<body>
<div class="container">
    <jsp:include page="header.jsp"/>
    <h4>All episodes</h4>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Season Summary</th>
            <th scope="col">Episode Number</th>
            <th scope="col">Description</th>
            <th scope="col">Cast</th>
            <th scope="col">Total comments</th>
            <th scope="col">Date aired</th>
        </tr>
        </thead>
        <c:forEach items="${episodes}" var="episode">
            <tr>
                <td>${episode.season.summary}</td>
                <td>${episode.episodeNumber}</td>
                <td>${episode.description}</td>
                <td><a href="/episodes/${episode.id}/cast">${episode.cast.size()}</a></td>
                <td><a href="/episodes/${episode.id}/comments">${episode.comments.size()}</a></td>
                <td>${episode.dateAired}</td>
            </tr>
        </c:forEach>
    </table>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
