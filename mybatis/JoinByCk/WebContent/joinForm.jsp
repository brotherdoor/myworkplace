<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

	<style type="text/css">
	
		.inline {
            border-left: 4px solid #00008B;
            padding: 3px;
		}
		tr {
   			height: 20px;
		}
		div {
			display: table; 
			margin-left: auto; 
			margin-right: auto;
		}
	
	
	</style>



</head>
<body>
<div>
	<header><h3>유효성 검증(Validation)</h3></header>
	
	<form>
	<table width="400">
		<tr>
			<td class="inline">이름(*)</td>
		</tr>
		<tr>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td class="inline">연락처</td>
		</tr>
		<tr>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td class="inline">이메일</td>
		</tr>
		<tr>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td class="inline">이메일(확인)</td>
		</tr>
		<tr>
			<td><input type="text"></td>
		</tr>
		<tr>
			<td class="inline">재학 유무(*)</td>
		</tr>
		<tr>
			<td><input type="radio" name="enroll" value="y">유&nbsp&nbsp<input type="radio" name="enroll" value="y">무</td>
		</tr>
		<tr>
			<td class="inline">희망 수강 과목(*)</td>
		</tr>
		<tr>
			<td>
				<input type="checkbox" name="enroll" value="jp">제이쿼리&nbsp&nbsp<input type="checkbox" name="enroll" value="html">HTML
				<input type="checkbox" name="enroll" value="web">웹표준&nbsp&nbsp<input type="checkbox" name="enroll" value="js">자바스크립트
			</td>
		</tr>
		<tr>
			<td class="inline">건의사항(*)</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="proposal" size="60" style="height:60px">
			</td>
		</tr>
	</table>
		<br>
		<input type="button" value="제출">
	</form>
</div>
</body>
</html>