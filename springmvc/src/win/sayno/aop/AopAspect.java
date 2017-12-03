package win.sayno.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopAspect {
	
	public void after() {
		System.out.println("after");
	}
	
	public void before() {
		System.out.println("before");
	}
	
	public void around(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("log start ...");
		try {
			proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		} finally {
			System.out.println("log stop ...");
		}
	} 
}
