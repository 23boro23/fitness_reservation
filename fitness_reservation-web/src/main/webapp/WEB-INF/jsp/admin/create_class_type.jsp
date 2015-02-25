<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New class type</title>
        <link rel="stylesheet" type="text/css" href="/fitness_reservation-web/style/main.css" />
    </head>
    <body>
        <div id="layout">

            <jsp:include page="../common/header.jsp" />

            <div id="main">
                <h1>Create class type</h1>

                <form:form action="/fitness_reservation-web/admin/classType" method="POST" commandName="classTypeFormBean">
                    <table>
                        <tr>
                            <th>Name: </th>
                            <th><form:input path="name" maxlength="50" /></th>
                        </tr>
                        <tr>
                            <th>Color: </th>
                            <th><form:input path="color" maxlength="7" /></th>
                        </tr>
                        <tr>
                            <th>&nbsp;</th>
                            <th><input type="submit" value="Save" /></th>
                        </tr>
                    </table>
                </form:form>
            </div>
        
        <jsp:include page="../common/footer.jsp" />

    </body>
</html>
