package win.sayno.label;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class PropertyNameSpaceHandlerSupport extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("property", new PropertyBeanDefinitionParse());
	}

}
