<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
String userHand=(String)request.getAttribute("userHand");
userHand=userHand==null? "":userHand;
String pcHand=(String)request.getAttribute("pcHand");
pcHand=pcHand==null? "":pcHand;
String result=(String)request.getAttribute("result");
result=result==null? "":result;

%>
    
<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/title.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Dela+Gothic+One&display=swap" rel="stylesheet">
	<title>じゃんけんしよう</title>
	</head>
	<body>
	<main>
		<div class="game_title">
			<h1 class="title">じゃんけんゲーム</h1>
			<img src="img/janken_title.jpg">
			<div class="people">
				<button class="two_button"><a href="two">２人で遊ぶ</a></button>
				<button class="three_button"><a href="three">３人で遊ぶ</a></button>
			</div>
		</div>
	</main>
	</body>
</html>