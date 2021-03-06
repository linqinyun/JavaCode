<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${requestScope.score }</h1>
	<c:if test="${score>=60 }">
		<h1 style="color: green">恭喜你，你已通过测试</h1>
	</c:if>
	<c:if test="${score<60 }">
		<h1 style="color: red">对不起，再接再厉</h1>
	</c:if>

	<!-- choose when otherwise -->
	${grade }
	<c:choose>
		<c:when test="${grade == 'A' }">
			<h2>你很优秀</h2>
		</c:when>
		<c:when test="${grade == 'B' }">
			<h2>不错</h2>
		</c:when>
		<c:when test="${grade == 'C' }">
			<h2>水平一般，需要提高</h2>
		</c:when>
		<c:when test="${grade == 'D' }">
			<h2>需要努力了</h2>
		</c:when>
		<c:otherwise>
			<h2>一切随缘吧</h2>
		</c:otherwise>
	</c:choose>
	<%
		int x = 5;
		request.setAttribute("x", x);
	%>
	${x }
	<c:if test="${x>0 && x<=10 }">
		<h1>1-10之间的整数</h1>
	</c:if>
	<c:if test="${x>10&&x<=20 }">
		<h1>11-20之间的整数</h1>
	</c:if>
	<!-- 星期判断 -->
	<!-- 遍历 -->
	<c:forEach var="p" items="${company }" varStatus="idx">
		<h1>${p.cname }</h1>
		<h1>${p.url }</h1>
	</c:forEach>
	<c:forEach var="w" items="${week }" varStatus="idx">
		<h1>${idx.index+1 }---${w }</h1>
	</c:forEach>
</body>
</html>