<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
	integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<h1>응답 처리</h1>
	<button id="btn1">/es46/sub01</button>
	<br>
	<button id="btn4">/ex46/sub03</button>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
	<script>
const ctx = "${pageContext.request.contextPath}";

document.querySelector("#btn4").addEventListener("click", function() {
	fetch(ctx + "/ex46/sub01")
	.then(function() {
		
		return "a";
	})
	.then(function(v) {
		// 코드 작성
		
		return v + "b";
	})
	.then(function(v) {
		
		console.log(v); // "ab"
	});
});
	document.querySelector("#btn1").addEventListener("click",(() =>{
		console.log("1 statement");
		fetch(ctx + "/ex46/sub01").then(() =>{
			console.log("응답 후 실행해야 하는 코드");
		})
	}));
	
</script>
</body>
</html>