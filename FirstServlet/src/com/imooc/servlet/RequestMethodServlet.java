package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * servlet-��������
 * 1.װ�� web.html
 * 2.���� ���캯��
 * 3.��ʼ��-init()
 * 4.�ṩ����-service() 
 * 5.���ٷ���-destroy()
 */
public class RequestMethodServlet extends HttpServlet {
	public RequestMethodServlet() {
		System.out.println("����start");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// ���س�ʼ��
		System.out.println("init������");
	}
	@Override
	public void destroy() {
		// ����
		System.out.println("destroy is null");
	}
	//get����������ʾ����
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		resp.getWriter().println("<h1 style='color:green'>"+name+"</h1>");
	}
	//post����������ʽ����
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String account = req.getParameter("account");
		String password = req.getParameter("password");
		if( account == null || password == null ) {
			resp.getWriter().println("<h1>not found ���ݲ�����</h1>");
		}
		// ����ʹ��
		if(account=="admin"&&password=="123") {
			resp.getWriter().println("<h1>success login in</h1>");
		}
		resp.getWriter().println("<h1 style='color:red'>"+name+"</h1>");
		resp.getWriter().println("<h1 style='color:black'>" + age + "</h1>");
	}

}
