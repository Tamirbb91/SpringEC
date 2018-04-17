<%--
  Created by IntelliJ IDEA.
  User: Tamir
  Date: 4/16/2018
  Time: 10:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Artist</title>
</head>
<body>
<div class="container">
    <jsp:include page="header.jsp"/>
    <form:form modelAttribute="artist" action="/artists/${artist.id}" method="POST">
        <div class="form-group">
            <label>Name</label>
            <form:input path="name" class="form-control"/>
            <form:errors path="name" cssClass="from-text text-danger" element="small"/>
        </div>
        <div class="form-group">
            <label>Place of Birth</label>
            <form:input path="placeOfBirth" class="form-control"/>
            <form:errors path="placeOfBirth" cssClass="from-text text-danger" element="small"/>
        </div>
        <div class="form-group">
            <label>Bio</label>
            <form:input path="bio" class="form-control"/>
            <form:errors path="bio" cssClass="from-text text-danger" element="small"/>
        </div>
        <button type="submit" class="btn btn-success">Update</button>
    </form:form>
    <form action="artists/${artist.id}/delete" method="post">
        <button type="submit" class="btn btn-danger">Delete</button>
    </form>
</div>
</body>
</html>
