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
//		����ʱ����servlet��web.xmlʹ��<load-on-startup>������������
//		<load-on-startup>0~9999</load-on-startup>��������һ�����ڵ���0�������Ƽ�ʹ��0~9999��ֵԽС���ȼ�Խ�ߣ�
//		����ʱ�����ڹ����г�����ϵͳ��Ԥ����
//		��
//		��ע������������ʱ����servlet��
//		@WebServlet(urlPatterns="/unused" , loadOnStartup=2)
//		������һ��loadOnStartup��������Ч�ģ�������urlPatterns����������urlPatterns�����Ƿ���Ҫʹ��
//		һ����˵������ʱ���غ�servlet�е�init()�������ʹ�ã�  
	}
}
