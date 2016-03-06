package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String defUserName = "kacsa";
		String defPassword = "1234";

		PrintWriter print = response.getWriter();

		userName = request.getParameter("userName");
		password = request.getParameter("password");
		HttpSession session = request.getSession();

		if (password.equals(defPassword) && userName.equals(defUserName)) {
			session.setAttribute("user", userName);
			response.sendRedirect("Profile.jsp");
		} else {
			print.print("Bad username or password!");
			request.getRequestDispatcher("Login.jsp").include(request, response);
		}

	}

}
