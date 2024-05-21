<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<style>
	h1 {
	text-align: center;
}
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.container {
	width: 50%;
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

form {
	margin-top: 20px;
}

label {
	display: block;
	margin-bottom: 5px;
	font-weight: bold;
}

input[type="text"] {
	width: 100%;
	padding: 8px;
	margin-bottom: 10px;
	box-sizing: border-box;
	border: 1px solid #ccc;
	border-radius: 4px;
}

input[type="submit"] {
	width: 100%;
	padding: 10px;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}

input[type="submit"]:focus {
	outline: none;
}

.error {
	color: red;
	margin-top: 5px;
}
</style>
</head>
<body>
       <h1>Update Trainee</h1>
	<form action="updatetrainee" method="post">
		<label for="id">Trainee_ID :</label>
		 <input type="number" id="id" name="id" required> <br> <br> 
		 <label for="name">Trainee_Name :</label> 
		 <input type="text" id="name" name="name" required> <br> <br> 
		 <label for="email">Email:</label> <input type="text" id="email" name="email" required>
		  <br> <br>
		  <label for="mob_no">Mobile Number:</label>
		  <input type="text" id="author" name="mob_no" required> <br> <br> 
		  <label for="college_name">College Name :</label> 
		  <input type="text" id="issue_by" name="college_name" required> <br> <br>
		  <label for="city">City :</label> 
		  <input type="text" id="city" name="city" required> <br> <br> 
		   <input type="submit" value="Update Trainee">
	</form>
</body>
</html>