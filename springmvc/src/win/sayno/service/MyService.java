package win.sayno.service;

import java.util.Locale;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import win.sayno.label.Property;
import win.sayno.parent.ParentBean;

public class MyService implements ApplicationContextAware {
	
	private Property property;
	
	private ApplicationContext applicationContext;
	
	public void doService () {
		System.out.println("do something...");
	}
	
	public void getMessage() {
		Object[] params = {"sayno.win"};
		System.out.println(this.applicationContext.getMessage("spring", params, Locale.getDefault()));
		System.out.println(this.applicationContext.getMessage("spring", params, Locale.SIMPLIFIED_CHINESE));
		System.out.println(this.applicationContext.getMessage("spring", params, Locale.TRADITIONAL_CHINESE));
	}

	public void init() {
		property = (Property) applicationContext.getBean("myProperty");
		System.out.println(property.toString());
		
		System.out.println(((ParentBean) applicationContext.getBean("childBean1")).toString());
		System.out.println(((ParentBean) applicationContext.getBean("childBean2")).toString());
		System.out.println(((ParentBean) applicationContext.getBean("childBean3")).toString());
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}
	
}
