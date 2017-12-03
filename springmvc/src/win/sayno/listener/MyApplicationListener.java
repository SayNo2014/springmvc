package win.sayno.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import win.sayno.service.UserService;

public class MyApplicationListener implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println(
				event.getApplicationContext().getBean("person").toString());
		UserService userService = (UserService) event.getApplicationContext().
				getBean("userService");
		userService.save();
	}

}
