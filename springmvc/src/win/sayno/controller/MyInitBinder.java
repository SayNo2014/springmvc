package win.sayno.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import win.sayno.entity.Entity;
import win.sayno.validator.EntityValidator;

@SessionAttributes(names="entity.name")
@Controller
public class MyInitBinder {

	@Autowired
	private EntityValidator entityValidator;
	
	@RequestMapping("testMyInitBinder.do")
	public String testMyInitBinder(@Validated Entity entity, BindingResult bindingResult, HttpServletResponse response) {
		if (bindingResult.hasErrors()) {
			try {
				response.getWriter().write(bindingResult.getAllErrors().toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		return "/WEB-INF/jsp/index.jsp";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.addValidators(entityValidator);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		dateFormat.setLenient(false);
		webDataBinder.registerCustomEditor(
				Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping("entity.do")
	public String entity() {
		return "/WEB-INF/jsp/entity.jsp";
	}
	
	@ModelAttribute(binding=true,name="entity.name")
	public String testModelAttribute() {
		return "sayno.win";
	}
	
	@ModelAttribute(binding=true,name="entity.name")
	public String testModelAttribute1() {
		return "sayno.site";
	}
	
	@ModelAttribute
	public Entity testModelAttributeEntity() {
		Entity entity = new Entity();
		entity.setName("sayno.blog");
		return entity;
	}
	
	@RequestMapping("writeEntity.do")
	public void writeEntity(@ModelAttribute("entity") Entity entity, HttpServletResponse response) {
		try {
			response.getWriter().write(entity.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("modelMap.do")
	public void modelMap(ModelMap modelMap, HttpServletResponse response) {
		try {
			response.getWriter().write(modelMap.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
