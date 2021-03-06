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
			$("#btn").click(function(){
				$.ajax({
					url:"getCustomer.do",
					type:"get",
					dataType:"xml",
					success:function(xml){
						var xmlData = $(xml).find("customer");
						var listLength = xmlData.length;
						if(listLength){
							$("#result").empty();
							var contentStr = "";
							$(xmlData).each(function(){
								contentStr += $(this).find("id").text()  + "<br>"
											+ $(this).find("name").text()  + "<br>"
											+ $(this).find("address").text() + "<hr>";
							});
							$("#result").append(contentStr);
						}
					}
				})
			})
		})</script>
</head>
<body>
	<input type="button" id="btn" value="Read XML">
	<hr>
	<div id="result"></div>

</body>
</html>