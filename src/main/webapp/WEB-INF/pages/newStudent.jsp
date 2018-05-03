<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cool student page</title>
</head>
<body>
<h2>student student tell me your name</h2>
<form:form action="processStudent" modelAttribute="student">
    <form:input path="firstName"/>
    <br><br>
    <form:input path="lastName"/>
    <br>
    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <input type = "submit"/>

    OperatingSystems
    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Finus <form:checkbox path="operatingSystems" value="Finus"/>
    Penis <form:checkbox path="operatingSystems" value="Penis"/>
</form:form>
</body>
</html>
