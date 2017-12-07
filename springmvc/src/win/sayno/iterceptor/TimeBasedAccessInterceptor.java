package win.sayno.iterceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TimeBasedAccessInterceptor implements HandlerInterceptor {
	
	private int openingTime;

	private int closingTime;

	public int getOpeningTime() {
		return openingTime;
	}

	public void setOpeningTime(int openingTime) {
		this.openingTime = openingTime;
	}

	public int getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(int closingTime) {
		this.closingTime = closingTime;
	}

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("请求结束。。。。");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("handler调用完成" + System.currentTimeMillis());
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		if (openingTime <= hour && hour < closingTime) {
			System.out.println("handler调用开始" + System.currentTimeMillis());
			return true;
		}
		response.sendRedirect("http://www.baidu.com");
		return false;
	}
}
