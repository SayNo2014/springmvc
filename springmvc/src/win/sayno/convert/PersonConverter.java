package win.sayno.convert;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;

import win.sayno.entity.Address;
import win.sayno.entity.Person;

public class PersonConverter implements Converter<String, Person> {

	@Override
	public Person convert(String source) {
		Person person = new Person();
		try{
			String[] personInfo = source.split(",");
			person.setName(personInfo[0]);
			String[] addressInfo = personInfo[1].split("-");
			Address address = new Address();
			address.setDistrict(addressInfo[0]);
			address.setCity(addressInfo[1]);
			address.setProvince(addressInfo[2]);
			person.setAddress(address);
		} catch (Exception e) {
	            throw new ConversionFailedException(TypeDescriptor.valueOf(String.class), 
	                    TypeDescriptor.valueOf(Person.class), source, null);
	    }
		return person;
	}

}
