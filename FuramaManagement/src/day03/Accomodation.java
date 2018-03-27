package day03;

public abstract class Accomodation {
	private String name;
	private float size;
	private float pricePerDay;
	private int totalDay;
	private int numberOfBed;
	
	
	public Accomodation(String name, float size, float pricePerDay, int totalDay, int numberOfBed) {
		super();
		this.name = name;
		this.size = size;
		this.pricePerDay = pricePerDay;
		this.totalDay = totalDay;
		this.numberOfBed = numberOfBed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(float pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public int getTotalDay() {
		return totalDay;
	}

	public void setTotalDay(int totalDay) {
		this.totalDay = totalDay;
	}

	public int getNumberOfBed() {
		return numberOfBed;
	}

	public void setNumberOfBed(int numberOfBed) {
		this.numberOfBed = numberOfBed;
	}

	public Accomodation() {
		super();
	}

	abstract double getTotalPrice();
}
