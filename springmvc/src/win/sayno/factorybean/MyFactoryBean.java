package win.sayno.factorybean;

import win.sayno.dependon.Bean;
import win.sayno.dependon.DefaultBean;
import win.sayno.dependon.MyDependOnBean;

public class MyFactoryBean {
	
	private volatile Bean bean;
	
	public MyFactoryBean() {
		System.out.println("MyFactoryBean≥ı ºªØ...");
	}
	
	public Bean getDependOnBean(String index) {
		if (bean == null) {
			synchronized (MyFactoryBean.class) {
				if ("1".equals(index)) {
					bean = new MyDependOnBean();
					bean.setDesc("SayNo");
				} else {
					bean = new DefaultBean();
					bean.setDesc("SayNo");
				}
			}
		}
		return bean;
	}
}
