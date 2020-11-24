package pers.java.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class DeviceAdapterFilter
 */
public class DeviceAdapterFilter implements Filter {

    /**
     * Default constructor. 
     */
    public DeviceAdapterFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		String uri = req.getRequestURI();
		if(uri.startsWith("/desktop") || uri.startsWith("/mobile")) {
			chain.doFilter(request, response);
		}else {
			 String agent = req.getHeader("user-agent").toLowerCase();
			 String targetURI = "";
			 if(agent.indexOf("android")!=-1|| agent.indexOf("iphone")!=-1) {
				 targetURI = "/mobile"+uri;
				 System.out.println("mobile:"+targetURI);
				 res.sendRedirect(targetURI);
			 }else {
				 targetURI = "/desktop"+uri;
				 System.out.println("PC:"+targetURI);
				 res.sendRedirect(targetURI);
			 }
			 
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
