package win.sayno.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

public class MyDestructionAwareBeanPostProcessor implements DestructionAwareBeanPostProcessor{

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
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
		if ("myService".equals(beanName)) {
			System.out.println(this.getClass().getName() + "#postProcessBeforeDestruction....");
		}
		
	}

	@Override
	public boolean requiresDestruction(Object bean) {
		return true;
	}

}
