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
    <title>Cast</title>
</head>
<body>
<div class="container">
    <jsp:include page="header.jsp"/>
    <h4>Cast</h4>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Character</th>
            <th scope="col">Artist</th>
        </tr>
        </thead>
        <c:forEach items="${cast}" var="castElement">
            <tr>
                <td>${castElement.key}</td>
                <td><a href="/artists/${castElement.value.id}">${castElement.value.name}</a></td>
            </tr>
        </c:forEach>
    </table>
    <jsp:include page="footer.jsp"/>
</div>
</body>
</html>
