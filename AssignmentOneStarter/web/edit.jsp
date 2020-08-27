<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
    <head><title>Edit a Route</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <h1>Edit  </h1> <br>

    <br>
    
    <form action="EditRoute">
        
        <table width ="500" border="0">
            <tbody>
                 <tr>
                    <td>Code</td>
                    <td><input type="text" name="code" value="${route.code}" readonly /></td>
                </tr>
                <tr>
                <tr>
                    <td>City</td>
                    <td><input type="text" name="city" value="${route.city}" /></td>
                </tr>
                <tr>
                    <td>Airport</td>
                    <td><input type="text" name="airport" value="${route.airport}" /></td>
                </tr>
                
                    <td>Q1 Passengers</td>
                    <td><input type="text" name="q1" value="${route.q1}" /></td>
                </tr>
                <tr>
                    <td>Q2 Passengers</td>
                    <td><input type="text" name="q2" value="${route.q2}" /></td>
                </tr>
                <tr>
                    <td>Q3 Passengers</td>
                    <td><input type="text" name="q3" value="${route.q3}" /></td>
                </tr>
                <tr>
                    <td>Q4 Passengers</td>
                    <td><input type="text" name="q4" value="${route.q4}" /></td>
                </tr>
                
            </tbody>
        </table>
                <input type="submit" value="Submit" />  <a href="index.jsp"><input type="submit" value="Go Back" /></a>
    </form>
    
                  

    </body>
</html>
