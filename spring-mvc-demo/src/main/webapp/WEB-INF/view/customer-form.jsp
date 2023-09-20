<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Customer Form</title>
        <style>
            .error {
                color: red;
            }
        </style>
    </head>

    <body>
        <form:form action="process-form" modelAttribute="customer">
            First Name :
            <form:input path="firstName" />
            <br />
            Last Name (*):
            <form:input path="lastName" />
            <form:errors path="lastName" cssClass="error" />
            <br>
            Free Passes :
            <form:input path="freePasses" />
            <form:errors path="freePasses" cssClass="error" />
            <br>
            Postal Code :
            <form:input path="postalCode" />
            <form:errors path="postalCode" cssClass="error" />
            <br>
            <input type="submit">
        </form:form>
    </body>

    </html>