package day04;

import java.util.ArrayList;

public class MainDay04 {
	public static void main(String args[]) {
		ArrayList<Customer> arrayListCustomer = new ArrayList<Customer>();
		
		Customer customer1 = new Customer("Jackson", 30, "China");
		Customer customer2 = new Customer("Jhope", 26, "Korea");
		Customer customer3 = new Customer("Taylor", 21, "Spain");
		Customer customer4 = new Customer("Nguyen Van A", 23, "Viet Nam");
		Customer customer5 = new Customer("Luhan", 12, "America");
		Customer customer6 = new Customer("Mary", 36, "France");
		Customer customer7 = new Customer("Robert", 51, "Hungary");
		Customer customer8 = new Customer("Karen", 16, "Switzerland");
		Customer customer9 = new Customer("Daniel", 20, "Wales");
		Customer customer10 = new Customer("Nancy", 30, "Norway");
		
		arrayListCustomer.add(customer1);
		arrayListCustomer.add(customer2);
		arrayListCustomer.add(customer3);
		arrayListCustomer.add(customer4);
		arrayListCustomer.add(customer5);
		arrayListCustomer.add(customer6);
		arrayListCustomer.add(customer7);
		arrayListCustomer.add(customer8);
		arrayListCustomer.add(customer9);
		arrayListCustomer.add(customer10);
		
		for(Customer customer: arrayListCustomer) {
			System.out.println(customer.toString());
		}
	}
	
}
