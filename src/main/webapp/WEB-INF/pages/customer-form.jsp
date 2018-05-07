<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Customer Form Validator</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<form:form action="processCustomer" modelAttribute="customer">
    Имя <form:input path="firstName"/>
    <br>
    Фамилия <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    Купоны<form:input path="coupons"/>
    <form:errors path="coupons" cssClass="error"/>
    <br>
    Индекс<form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br>
    <input type="submit"/>
</form:form>

</body>
</html>
