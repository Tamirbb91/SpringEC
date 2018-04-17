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
    <title>Seasons</title>
</head>
<body>
<div class="container">
    <jsp:include page="header.jsp"/>
    <h4>All seasons</h4>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">TV Serial name</th>
            <th scope="col">Season number</th>
            <th scope="col">Summary</th>
            <th scope="col">Total episodes</th>
            <th scope="col">Date</th>
        </tr>
        </thead>
        <c:forEach items="${seasons}" var="season">
            <tr>
                <td>${season.related_show.name}</td>
                <td>${season.seasonNumber}</td>
                <td>${season.summary}</td>
                <td><a href="/seasons/${season.id}/episodes">${season.episodes.size()}</a></td>
                <td>${season.date}</td>
            </tr>
        </c:forEach>
    </table>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
