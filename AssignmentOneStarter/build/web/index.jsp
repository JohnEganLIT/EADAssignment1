<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
    <head><title>All Routes</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Routes Found: ${fn:length(routesList)} </h1>
        <br><br>
        <table width='1000' border='1'>
            <tr>
                <th>City</th>
                <th>Airport</th>
                <th>Code</th>
                <th>Q1</th>
                <th>Q2</th>
                <th>Q3</th>
                <th>Q4</th>
                <th>Flag</th>
                <th>Actions</th>

            </tr>
            
            <c:forEach var="route" items="${routesList}">
                        <tr>
                            <td name="code">${route.code}</td>
                            <td name="city">${route.city}</td>
                            <td name="airport">${route.airport}</td>
                            <td name="q1">${route.q1}</td>
                            <td name="q2">${route.q2}</td>
                            <td name="q3">${route.q3}</td>
                            <td name="q4">${route.q4}</td>
                            <td><img src='resources/flags/${route.code}.png' width="40" height="40"></img></td>
                            <td><a href="edit.jsp">Edit</a></td> 
                        </tr>
            </c:forEach>
            
        </table>
    </body>
</html>
