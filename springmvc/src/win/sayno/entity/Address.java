package win.sayno.entity;

public class Address {
	
	private String district;
	
	private String city;
	
	private String province;

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Address [district=" + district + ", city=" + city + ", province=" + province + "]";
	}
}
