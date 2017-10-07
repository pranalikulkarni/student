<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert.obj">
<h1>New Student Score updated form</h1>
<table>
<tr>
	<td>Student Name</td>
	<td><input type="text" name="studname" id="studname"></td>
</tr>

<tr>
	<td>Age</td>
	<td><input type="text" name="age" id="age" ></td>
</tr>

<tr>
	<td>state</td>
	<td><input type="text" name="state" id="state"></td>
</tr>

<tr>
	<td>gender</td>
	<td><input type="text" name="gender" id="gender"></td>
</tr>

<tr>
	<td>No of Subjects scored Centum</td>
	<td><input type="text" name="score" id="score"></td>
</tr>

<tr>
	<td>No Of attempts</td>
	<td><input type="text" name="attempts" id="attempts"></td>
</tr>

<tr>
	<td>Total subject score</td>
	<td><input type="text" name="total" id="total"></td>
</tr>

<tr>
	<td><input type="submit" value="Submit student data"></td>
</tr>

</table>
</form>
</body>
</html>