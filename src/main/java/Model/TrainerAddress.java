package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trainer_Address")


public class TrainerAddress {
	@Id
	@GeneratedValue
	private int addressId;
	@Column(name="trainer_city")
	private String cityName;
	@Column(name="trainer_pincode")
	private long pincode;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "TrainerAddress [addressId=" + addressId + ", cityName=" + cityName + ", pincode=" + pincode + "]";
	}
	

	
}
