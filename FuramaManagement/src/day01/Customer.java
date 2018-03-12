package day01;

public class Customer {
	private String customerName;
	private int customerAge;
	
	public Customer() {
		this.setCustomerName(null);
		this.setCustomerAge(0);
	}
	
	public Customer(String name, int age) {
		this.setCustomerName(name);
		this.setCustomerAge(age);
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

	@Override
	public String toString() {
		return "Customer information: Name=" + customerName + ", age=" + customerAge + "";
	}

}
