package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.LoginService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName, password;

		userName = request.getParameter("userName");
		password = request.getParameter("password");

		LoginService loginService = new LoginService();
		boolean result = loginService.autheticate(userName, password);
		if (result) {
			response.sendRedirect("Profile.html");
			return;
		} else {
			response.sendRedirect("Login.html");
			return;

		}

	}

}
