<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
		$("#name").keyup(function(){
			if($("#name").val().length < 1){
				
			}
		})
	}
	</script>
</head>
<body>
	<h1>유효성 검증(Validation)</h1>
	<form action="#">
		<table>
			<tr><td>이름</td></tr>
			<tr><td><input type="text" id="name"></td></tr>
			<tr><td>이메일</td></tr>
			<tr><td><input type="text" id="name" style="width: 300px"></td></tr>
			<tr><td>이메일(확인)</td></tr>
			<tr><td><input type="text" id="name" style="width: 300px"></td></tr>
			<tr><td>재학유무</td></tr>
			<tr><td>
				<input type="radio" name="school" id="yes">
                    <label for="yes">유</label>
                <input type="radio" name="school" id="no">
                    <label for="no">무</label>
			</td></tr>
			<tr><td>희망 수강 과목</td></tr>
			<tr><td>
				<input type="checkbox"><label>jQuery</label>
				<input type="checkbox"><label>HTML</label>
				<input type="checkbox"><label>웹표준</label>
				<input type="checkbox"><label>javaScript</label>
			</td></tr>
			<tr><td>건의사항</td></tr>
			<tr><td><textarea id="wish" style="width: 300px; height: 150px"></textarea></td></tr>
		</table>
		<input type="submit" id="submit" value="등록">
	</form>
	
</body>
</html>