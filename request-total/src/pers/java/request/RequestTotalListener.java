package pers.java.request;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

/**
 * Application Lifecycle Listener implementation class RequestTotalListener
 *
 */
@WebListener
public class RequestTotalListener implements ServletContextListener, ServletRequestListener {

	/**
	 * Default constructor.
	 */
	public RequestTotalListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
	 */
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
	 * request监听
	 */
	public void requestInitialized(ServletRequestEvent arg0) {
		HttpServletRequest request = (HttpServletRequest) arg0.getServletRequest();
		String url = request.getRequestURL().toString();
		if (url.endsWith("/rt") == true) {
			return;
		}
		// TODO Auto-generated method stub
		List<String> timeList = (List) arg0.getServletContext().getAttribute("timeList");
		List<Integer> valueList = (List) arg0.getServletContext().getAttribute("valueList");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String time = sdf.format(date);
		if (timeList.indexOf(time) == -1) {
			timeList.add(time);
			valueList.add(1);
			arg0.getServletContext().setAttribute("timeList", timeList);
			arg0.getServletContext().setAttribute("valueList", valueList);
		} else {
			int index = timeList.indexOf(time);
			int value = valueList.get(index);
			valueList.set(index, value + 1);
			arg0.getServletContext().setAttribute("valueList", valueList);
		}
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 * 销毁
	 */
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 * context初始化
	 */
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		List timeList = new ArrayList();
		List valueList = new ArrayList();
		arg0.getServletContext().setAttribute("timeList", timeList);
		arg0.getServletContext().setAttribute("valueList", valueList);
		System.out.println("请求分析初始化");
	}

}
