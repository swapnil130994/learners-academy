package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dashboard-controller")
public class DashboardController extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,
            ServletException {

        request.getRequestDispatcher("dashboard.jsp").forward(request,response);
    }

    public void destroy() {
    }
}
