package win.sayno.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import win.sayno.service.MyService;

public class MyController {
	
	protected final static Log logger = LogFactory.getLog(MyController.class);
	
	private volatile static MyController controller;
	
	private MyController() {
	}
	
	private MyService myService;

	public MyService getMyService() {
		return myService;
	}

	public void setMyService(MyService myService) {
		this.myService = myService;
	}
	
	public void doSomething() {
		myService.doService();
	}
	
	public static MyController getController() {
		logger.info("MyControllerÊµÀý»¯...");
		if (controller == null) {
			synchronized (MyController.class) {
				controller = new MyController();
			}
		}
		return controller;
	}
}
