package com.sbs.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		PrintWriter out = response.getWriter();	

		String inputDan = request.getParameter("dan");
		
		if (inputDan == null || inputDan == "") {
			inputDan = "7";
		}
		
		int dan = Integer.parseInt(inputDan);
		
		out.println("<h3>===" + dan + "단 ===</h3>");

		for (int i=1; i<10; i++) {
//			out.println(dan + " * " + i + " = " + dan*i + "<br>");
			out.println(String.format("<div>%d * %d = %d</div>", dan, i, dan*i)); // 스트링 포맷 이용 방법
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
