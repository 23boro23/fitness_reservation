<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New trainer</title>
        <link rel="stylesheet" type="text/css" href="/fitness_reservation-web/style/main.css" />
    </head>
    <body>
        <div id="layout">

            <jsp:include page="../common/header.jsp" />

            <div id="main">
                <h1>Create trainer</h1>

                <form:form action="/fitness_reservation-web/admin/trainer" method="POST" commandName="trainerFormBean">
                    <table>
                        <tr>
                            <th>Full name: </th>
                            <th><form:input path="fullName" maxlength="50" /></th>
                        </tr>
                        <tr>
                            <th>Email: </th>
                            <th><form:input path="contactFormBean.email" maxlength="100" /></th>
                        </tr>
                        <tr>
                            <th>Phone No: </th>
                            <th><form:input path="contactFormBean.phoneNo" maxlength="40" /></th>
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
