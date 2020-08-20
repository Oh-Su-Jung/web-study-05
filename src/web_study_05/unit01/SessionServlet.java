package web_study_05.unit01;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		// 회원 정보를 세션에 저장하기
		//session.setAttribute("loginUser", loginUser);
		
		System.out.println("id : "+ session.getAttribute("id"));
		System.out.println("pwd : "+ session.getAttribute("pwd"));
		System.out.println("age : "+ session.getAttribute("age"));
	}

}
