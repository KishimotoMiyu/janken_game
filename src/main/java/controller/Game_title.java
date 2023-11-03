 package controller;

 import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 /**
  * Servlet implementation class Game_title
  */

 @WebServlet("/title")
 public class Game_title extends HttpServlet {
 	
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		RequestDispatcher r=request.getRequestDispatcher("/WEB-INF/views/title.jsp");
 		r.forward(request, response);
 	}

}
