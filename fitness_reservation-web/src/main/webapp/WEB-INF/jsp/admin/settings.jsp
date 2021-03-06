<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Settings</title>
        <link rel="stylesheet" type="text/css" href="/fitness_reservation-web/style/main.css" />
    </head>
    <body>
        
        <div id="layout">
            
            <jsp:include page="../common/header.jsp" />
            
            <div id="main">
                <h1>Settings</h1>
                <form:form action="/fitness_reservation-web/admin/settings" method="POST" commandName="settingsFormBean">
                    <table>
                        <tr>
                            <th>Opening hours: </th>
                            <td><form:input path="start" size="5" /> - <form:input path="end" size="5" /></td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td><input type="submit" value="Save" /></td>
                        </tr>
                    </table>
                </form:form>
            </div>
        <jsp:include page="../common/footer.jsp" />
    </body>
</html>
