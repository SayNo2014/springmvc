package win.sayno.event;

import org.springframework.context.ApplicationEvent;

public class MyApplicationEvent extends ApplicationEvent {

	public MyApplicationEvent(Object source) {
		super(source);
	}

	private static final long serialVersionUID = 1L;

}
