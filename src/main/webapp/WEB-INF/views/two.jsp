
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/match.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Dela+Gothic+One&display=swap" rel="stylesheet">
<title>じゃんけんしよう</title>
</head>
<body>
	<main>
		<div class="two_game">
		<h1 class="title">２人対戦</h1>
			<p>最初はグー、じゃんけん</p>
			
			<form action="two" method="post">
			<ul>
				<li>
					<input id="gu" type="radio" name="hand" value="0" >
					<label for="gu">グー<img src="img/janken_gu.png" with="40" height="40"></label>
				</li>
				<li>
					<input id="choki" type="radio" name="hand" value="1" >
					<label for="choki">チョキ<img src="img/janken_choki.png" with="40" height="40"></label>
				</li>
				<li>
					<input id="pa" type="radio" name="hand" value="2" >
					<label for="pa">パー<img src="img/janken_pa.png" with="40" height="40"></label>
				</li>	
			</ul>
			<input class="pon" type="submit" value="ぽん！" >
			<p class="error">${error}</p>
			
			</form>
		</div>
	</main>
	
	
</body>
</html>

</body>
</html>