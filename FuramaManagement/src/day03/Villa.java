package day03;

public class Villa extends Accomodation{
	private Customer customer;
	
	public Villa() {
		
	}
	
	public Villa(Customer customer) {
		this.customer = customer;
	}
	
	public Villa(String name, float size, float pricePerDay, int totalDay, int numberOfBed, Customer customer) {
		super(name, size, pricePerDay, totalDay, numberOfBed);
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getTotalPrice() {
		return customer.getTotalDay() * this.getPricePerDay();
	}
	@Override
	public String toString() {
		return "Tent [customer=" + customer + "]";
	}
}
