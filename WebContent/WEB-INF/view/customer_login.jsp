<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix ="c"%>

<!DOCTYPE html>

<html>


<body>   
<div id = "wrapper">
<div id = "header"> <h2>CRM-MANAGEMENT</h2></div>
</div>

<div id ="container">     
<div id = "content">
<table>

<tr>
<th> First Name </th>
<th> Last Name </th>
<TH> Email </TH>

</tr>
<c:forEach var = "tempCustomer" items = "${customers}">
<tr>
<td> ${tempCustomer.firstname} </td>
<td>    ${tempCustomer.lastname}  </td>
<td>  ${tempCustomer.email}  </td>
</tr>
</c:forEach>

</table>


</div>

</div>
</body>




</html>