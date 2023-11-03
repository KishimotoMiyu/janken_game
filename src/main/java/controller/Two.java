 package controller;

 import java.io.IOException;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 /**
  * Servlet implementation class Game_title
  */

  @WebServlet("/two")
 public class Two extends HttpServlet {
 	
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/two.jsp");
 		rd.forward(request, response);
 	}

 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	
 		request.setCharacterEncoding("utf-8");
 		String hand =request.getParameter("hand"); //チェックボックスの結果取得
 		
 		if ( hand == null || hand.isEmpty()) {
 			String error = "出す手を選んでから「ぽん！を押してね";
 			request.setAttribute("error",error);
 			String view = "/WEB-INF/views/two.jsp";
 	         request.getRequestDispatcher(view).forward(request, response);
 		} else {
 		
	 		int userHand=Integer.parseInt(hand); //結果を文字列から整数へ変換
	 		Random random = new Random(); // ランダムにするメソッド
	 		int pcHand = random.nextInt(3);
	 	
	 		String result;
	 		String myimg = null;
	 		String pcimg = null;
	 		
	 		int a = (userHand - pcHand + 3) % 3;
	 		if(a == 0){
	 			result="あいこです";
	 		} else if (a == 2){
	 			result="あなたの勝ち";
	 		} else {
	 			result="あなたの負け";
	 		}
	 		
	 		String myHandStr = String.valueOf(userHand);
	        String enemyHandStr = String.valueOf(pcHand);
	        
	        if(myHandStr.equals("0")) {
	        	myHandStr = "グー";
	        	myimg = "janken_gu.png";
	        }else if(myHandStr.equals("1")) {
	        	myHandStr = "チョキ";
	        	myimg = "janken_choki.png";
	        }else if(myHandStr.equals("2")) {
	        	myHandStr = "パー";
	        	myimg = "janken_pa.png";
	        }
	        
	        if( enemyHandStr.equals("0")) {
	        	 enemyHandStr = "グー";
	        	 pcimg ="janken_gu.png";
	        }else if( enemyHandStr.equals("1")) {
	        	 enemyHandStr = "チョキ";
	        	 pcimg ="janken_choki.png";
	        }else if( enemyHandStr.equals("2")) {
	        	 enemyHandStr = "パー";
	        	 pcimg ="janken_pa.png";
	        }
	        		
	 	 		request.setAttribute("myHand", myHandStr);
	 	 	    request.setAttribute("enemyHand", enemyHandStr);
	 	 	    request.setAttribute("myimg", myimg);
	 	 	    request.setAttribute("pcimg", pcimg);
	 	 	 	request.setAttribute("result",result);
	 		
	 		String view = "/WEB-INF/views/two_result.jsp";
	         request.getRequestDispatcher(view).forward(request, response);
 		}
 	}
}
