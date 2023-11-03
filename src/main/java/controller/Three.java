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

  @WebServlet("/three")
 public class Three extends HttpServlet {
 	
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/views/three.jsp");
 		rd.forward(request, response);
 	}

 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	
 		request.setCharacterEncoding("utf-8");
 		String hand =request.getParameter("hand"); //チェックボックスの結果取得
 		
 		if ( hand == null || hand.isEmpty()) {
 			String error = "出す手を選んでから「ぽん！を押してね";
 			request.setAttribute("error",error);
 			String view = "/WEB-INF/views/three.jsp";
 	         request.getRequestDispatcher(view).forward(request, response);
 		} else {
 		
 		
 		int userHand=Integer.parseInt(hand); //結果を文字列から整数へ変換
 		
 		Random random1 = new Random(); // ランダムにするメソッド
 		int pcHand1 = random1.nextInt(3);
 		
 		Random random2 = new Random(); // ランダムにするメソッド
 		int pcHand2 = random2.nextInt(3);
 	
 		String result;
 		String myimg = null;
 		String pcimg1 = null;
 		String pcimg2 = null;
 		
 		if(
// 			userHand == 0 &&  pcHand1 == 1 && pcHand2 ==2) {
// 			result="あいこです";
// 		}else if( userHand == 0 &&  pcHand1 == 2 && pcHand2 ==1) {
// 			result="あいこです";
// 		}else if( userHand == 1 &&  pcHand1 == 0 && pcHand2 ==2) {
// 			result="あいこです";
// 		}else if( userHand == 1 &&  pcHand1 == 2 && pcHand2 ==0) {
// 			result="あいこです";
// 		}else if( userHand == 2 &&  pcHand1 == 0 && pcHand2 ==1) {
// 			result="あいこです";
// 		}else if( userHand == 2 &&  pcHand1 == 1 && pcHand2 ==0) {
// 			result="あいこです";
// 		}else if( 
 				userHand == 0 &&  pcHand1 == 0 && pcHand2 ==1) {
 			result="あなたとPC1の勝ちです";
 		}else if( userHand == 0 &&  pcHand1 == 0 && pcHand2 ==2) {
 			result="あなたの負けです（PC2の勝ち)";
 		}else if( userHand == 0 &&  pcHand1 == 1 && pcHand2 == 0) {
 			result="あなたとPC2の勝ちです";
 		}else if( userHand == 0 &&  pcHand1 == 1 && pcHand2 == 1) {
 			result="あなたの勝ちです";
 		}else if( userHand == 0 &&  pcHand1 == 2 && pcHand2 == 0) {
 			result="あなたの負けです（PC1の勝ち)";
 		}else if( userHand == 0 &&  pcHand1 == 2 && pcHand2 == 2) {
 			result="あなたの負けです<br>（P2とPC2の勝ち)";
 		}else if( userHand == 1 &&  pcHand1 == 0 && pcHand2 ==0) {
 			result="あなたの負けです<br>（PC2とPC2の勝ち)";
 		}else if( userHand == 1 &&  pcHand1 == 0 && pcHand2 ==1) {
 			result="あなたの負けです（PC1の勝ち)";
 		}else if( userHand == 1 &&  pcHand1 == 1 && pcHand2 == 0) {
 			result="あなたの負けです（PC2の勝ち)";
 		}else if( userHand == 1 &&  pcHand1 == 1 && pcHand2 == 2) {
 			result="あなたとPC1の勝ちです";
 		}else if( userHand == 1 &&  pcHand1 == 2 && pcHand2 == 1) {
 			result="あなたとPC2の勝ちです";
 		}else if( userHand == 1 &&  pcHand1 == 2 && pcHand2 == 2) {
 			result="あなたの勝ちです";
 		} else if( userHand == 2 &&  pcHand1 == 0 && pcHand2 ==0) {
 			result="あなたの勝ちです";
 		}else if( userHand == 2 &&  pcHand1 == 0 && pcHand2 ==2) {
 			result="あなたとPC2の勝ちです";
 		}else if( userHand == 2 &&  pcHand1 == 1 && pcHand2 == 1) {
 			result="あなたの負けです<br>（PC1とPC2の勝ち)";
 		}else if( userHand == 2 &&  pcHand1 == 1 && pcHand2 == 2) {
 			result="あなたの負けです（PC1の勝ち)";
 		}else if( userHand == 2 &&  pcHand1 == 2 && pcHand2 == 0) {
 			result="あなたとPC1の勝ちです";
 		}else if( userHand == 2 &&  pcHand1 == 2 && pcHand2 == 1) {
 			result="あなたの負けです（PC2の勝ち)";
 		} else {
 			result="あいこです";
 		}
 
 		
 		String myHandStr = String.valueOf(userHand);
        String pcHandStr1 = String.valueOf(pcHand1);
        String pcHandStr2 = String.valueOf(pcHand2);
        
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
        
        if( pcHandStr1.equals("0")) {
        	pcHandStr1 = "グー";
        	pcimg1 = "janken_gu.png";
        }else if( pcHandStr1.equals("1")) {
        	pcHandStr1 = "チョキ";
        	pcimg1 = "janken_choki.png";
        }else if( pcHandStr1.equals("2")) {
        	pcHandStr1 = "パー";
        	pcimg1 = "janken_pa.png";
        }
        
        if( pcHandStr2.equals("0")) {
        	pcHandStr2 = "グー";
        	pcimg2 = "janken_gu.png";
        }else if( pcHandStr2.equals("1")) {
        	pcHandStr2 = "チョキ";
        	pcimg2 = "janken_choki.png";
        }else if( pcHandStr2.equals("2")) {
        	pcHandStr2 = "パー";
        	pcimg2 = "janken_pa.png";
        }

        request.setAttribute("myHand", myHandStr);
        request.setAttribute("pcHand1", pcHandStr1);
        request.setAttribute("pcHand2", pcHandStr2);
        request.setAttribute("myimg", myimg);
        request.setAttribute("pcimg1", pcimg1);
        request.setAttribute("pcimg2", pcimg2);
 		request.setAttribute("result",result);
 		
 		String view = "/WEB-INF/views/three_result.jsp";
         request.getRequestDispatcher(view).forward(request, response);
 		}
 	}
}
