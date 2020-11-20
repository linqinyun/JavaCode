package com.imooc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse respones) throws ServletException, IOException {
		String name = request.getParameter("name");
		String html = "<h1 style='color:red'>h1,"+name+"!</hr><hr>";
		PrintWriter out = respones.getWriter();
		out.println(html);
	}
	
}
