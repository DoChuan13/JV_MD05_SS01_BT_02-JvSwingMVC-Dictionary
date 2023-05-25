<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    * {
        box-sizing: border-box;
        margin: 0 auto;
    }

    form {
        margin-top: 50px;
        width: 50%;
        text-align: center;
    }
</style>
<body>
<div id="container"></div>
<form action="/result">
    <input type="text" name="vietnamese" value="${vietnamese}">
    <br/>
    <button type="submit">Search</button>
    <br/>
    <h2>Result: </h2>
    <c:forEach items="${english}" var="value">
        <h3>${value}</h3>
    </c:forEach>
</form>
</body>
</html>
