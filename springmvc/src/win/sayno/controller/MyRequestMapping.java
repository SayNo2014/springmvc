package win.sayno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyRequestMapping {
	
	@RequestMapping(value="/requestMapping",method=RequestMethod.GET)
	public ModelAndView requestMapping() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", this.getClass().getName());
		modelAndView.setViewName("/WEB-INF/jsp/index.jsp");
		return modelAndView;
	}
	
	@RequestMapping(value="/requestMapping",method=RequestMethod.POST)
	public ModelAndView requestMapping1() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", this.getClass().getName());
		modelAndView.setViewName("/WEB-INF/jsp/index.jsp");
		return modelAndView;
	}
}
