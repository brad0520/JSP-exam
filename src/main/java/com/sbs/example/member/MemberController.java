package com.sbs.example.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sbs.example.servlet.Controller;

public class MemberController extends Controller {
	private MemberDao mdao;
	
	public MemberController() throws IOException {
		mdao = new MemberDao();
	}
	
	public void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = (String)request.getAttribute("action");

		if (action == null) {
			action = "default";
		}

		if (action.equals("showLoginForm.do")) {
			forward(request, response, "member/loginForm");
		} else if (action.equals("doLogin")) {
			String loginId = request.getParameter("loginId");
			String loginPw = request.getParameter("loginPw");

			Member member = new Member();
			member.setLoginId(loginId);
			member.setLoginPw(loginPw);

			Member loginedMember = mdao.getMemberByLoginIdAndLoginPw(member);

			System.out.println(loginedMember);

			if (loginedMember == null) {
				// 에러페이지
				forward(request, response, "error/loginFailed");

			} else {
				HttpSession session = request.getSession();
				session.setAttribute("loginedMember", loginedMember);
				// request.setAttribute("loginedMember", loginedMember);
				response.sendRedirect("TestServlet?action=list");
			}
		} else if (action.equals("doLogout")) {
			HttpSession session = request.getSession();
			session.invalidate();

			response.sendRedirect("TestServlet?action=list");
		}
	}	
}
