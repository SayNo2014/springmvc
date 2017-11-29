package win.sayno.controller;

import win.sayno.service.MyService;

public class MyController {
	
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
}
