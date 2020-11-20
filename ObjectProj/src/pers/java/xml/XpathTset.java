package pers.java.xml;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class XpathTset {
	public void xpath(String xpathExp) {
		String file ="D:\\eclipseWorkspace\\ObjectProj\\src\\pers\\java\\xml\\hr.xml";
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			Element root = document.getRootElement();
			List<Node> nodes = document.selectNodes(xpathExp);
			for(Node node:nodes) {
				Element emp = (Element)node;
				System.out.println(emp.attributeValue("no"));
				System.out.println(emp.elementText("name"));
				System.out.println(emp.elementText("age"));
				System.out.println(emp.elementText("salary"));
				System.out.println("========================");
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		XpathTset xt = new XpathTset();
//		xt.xpath("/hr/employee");
//		xt.xpath("//employee");
		xt.xpath("//employee[salary<5000]");
	}
}
