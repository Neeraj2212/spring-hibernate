<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Customer Confirmation page</title>
        </head>

        <body>
            <h2>The Customer is Confirmed</h2>
            <p>Welcone ${customer.firstName} ${customer.lastName} !!</p>
            <p>Free Passes Allowed to you are ${customer.freePasses}</p>
            <p>Your Postal Code is : ${customer.postalCode}</p>

        </body>

        </html>