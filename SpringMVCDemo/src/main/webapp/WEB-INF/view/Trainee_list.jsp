<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.container {
	width: 80%;
	margin: 20px auto;
	padding: 20px;
	background-color: #fff;
	border-radius: 5px;
	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
}

h1 {
	text-align: center;
	color: #333;
}

table {
	width: 100%;
	border-collapse: collapse;
}

th, td {
	border: 1px solid #ccc;
	padding: 8px;
	text-align: left;
}

th {
	background-color: #f2f2f2;
	font-weight: bold;
}

tr:nth-child(even) {
	background-color: #f9f9f9;
}

tr:hover {
	background-color: #f1f1f1;
}
tr td form input[type="submit"]:hover{
background-color:red;
}
</style>
</head>
<body>
<h1>Trainee Details</h1>
 <a href="home">Home</a>
	<table border="1">
		<tr>
			<th>Trainee_ID</th>
			<th>Trainee Name</th>
			<th>Email</th>
			<th>Mobile No.</th>
			<th>College Name</th>
			<th>City</th>
		</tr>
			
		<c:forEach var="trainee" items="${trainees}">
            <tr>
                <td><c:out value="${trainee.id}"/></td>
                <td><c:out value="${trainee.name}"/></td>
                <td><c:out value="${trainee.email}"/></td>
                <td><c:out value="${trainee.mob_no}"/></td>
                <td><c:out value="${trainee.college_name}"/></td>
                <td><c:out value="${trainee.city}"/></td>
            </tr>
        </c:forEach>
	</table>
</body>
</html>