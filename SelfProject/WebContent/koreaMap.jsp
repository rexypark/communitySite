<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<script>

	function start() {

		location.href="MapController?type=start";
	}
</script>
</head>
<body onload="start()">
<%@ include file="../map/map.jsp" %>
<div id="txtBox">
	
	<h1>도 검색</h1>
	<form method="post">
		<select name="idx">
			<option value="0">Busan</option>
			<option value="1">Chungcheongbuk</option>
			<option value="2">Chungcheongnam</option>
			<option value="3">Daegu</option>
			<option value="4">Daejeon</option>
			<option value="5">Gangwon-do</option>
			<option value="6">Gwangju</option>
			<option value="7">Gyeonggi-do</option>
			<option value="8">Gyeongsangbuk-do</option>
			<option value="9">Gyeongsangnam-do</option>
			<option value="10">Incheon</option>
			<option value="11">Jeju-do</option>
			<option value="12">Jeollabuk-do</option>
			<option value="13">Jeollanam-do</option>
			<option value="14">Sejong-si</option>
			<option value="15">Seoul</option>
			<option value="16">Ulsan</option>
		</select>
		<select>
			<option name="si">
		</select>
		
		<input type="button" value="동적검색"
				onclick="#">
	</form>
</div>
</body>
</html>