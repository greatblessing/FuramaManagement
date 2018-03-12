package day01;

public class Swimming {
	private int openTime;
	
	public Swimming() {
		this.setOpenTime(0);
	}

	public Swimming(int openTime) {
		this.setOpenTime(openTime);
	}
	
	public int getOpenTime() {
		return openTime;
	}

	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}

	@Override
	public String toString() {
		return "Swimming pool is opened at " + openTime + ":00 AM";
	}
	
	
}
