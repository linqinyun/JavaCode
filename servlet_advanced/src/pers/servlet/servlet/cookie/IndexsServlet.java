package pers.servlet.servlet.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexsServlet
 */
@WebServlet("/cookie/index")
public class IndexsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Cookie[] cs = request.getCookies();
			for(Cookie c:cs) {
				if(c.getName().equals("user")) {
					System.out.println(c.getName()+":"+c.getValue());
				}
			}
		}catch(NullPointerException e) {
			e.printStackTrace();
		}finally{
			System.out.println("null pointer exception error");
		}

	}



}
