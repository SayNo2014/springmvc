package win.sayno.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import win.sayno.processor.MyBeanPostProcessor;

@Component
public class MyBeanFactoryAware implements BeanFactoryAware {

	public MyBeanFactoryAware() {
		super();
		System.out.println(this.getClass().getName() + "���캯��....");
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// Ӳ����ע��BeanPostProcessor
		((ConfigurableListableBeanFactory)beanFactory).addBeanPostProcessor(new MyBeanPostProcessor());
	}

}
