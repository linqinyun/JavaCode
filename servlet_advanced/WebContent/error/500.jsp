<%@ page contentType="text/html;charset=utf-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>500</h1>
	<%
		String msg = exception.getMessage();
		out.print(msg);
	%>
</body>
</html>