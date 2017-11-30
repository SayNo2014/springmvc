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
		if ("1".equals(index)) {
			if (bean == null) {
				bean = new MyDependOnBean();
				bean.setDesc("SayNo");
			}
		} else {
			if (bean == null) {
				bean = new DefaultBean();
				bean.setDesc("SayNo");
			}
		}
		return bean;
	}

	public Bean getBean() {
		return bean;
	}

	public void setBean(Bean bean) {
		this.bean = bean;
	}
}
