package com.sbs.example;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbs.example.util.Util;

@WebServlet("/home/gugudan")
public class GugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");

		int dan = Util.pi(request.getParameter("dan"), 2);
		int limit = Util.pi(request.getParameter("limit"), 9);

//		response.getWriter().println(Util.f("<h1>== 구구단 %d단 ==</h1>", dan));
//
//		for (int i = 1; i <= limit; i++) {
//			response.getWriter().println(Util.f("<div>%d * %d = %d</div>", dan, i, dan * i));
//		}

		request.setAttribute("dan", dan); // 변수명은 임의로 선택 가능, jsp에 넘겨줄 변수 선언
		request.setAttribute("limit", limit); // 변수명은 임의로 선택 가능, jsp에 넘겨줄 변수 선언

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/home/gugudan.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}