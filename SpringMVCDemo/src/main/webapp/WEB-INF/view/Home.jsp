<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f4f4f4;
}

.container {
	width: 80%;
	margin: 0 auto;
	padding: 20px;
}

#header {
	background-color: red;
	color: #fff;
	text-align: center;
	padding: 10px;
}

h1 {
	text-align: center;
}

p {
	text-align: center;
}

ul {
	list-style-type: none;
	padding: 0;
	text-align: center;
}

ul li {
	display: inline-block;
	margin-right: 20px;
}

ul li a {
	text-decoration: none;
	color: #333;
	font-weight: bold;
}

ul li a:hover {
	color: #555;
}
</style>
</head>
<body>
	<div id="header"></div>
	<h1>Trainee Management System</h1>
	<br>
	<p>Welcome to Trainee Management System !!!!!</p>
	<ul>
		<li><a href="alldetails">View all details</a></li>
		<li><a href="add">Add details</a></li>
		<li><a href="update">Update Details </a></li>
		<li><a href="delete">Delete By ID</a></li>
	</ul>
</body>
</html>