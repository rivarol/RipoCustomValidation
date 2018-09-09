package nc.model;

import nc.annotations.PhoneAnnotation;

public class PhoneModele {
	@PhoneAnnotation
	private String phone;
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return phone;
	}
}
