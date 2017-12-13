package win.sayno.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import win.sayno.entity.Entity;

public class EntityValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Entity.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Entity entity = (Entity) target;
		if (entity.getName().length() < 10) {
			errors.rejectValue("name", "valid.name",new Object[] {"minlength",10},"用户名不能少于{0}位");
		}
	}
}
