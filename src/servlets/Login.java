package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
// @WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName, password;
		String defUserName = "kacsa";
		String defPassword = "1234";

		response.setContentType("text/html");

		PrintWriter print = response.getWriter();

		userName = request.getParameter("userName");
		password = request.getParameter("password");

		if (password.equals(defPassword) && userName.equals(defUserName)) {
			print.print("Welcome " + userName + " friend!");
			HttpSession session = request.getSession();
			session.setAttribute("user", userName);
			request.getRequestDispatcher("profile.html").include(request, response);

		} else {
			print.print("Bad username or password!");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		print.close();

	}
}
