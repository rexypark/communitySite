<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/republic_korea.css">
<style>
	#txtBox {
		position: absolute;
		margin-left: 450px;
	}
</style>
</head>
<body>
<%@ include file="../map/map.jsp" %>
<div id="txtBox">
	
	<h1>인덱스다 도 검색</h1>
	<form method="post">
		<select name="doIdx">
			<c:forEach items="${doList }" var="vo1">
				<option>${vo1.city_en }</option>
			</c:forEach>
			
		</select>
		<select name="siIdx">
			<c:forEach items="${list }" var="vo2">
				<option>${vo2.gun_gu_en }</option>
			</c:forEach>
		</select>
		<input type="text" name="keyword">
		
		<input type="button" value="동적검색"
				onclick="#">
	</form>
</div>
</body>
</html>