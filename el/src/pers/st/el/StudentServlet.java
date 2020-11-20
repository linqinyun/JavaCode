package pers.st.el;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/info")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super(); 
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teacher = request.getParameter("teacher");
		Student stu = new Student();
		stu.setName("alo");
		stu.setMobile(null);
		String grade = "A";
		// ���Ӷ������Դ���
		request.setAttribute("student", stu);
		request.setAttribute("grade", grade);
		// ת��
		request.getRequestDispatcher("/info.jsp").forward(request, response);
	}

}