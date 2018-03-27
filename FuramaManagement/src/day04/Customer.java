package day04;

public class Customer {
	private String customerName;
	private int customerAge;
	private String country;
	
	public Customer() {
		this.setCustomerName(null);
		this.setCustomerAge(0);
	}
	
	public Customer(String name, int age, String country) {
		this.setCustomerName(name);
		this.setCustomerAge(age);
		this.setCountry(country);
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int getCustomerAge() {
		return customerAge;
	}
	
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Customer information: CustomerName=" + customerName + ", customerAge=" + customerAge + ", country=" + country
				+ "";
	}
}
