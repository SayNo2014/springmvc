package win.sayno.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import win.sayno.service.MyService;

public class MyApplicationListener implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println(
				event.getApplicationContext().getBean("person").toString());
		MyService myService = (MyService) event.getApplicationContext().
				getBean("myService");
		System.out.println(myService.getPerson().toString());
	}

}
