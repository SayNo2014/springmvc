package win.sayno.processor;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor{

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
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		if ("myService".equals(beanName)) {
			System.out.println(this.getClass().getName() + "#predictBeanType....");
		}
		return beanClass;
	}

	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		if ("myService".equals(beanName)) {
			System.out.println(this.getClass().getName() + "#determineCandidateConstructors....");
		}
		return null;
	}

	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		if ("myService".equals(beanName)) {
			System.out.println(this.getClass().getName() + "#getEarlyBeanReference....");
		}
		return bean;
	}

}
