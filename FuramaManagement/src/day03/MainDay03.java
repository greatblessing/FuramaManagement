package day03;

public class MainDay03 {
	public static void main(String args[]) {
		Customer customer1= new Customer("Nguyen Van A", 21, 20);
		Customer customer2= new Customer("Pham Hong Phuc", 21, 20);
		
		Tent tent = new Tent("Tent", 60, 3, 2, 0, customer1); //name: Tent, size: 60, pricePerDay: 3USD, 2 days, 0 bed, customer1
		System.out.println("Total price " + customer1.getName() + " need to pay is: " + tent.getTotalPrice());
		
		Villa villa = new Villa("Villa", 30, 6, 4, 2, customer2); // 6 USD per day, 4 days, 30m2
		System.out.println("Total price " + customer2.getName() + " need to pay is: " + villa.getTotalPrice());
	}
}
