package pers.java.web.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import pers.java.domain.User;
import pers.java.service.UserService;
import pers.java.service.impl.UserServiceImpl;
import pers.java.utils.UploadUtils;

/**
 * Servlet implementation class RegistServlet
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String> map = new HashMap<String,String>();
		
		DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
		ServletFileUpload fileUpload = new ServletFileUpload(diskFileItemFactory);
		try {
			List<FileItem> list = fileUpload.parseRequest(request);
			for(FileItem fileItem:list) {
				if(fileItem.isFormField()) {
					// 普通项
					String name = fileItem.getFieldName();
					String value = fileItem.getString("UTF-8");
					map.put(name, value);
				}else{
					// 文件
					String fileName = fileItem.getName();
					String uuidFileName = UploadUtils.getUuidFileName(fileName);
					InputStream is = fileItem.getInputStream();
					String path = getServletContext().getRealPath("/upload");
					String url = path+"\\"+uuidFileName;
					map.put("path", request.getContextPath()+"/upload/"+uuidFileName);
					OutputStream os = new FileOutputStream(url);
					int len = 0;
					byte[] b = new byte[1024];
					while((len = is.read(b))!=-1) {
						os.write(b, 0, len);
					}
					os.close();
					is.close();
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
		User user = new User();
		user.setUsername(map.get("username"));
		user.setPassword(map.get("password"));
		user.setPath(map.get("path"));
		System.out.println(user);
		UserService userService = new UserServiceImpl();
		userService.regist((List<User>)request.getServletContext().getAttribute("userList"), user);
		System.out.println((List<User>)request.getServletContext().getAttribute("userList"));
		//path
		response.sendRedirect(request.getContextPath()+"/login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
