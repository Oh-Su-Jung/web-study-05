package web_study_05.unit02;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		
		String id = "pinksung";
		String pwd = "1234";
		String name = "¼ºÀ±Á¤";
		
		session.setAttribute("id", request.getParameter("id"));
		session.setAttribute("pwd", request.getParameter("pwd"));
		session.setAttribute("name", name);
		
		if (id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))) {
			response.sendRedirect("login/10_main.jsp");
		} else {
			response.sendRedirect("login/10_loginForm.jsp");
		}
	}

}
