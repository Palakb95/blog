 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<body>

<form:form action = "processForm" modelAttribute = "student">

FirstName is : <form:input path = "firstname"/>

<br> </br>
LastName is : <form:input path = "lastname"/>

<br></br>

<input type = "submit" value = "submit"/>
</form:form>

</body>





</html>