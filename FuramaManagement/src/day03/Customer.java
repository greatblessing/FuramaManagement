package day03;

public class Customer {
	private String name;
	private int age;
	private int totalDay;
	
	public Customer() {
	}
	
	public Customer(String name, int age, int totalDay) {
		this.name = name;
		this.age = age;
		this.totalDay= totalDay;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTotalDay() {
		return totalDay;
	}
	public void setTotalDay(int totalDay) {
		this.totalDay = totalDay;
	}
	
	@Override
	public String toString() {
		return "Custome: name=" + name + ", age=" + age + ", totalDay=" + totalDay + "]";
	}
}
