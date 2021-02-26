package pers.java.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pers.java.domain.User;
import pers.java.service.UserService;
import pers.java.service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String code1 = (String)request.getSession().getAttribute("KAPTCHA_SESSION_KEY");
		String code2 = request.getParameter("checkCode");
		if(code2 ==null || !code2.equalsIgnoreCase(code1)) {
			request.setAttribute("msg", "��֤�벻��ȷ");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return;
		}
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		UserService userService = new UserServiceImpl();
		List<User> userList = (List)getServletContext().getAttribute("userList");
		User existUser = userService.login(userList,user);
		if(existUser == null) {
			request.setAttribute("msg", "�û������������");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else {
			request.getSession().setAttribute("existUser", existUser);
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		// �ڴ�������һ��ͼƬ
		// ������ͼƬ�����ñ���ɫ�����Ʊ߿�
		// ����������ĸ���ĸ�����֣�д��ͼƬ��
		// ���ڴ��е�ͼƬ���������
	}

}
