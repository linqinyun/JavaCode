package pers.java.web.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import pers.java.domain.User;

/**
 * Application Lifecycle Listener implementation class InitServletContextListener
 *
 */
@WebListener
public class InitServletContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public InitServletContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("项目数据初始化了");
         // TODO Auto-generated method stub
    	List<User> userList = new ArrayList<User>();
    	sce.getServletContext().setAttribute("userList", userList);
    	
    	
    }
	
}
