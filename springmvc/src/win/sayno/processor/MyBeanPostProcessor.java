package win.sayno.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("myService".equals(beanName)) {
			System.out.println(this.getClass().getName() + "#postProcessBeforeInitialization....");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("myService".equals(beanName)) {
			System.out.println(this.getClass().getName() + "#postProcessAfterInitialization....");
		}
		return bean;
	}

}
