package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShopServlet extends HttpServlet{
	//service ºËÐÄ·½·¨
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse respones) throws ServletException, IOException {
		// test
//		String num = request.getParameter("n");
//		int n  = Integer.parseInt(num);
//		int sum = 0;
//		for(int i=1;i<=n;i++) {
//			sum += i;
//		}
//		String html = "<h1>"+sum+"</h1>";
//		PrintWriter writer =  respones.getWriter();
//		writer.println(html);
		String methods = request.getMethod();
		String value1 = request.getParameter("value1");
		String value2 = request.getParameter("value2");
		int n1 = Integer.parseInt(value1);
		int n2 = Integer.parseInt(value2);
		int sum = n1+n2;
		respones.getWriter().println("sum = "+sum+","+methods);
	}

	
	
}
