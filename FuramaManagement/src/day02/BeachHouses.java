package day02;

public class BeachHouses {
	private String nameOfBeachHouse;
	private int numberOfBed;
	private float pricePerDay;
	
	public BeachHouses() {
		
	}

	public BeachHouses(String nameOfBeachHouse, int numberOfBed, float pricePerDay) {
		this.setNameOfBeachHouse(nameOfBeachHouse);
		this.setNumberOfBed(numberOfBed);
		this.setPricePerDay(pricePerDay);
	}
	
	public String getNameOfBeachHouse() {
		return nameOfBeachHouse;
	}

	public void setNameOfBeachHouse(String nameOfBeachHouse) {
		this.nameOfBeachHouse = nameOfBeachHouse;
	}

	public int getNumberOfBed() {
		return numberOfBed;
	}

	public void setNumberOfBed(int numberOfBed) {
		this.numberOfBed = numberOfBed;
	}

	public float getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(float pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	@Override
	public String toString() {
		return "BeachHouses information: nameOfBeachHouse=" + nameOfBeachHouse + ", numberOfBed=" + numberOfBed + ", pricePerDay="
				+ pricePerDay + "";
	}
}