package win.sayno.processor;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

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

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if ("myService".equals(beanName)) {
			System.out.println(this.getClass().getName() + "#postProcessBeforeInstantiation....");
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if ("myService".equals(beanName)) {
			System.out.println(this.getClass().getName() + "#postProcessAfterInstantiation....");
		}
		return true;
	}

	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean,
			String beanName) throws BeansException {
		if ("myService".equals(beanName)) {
			System.out.println(this.getClass().getName() + "#postProcessPropertyValues....");
		}
		return pvs;
	}

}
