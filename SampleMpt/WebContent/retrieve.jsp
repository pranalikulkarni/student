<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"import="java.util.ArrayList, com.cg.student.bean.StudentInfo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<StudentInfo> myList=(ArrayList<StudentInfo>)session.getAttribute("list"); %>
<% for(StudentInfo c:myList){
out.print(c.getStudId());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getStudName());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getGender());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getAge());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getCountry());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getCentum());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getAttempts());
out.print("&nbsp;&nbsp;&nbsp;");
out.print(c.getTotal());
out.print("<br/>");
} %>
</body>
</html>