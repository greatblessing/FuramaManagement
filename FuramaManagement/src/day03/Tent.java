package day03;

public class Tent extends Accomodation{
	private Customer customer;

	public Tent() {
		
	}
	public Tent(Customer customer) {
		this.customer = customer;
	}
	
	public Tent(String name, float size, float pricePerDay, int totalDay, int numberOfBed, Customer customer) {
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
