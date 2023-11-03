<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Dela+Gothic+One&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="css/three_result.css"> 
	<title>じゃんけんしよう</title>
</head>
<body>
	<main>
		<div class="game_title">
			<h1 class="title">けっかはっぴょう</h1>
			<div>
				<ul>
					<li class="hand">
						<p>あなたは ${myHand}</p>
						<img src="img/${myimg}"  with="80" height="80">
					</li>			
					<li class="hand" > 
						<p>PC1は ${pcHand1}</p>
						<img src="img/${pcimg1}"  with="80" height="80">
					</li>
					<li class="hand" > 
						<p>PC2は ${pcHand2}</p>
						<img src="img/${pcimg2}"  with="80" height="80">
					</li>
				</ul>
			</div>
			
			<p><strong>結果:</strong><br><span>${result}</span></p>
			
			<nav>
			   <ul>
			   		<li><button class="three"><a href="three">もう一度３人対戦</a></button></li>
					<li><button class="two"><a href="two">２人対戦をする</a></button></li>
					<li><button class="title_back"><a href="title">タイトルに戻る</a></button></li>
			   </ul>
			</nav>
			
			
			
		</div>
	</main>
</body>
</html>