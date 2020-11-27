package pers.java.freemarker;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;
import pers.java.freemarker.entity.Computer;

public class FreemarkerSample1 {

	public static void main(String[] args) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
		// TODO Auto-generated method stub
		//1 ����ģ��
		//�����������ö���
		Configuration config = new Configuration(Configuration.VERSION_2_3_30);
		//���ü���Ŀ¼
		config.setClassForTemplateLoading(FreemarkerSample1.class, "");
		//�õ�ģ�����
		Template t = config.getTemplate("sample1.ftl");
		//2 ��������
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("site", "�ٶ�");
		data.put("url", "http://www.baidu.com");
		Map info = new HashMap();
		info.put("cpu", "i5");
		Computer c1 = new Computer("12345","ThinkPad",1,"lin",new Date(),12321300f,info);
		data.put("computer", c1);
		//�������
		//LinkedHashMap ˳�򱣴� 
		t.process(data, new OutputStreamWriter(System.out));
	}

}
