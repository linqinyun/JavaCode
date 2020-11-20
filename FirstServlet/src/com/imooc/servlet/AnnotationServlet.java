package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/anno")
public class AnnotationServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.getWriter().println("test");
//		启动时加载servlet：web.xml使用<load-on-startup>设置启动加载
//		<load-on-startup>0~9999</load-on-startup>（必须是一个大于等于0的数，推荐使用0~9999，值越小优先级越高）
//		启动时加载在工作中常用于系统的预处理
//		或
//		在注解中设置启动时加载servlet：
//		@WebServlet(urlPatterns="/unused" , loadOnStartup=2)
//		单独加一个loadOnStartup参数是无效的，必须有urlPatterns参数，无论urlPatterns参数是否需要使用
//		一般来说，启动时加载和servlet中的init()方法配合使用，  
	}
}
