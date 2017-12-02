package win.sayno.editor;

import java.beans.PropertyEditorSupport;

import org.springframework.util.Assert;

import win.sayno.entity.Address;

public class AddressPropertyEditorSupport extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			Assert.notNull(text, "Address must not be null");
            String[] adds = text.split("-");
            Address address = new Address();
            address.setProvince(adds[0]);
            address.setCity(adds[1]);
            address.setDistrict(adds[2]);
            this.setValue(address);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
