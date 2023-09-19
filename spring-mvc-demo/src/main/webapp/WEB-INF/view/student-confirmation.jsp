<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Student Confirmation page</title>
        </head>

        <body>
            <h2>The Student is Confirmed</h2>
            <p>Hello ${student.firstName} ${student.lastName}</p>
            <p>Your Country ${student.country} is one of the best</p>
            <p>Language Knows : ${student.languageUsed}</p>

            <h3>Operating System Familliar With :</h3>
            <ul>
                <c:forEach var="temp" items="${student.osKnown}">
                    <li>${temp}</li>
                </c:forEach>
            </ul>
        </body>

        </html>