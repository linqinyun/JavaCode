package pers.java.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class WebListener implements ServletContextListener,HttpSessionListener,ServletRequestListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext������");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext�ѳ�ʼ��");
	}

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		HttpSession session = arg0.getSession();
		System.out.println("session�Ѵ���,sessionId:"+session.getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("session������");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("request������");
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest)arg0.getServletRequest();
		System.out.println("HttpServletRequest�ѱ�����,uri:"+request.getRequestURI());
	}

}
