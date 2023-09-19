<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Student Form</title>
    </head>

    <body>
        <form:form action="process-form" modelAttribute="student">
            First Name :
            <form:input path="firstName" />
            <br />
            Last Name :
            <form:input path="lastName" />
            <br />
            Country :
            <form:select path="country">

                <!-- <form:option value="Brazil" label="Brazil" />
        <form:option value="France" label="France" />
        <form:option value="India" label="India" />
        <form:option value="Germany" label="Germany" /> -->

                <!-- Using options from the student class-->
                <form:options items="${student.countryOptions}" />

            </form:select>

            <br>
            OS Known :
            <form:checkboxes path="osKnown" items="${student.osOptions}" />
            <br />
            Languages Known :
            <form:radiobuttons path="languageUsed" items="${student.languageOptions}" />

            <input type="submit">
        </form:form>
    </body>

    </html>