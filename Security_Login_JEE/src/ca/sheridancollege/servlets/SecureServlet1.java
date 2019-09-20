package ca.sheridancollege.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecureServlet1
 */
//("/woof")
public class SecureServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("<html><body>Woof woof woof woof");
		
		if(request.isUserInRole("guest")) {
			response.getWriter().append("<br>Welcome guest");
		}
		if(request.isUserInRole("member")) {
			response.getWriter().append("<br>Welcome member");
		}
		if(request.isUserInRole("admin")) {
			response.getWriter().append("<br>Welcome admin");
		}
		if(request.isUserInRole("manager")) {
			response.getWriter().append("<br>Welcome manager");
		}
		response.getWriter().append("<br>Welcome " + request.getUserPrincipal().getName()+ "</body></html>");
	}

}
