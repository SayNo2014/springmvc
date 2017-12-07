package win.sayno.iterceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

public class MyWebRequestInterceptor implements WebRequestInterceptor {

	@Override
	public void preHandle(WebRequest request) throws Exception {
		System.out.println(this.getClass().getName() + "#preHandle");
	}

	@Override
	public void postHandle(WebRequest request, ModelMap model) throws Exception {
		System.out.println(this.getClass().getName() + "#postHandle");
	}

	@Override
	public void afterCompletion(WebRequest request, Exception ex) throws Exception {
		System.out.println(this.getClass().getName() + "#afterCompletion");
	}
	
}
