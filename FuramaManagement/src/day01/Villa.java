package day01;

public class Villa {
	private int numberOfBed;
	private int pricePerDay;
	private int totalDays;
	
	public Villa() {
		this.setNumberOfBed(0);
		this.setPricePerDay(0);
		this.setTotalDays(0);
	}
	
	public Villa(int numberOfBed, int pricePerDay, int totalDays) {
		this.setNumberOfBed(numberOfBed);
		this.setPricePerDay(pricePerDay);
		this.setTotalDays(totalDays);
	}

	public int getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public int getNumberOfBed() {
		return numberOfBed;
	}

	public void setNumberOfBed(int numberOfBed) {
		this.numberOfBed = numberOfBed;
	}

	@Override
	public String toString() {
		return "Villa [numberOfBed=" + numberOfBed + ", pricePerDay=" + pricePerDay + ", totalDays=" + totalDays + "]";
	}
	
	public float getFinalPrice() {
		return this.getPricePerDay() * this.getTotalDays();
	}
	
}
