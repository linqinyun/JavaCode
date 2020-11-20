package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * servlet-生命周期
 * 1.装载 web.html
 * 2.创建 构造函数
 * 3.初始化-init()
 * 4.提供服务-service() 
 * 5.销毁方法-destroy()
 */
public class RequestMethodServlet extends HttpServlet {
	public RequestMethodServlet() {
		System.out.println("创建start");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// 加载初始化
		System.out.println("init进行中");
	}
	@Override
	public void destroy() {
		// 销毁
		System.out.println("destroy is null");
	}
	//get方法进行显示处理
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		resp.getWriter().println("<h1 style='color:green'>"+name+"</h1>");
	}
	//post方法进行隐式处理
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String account = req.getParameter("account");
		String password = req.getParameter("password");
		if( account == null || password == null ) {
			resp.getWriter().println("<h1>not found 数据不存在</h1>");
		}
		// 测试使用
		if(account=="admin"&&password=="123") {
			resp.getWriter().println("<h1>success login in</h1>");
		}
		resp.getWriter().println("<h1 style='color:red'>"+name+"</h1>");
		resp.getWriter().println("<h1 style='color:black'>" + age + "</h1>");
	}

}
