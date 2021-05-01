package com.sbs.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbs.example.util.Util;

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
	    int m = 14;
	    int limit = 11;
	    int y = 10;

		// 변수명은 임의로 선택 가능, jsp에 넘겨줄 변수 선언
		request.setAttribute("num", num); 
		request.setAttribute("age", age);
		request.setAttribute("n", n);
		request.setAttribute("m", m);
		request.setAttribute("limit", limit);
		request.setAttribute("y", y);
		
		// 변수에 담은 정보를 jsp에 dispatcher로 전
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home/test.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}