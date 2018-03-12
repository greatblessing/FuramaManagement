package day02;

public class Villas {
	private String nameOfVilla;
	private int numberOfBed;
	private float pricePerDay;
	
	public Villas() {
	}
	
	public Villas(String nameOfVilla, int numberOfBed, float pricePerDay) {
		this.setNameOfVilla(nameOfVilla);
		this.setNumberOfBed(numberOfBed);
		this.setPricePerDay(pricePerDay);
	}
	
	public String getNameOfVilla() {
		return nameOfVilla;
	}

	public void setNameOfVilla(String nameOfVilla) {
		this.nameOfVilla = nameOfVilla;
	}

	public float getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(float pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public int getNumberOfBed() {
		return numberOfBed;
	}

	public void setNumberOfBed(int numberOfBed) {
		this.numberOfBed = numberOfBed;
	}
	
	@Override
	public String toString() {
		return "Villas information: nameOfVilla=" + nameOfVilla + ", numberOfBed=" + numberOfBed + ", pricePerDay=" + pricePerDay
				+ "";
	}
}