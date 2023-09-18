<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
</body>
</html>