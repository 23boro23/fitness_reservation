<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create gym</title>
        <link rel="stylesheet" type="text/css" href="/fitness_reservation-web/style/main.css" />
    </head>
    <body>
        
        <div id="layout">
            
            <jsp:include page="../common/header.jsp" />
            
            <div id="main">
                <h1>Create gym</h1>

                <form:form action="/fitness_reservation-web/admin/gym" method="POST" commandName="gymFormBean">
                    <table>
                        <tr>
                            <th><form:label path="name">Name: </form:label></th>
                            <td><form:input path="name" id="name" size="15" /></td>
                        </tr>
                        <tr>
                            <th><form:label path="capacity">Capacity: </form:label></th>
                            <td><form:input path="capacity" id="capacity" size="4" /></td>
                        </tr>
                        <tr>
                            <td>&nbsp;</td>
                            <td><input type="submit" value="Create" /></td>
                        </tr>
                    </table>
                </form:form>
            </div>
            
        <jsp:include page="../common/footer.jsp" />
    </body>
</html>
