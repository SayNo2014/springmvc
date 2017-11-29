package win.sayno.context;

import org.springframework.web.context.support.XmlWebApplicationContext;

import win.sayno.processor.MyBeanFactoryPostProcessor;

public class MyXmlWebApplicationContext extends XmlWebApplicationContext {
	
	public MyXmlWebApplicationContext() {
		super();
		System.out.println("×Ô¶¨ÒåApplicationContext");
		this.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
	}
}
