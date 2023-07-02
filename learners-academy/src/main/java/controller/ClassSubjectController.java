package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClassSubjectDao;
import DAOImpl.ClassSubjectDaoImpl;
import model.ClassSubject;

@WebServlet("/class-subject-controller")
public class ClassSubjectController extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
        //
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ClassSubjectDao classSubjectDao = null;
        try {
            classSubjectDao = new ClassSubjectDaoImpl();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        List<ClassSubject> classSubjectsList = null;

        try {
            classSubjectsList = classSubjectDao.getAllClassSubjects();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        request.setAttribute("classSubjectsList", classSubjectsList);
        request.getRequestDispatcher("classSubjects.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }

    public void destroy() {
    }
}
