package win.sayno.label;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class PropertyBeanDefinitionParse extends AbstractSingleBeanDefinitionParser {
	
	protected Class<Property> getBeanClass(Element element) {
		return Property.class;
	}
	
	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		// id
		String id = element.getAttribute("id");
		
		// name
		String name = element.getAttribute("name");
		
		// value
		String value = element.getAttribute("value");
		
		if (StringUtils.hasText(id)) {
			builder.addPropertyValue("id", id);
		}
		
		if (StringUtils.hasText(name)) {
			builder.addPropertyValue("name", name);
		}
		
		if (StringUtils.hasText(value)) {
			builder.addPropertyValue("value", value);
		}
		
		super.doParse(element, builder);
	}

}
