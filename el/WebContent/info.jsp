<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "pers.st.el.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>
	<%
		Student stu = (Student)request.getAttribute("student");
		out.println(stu.getName());
		out.println(stu.getMobile());
		out.println(request.getAttribute("grade"));
	%>
	<h1>
		${requestScope.student.name }
		${requestScope.student.mobile }
		${requestScope.grade }
		${requestScope.student }
		${param.teacher }
	</h1>
</body>
</html>