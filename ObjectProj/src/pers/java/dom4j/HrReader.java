package pers.java.dom4j;

import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class HrReader {
	
	public void readHml() {
		String file ="D:\\eclipseWorkspace\\ObjectProj\\src\\pers\\java\\xml\\hr.xml";
		// 读取xml核心类
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			//获取根节点
			Element root = document.getRootElement();
			//elements获取指定的标签合集
			List<Element> employees = root.elements("employee");
			for(Element employee:employees) {
				//element方法用于获取唯一的子节点对象
				Element name = employee.element("name");
				//文本输出
				String empName = name.getText();
				System.out.println(empName);
				System.out.println(employee.elementText("age"));
				System.out.println(employee.elementText("salary"));
				Element department = employee.element("department");
				System.out.println(department.elementText("dname"));
				System.out.println(department.elementText("address"));
				//提取属性
				Attribute att = employee.attribute("no");
				System.out.println(att.getText());
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HrReader hr = new HrReader();
		hr.readHml();
	}
}
