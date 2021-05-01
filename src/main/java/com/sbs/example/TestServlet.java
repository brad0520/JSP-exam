package com.sbs.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbs.example.dto.Article;

@WebServlet("/home/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");

		int num = 14;
		int age = 36;
	    int n = 4;
	    int m = 12;
	    int limit = 10;
	    int y = 5;

	    List<Article> articles = new ArrayList<>();
	    
	    Article a1 = new Article("제목1", "내용1");
	    Article a2 = new Article("제목2", "내용2");
	    Article a3 = new Article("제목3", "내용3");
	    
	    articles.add(a1);
	    articles.add(a2);
	    articles.add(a3);
	    
		// 변수명은 임의로 선택 가능, jsp에 넘겨줄 변수 선언
		request.setAttribute("num", num); 
		request.setAttribute("age", age);
		request.setAttribute("n", n);
		request.setAttribute("m", m);
		request.setAttribute("limit", limit);
		request.setAttribute("y", y);
		request.setAttribute("articles", articles);
		
		// 변수에 담은 정보를 jsp에 dispatcher로 전
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home/JSTL_test.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}