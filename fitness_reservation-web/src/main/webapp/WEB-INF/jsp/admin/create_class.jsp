<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create class</title>
        <link rel="stylesheet" type="text/css" href="/fitness_reservation-web/style/main.css" />
        <link rel="stylesheet" type="text/css" href="../style/jquery.datetimepicker.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>        
        <script src="../js/jquery.datetimepicker.js"></script>
        <script>
            $(document).ready(function() {
                //https://github.com/xdan/datetimepicker/blob/master/index.html
                $('#start, #end').datetimepicker({
                    dayOfWeekStart : 1,
                    lang:'en',
                    format: 'd.m.Y H:i'
                });
            });
        </script>
        <style>
            .ui-datepicker-trigger { width: 25px; height: 25px; cursor: pointer; vertical-align: middle; }
            .date { text-align: right; }
        </style>
    </head>
    <body>
        
        <div id="layout">
            
            <jsp:include page="../common/header.jsp" />
            
            <div id="main">
                <h1>Create class</h1>

                <form:form action="/fitness_reservation-web/admin/gymClass" method="POST" commandName="gymClassFormBean">
                    <table>
                        <tr>
                            <th><form:label path="classType" >Class type: </form:label></th>
                            <td>
                                <select name="classType">
                                    <c:forEach var="classType" items="${classTypes}">
                                        <option value="${classType.id}">${classType.className}</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <th><form:label path="start" >Start: </form:label></th>
                            <td><form:input path="start" id="start" class="date" size="12" /></td>
                        </tr>
                        <tr>
                            <th><form:label path="end">End: </form:label></th>
                            <td><form:input path="end" id="end" class="date" size="12" /></td>
                        </tr>
                        <tr>
                            <th>Trainer</th>
                            <td>
                                <select name="trainer">
                                    <option value=""></option>
                                    <c:forEach var="trainer" items="${trainers}">
                                        <option value="${trainer.id}">${trainer.name}</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <th>Gym</th>
                            <td>
                                <select name="gym">
                                    <option value=""></option>
                                    <c:forEach var="gym" items="${gyms}">
                                        <option value="${gym.id}">${gym.name} (${gym.capacity})</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td><input type="submit" value="Add" /></td>
                        </tr>
                    </table>
                </form:form>
            </div>
            
        <jsp:include page="../common/footer.jsp" />
    </body>
</html>
