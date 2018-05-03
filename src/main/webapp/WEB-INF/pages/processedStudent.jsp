<%@ page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>

The student is confirmed ${student.firstName} ${student.lastName}

<br>

Country: ${student.country}

<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
    <li>
        ${temp}
    </li>
    </c:forEach>

</ul>


</body>
</html>
