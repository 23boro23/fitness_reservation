<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Timetable</title>
        <link rel="stylesheet" type="text/css" href="/fitness_reservation-web/style/main.css" />
    </head>
    <body>
        <div id="layout">
            
            <jsp:include page="common/header.jsp" />
            
            <div id="main">
        
                <h1>Timetable</h1>
                <table border="1">
                    <tr>
                        <td>&nbsp;</td>
                        <c:forEach var="time" items="${times}">
                            <c:if test="${fn:endsWith(time, '00')}">
                                <th colspan="4">${time}</th>
                            </c:if>
                        </c:forEach>
                    </tr>

                    <c:forEach var="date" items="${dates}">
                        <tr>
                            <td>${date}</td>
                            <c:set var="skip" value="0" />
                            <c:forEach var="time" items="${times}">
                                <c:choose>
                                    <c:when test="${skip > 0}">
                                        <c:set var="skip" value="${skip-1}" />
                                    </c:when>
                                    <c:otherwise>
                                        <c:set var="key" value="${date} ${time}" />
                                        <c:set var="class" value="${classes[key]}" />
                                        <c:choose>                            
                                            <c:when test="${not empty class}">
                                                <c:set var="skip" value="${class.classLength - 1}" />
                                                <td colspan="${class.classLength}">${class.classType.className}</td>
                                            </c:when>
                                            <c:otherwise><td>&nbsp;</td></c:otherwise>
                                        </c:choose>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </tr>
                    </c:forEach>            
                </table>
            </div>
        
        <jsp:include page="common/footer.jsp" />
    </body>
</html>
