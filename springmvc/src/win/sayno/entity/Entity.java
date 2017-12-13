package win.sayno.entity;

import java.util.Date;

public class Entity {
	
	private String name;
	
	private Date dateValue;

	public Date getDateValue() {
		return dateValue;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Entity [name=" + name + ", dateValue=" + dateValue + "]";
	}
}
