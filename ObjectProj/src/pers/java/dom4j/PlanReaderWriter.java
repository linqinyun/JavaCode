package pers.java.dom4j;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class PlanReaderWriter {
	String file ="D:\\eclipseWorkspace\\ObjectProj\\src\\pers\\java\\xml\\plan.xml";
	public void PlanReader() {
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			//获取核心节点
			Element root = document.getRootElement();
			//使用list获取合集
			List<Element> coursePlans = root.elements("course-plan");
			for(Element coursePlan : coursePlans) {
				//提取属性
				Attribute att = coursePlan.attribute("no");
				System.out.println("课程编号："+att.getText());
				//element方法用于获取唯一的子节点对象，elementText=element+getText
				System.out.println("课程名称："+coursePlan.elementText("course-name"));
				System.out.println("课程数："+coursePlan.elementText("teching-plan"));
				System.out.println("考核方式："+coursePlan.elementText("exam-form"));
				System.out.println("=============================================");
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void PlanWriter() {
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			//核心节点
			Element    root = document.getRootElement();
			Element coursePlan = root.addElement("course-plan");
			coursePlan.addAttribute("no", "004");
			coursePlan.addElement("course-name").setText("网络基础");
			coursePlan.addElement("teching-plan").setText("70");
			coursePlan.addElement("exam-form").setText("上级考试");
			//字符写入
			Writer writer = new OutputStreamWriter(new FileOutputStream(file),"utf-8");
			document.write(writer);
			writer.close();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void xpath(String xpathExp) {
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			Element root = document.getRootElement();
			List<Node> nodes = document.selectNodes(xpathExp);
			for(Node node:nodes) {
				Element emp = (Element)node;
				System.out.println("课程编号："+emp.attributeValue("no"));
				//element方法用于获取唯一的子节点对象，elementText=element+getText
				System.out.println("课程名称："+emp.elementText("course-name"));
				System.out.println("课程数："+emp.elementText("teching-plan"));
				System.out.println("考核方式："+emp.elementText("exam-form"));
				System.out.println("=============================================");
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		PlanReaderWriter pr = new PlanReaderWriter();
//		pr.PlanReader();
//		pr.PlanWriter();
//		pr.xpath("//course-plan");
//		pr.xpath("//course-plan[teching-plan<50]");
//		pr.xpath("//course-plan[course-name='高等数学']");
//		pr.xpath("//course-plan[@no='001']");
//		pr.xpath("//course-plan[position()<3]");
	}
}
