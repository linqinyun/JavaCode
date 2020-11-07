package pers.java.dom4j;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class HrWriter {
	
	public void writeXml() {
		String file ="D:\\eclipseWorkspace\\ObjectProj\\src\\pers\\java\\xml\\hr.xml";
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(file);
			Element root = document.getRootElement();
			Element employee = root.addElement("employee");
			employee.addAttribute("no", "3311");
			Element name = employee.addElement("name");
			name.setText("test3");
			employee.addElement("age").setText("37");
			employee.addElement("salary").setText("3999");
			Element department = employee.addElement("department");
			department.addElement("dname").setText("测试");
			department.addElement("address").setText("xxxx");
			Writer writer = new OutputStreamWriter(new FileOutputStream(file),"utf-8");
			document.write(writer);
			writer.close();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch	(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		HrWriter hr = new HrWriter();
		hr.writeXml();
	}
}
