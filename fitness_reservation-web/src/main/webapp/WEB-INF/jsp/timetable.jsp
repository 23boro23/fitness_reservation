<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Timetable</title>
    </head>
    <body>
        <h1>Timetable</h1>
        <table border="1">
            <tr>
                <td></td>
                <c:forEach var="date" items="${dates}">
                    <th>${date}</th>
                </c:forEach>
            </tr>
            
            <c:forEach var="time" begin="${startTime}" end="${endTime}">
                <tr>
                    <th rowspan="4">${time}:00</th> 
                    <c:forEach begin="1" end="7">
                        <td>&nbsp;</td>
                    </c:forEach>
                </tr>
                <c:forEach var="line" begin="1" end="3">
                    <tr>
                        <c:forEach begin="1" end="7">
                            <td>&nbsp;</td>
                        </c:forEach>
                    </tr>
                </c:forEach>
            </c:forEach>
        </table>
    </body>
</html>
