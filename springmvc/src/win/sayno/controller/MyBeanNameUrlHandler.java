package win.sayno.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class MyBeanNameUrlHandler extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", this.getClass().getName());
		modelAndView.setViewName("/WEB-INF/jsp/index.jsp");
		return modelAndView;
	}

}
