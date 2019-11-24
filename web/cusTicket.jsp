<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <meta charset="UTF-8">
    <title>Printer ut kundens billett</title>

<body>
<div class="wrap">
    <section>
    <div class="container">
        <table class="table table-hover">
            <thead>
            <tr>

                <th>
                    Informasjon
                </th>
            </tr>
            </thead>
            <div id="CustomerInfo">
                <tr>
                <td>
            <jsp:useBean id="customer" scope="session" type="servlets.customers.Customer"/>
            <c:out value="${customer.firstName}"/>
            <c:out value="${customer.lastName}"/>

            <jsp:useBean id="tickets" scope="session" type="java.util.List"/>
                <c:forEach items="${tickets}" var="tickets">
                <c:out value="${tickets.gate}"/>
                <c:out value="${tickets.flightTo}"/>
                <c:out value="${tickets.flightFrom}"/>
                </td>
                <td>

                    <form action="TicketServlet" method="post">
                        <input type="hidden" name="action" value="delete">
                        <input type="hidden" name="cus_id" value="${customer.customerID}">
                        <input type="hidden" name="tic_id" value="${tickets.ticketID}">
                        <button class="button" type="submit"> Slett </button>
                    </form>

                </td>
             </c:forEach>
    </div>


            </tr>
        </table>
    </div>
    </section>
</div>
</body>
</html>
