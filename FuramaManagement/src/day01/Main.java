package day01;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Main main1 = new Main();
		main1.run();
	}
	
	public static void showTask1() {
		Customer customer = new Customer("Nguyen Van A", 20);
		Villa villa = new Villa(1, 10, 4);
		System.out.println(customer.toString());
		System.out.println("Customer need to pay " + villa.getFinalPrice() + " USD for " + villa.getTotalDays() + " days.");
	}
	
	public static void showTask2() {
		Integer time;
		Integer money;
		
		Swimming swimming = new Swimming(9);
		System.out.println(swimming.toString());
		
		System.out.println("What time do you come? ");
		Scanner inputTime = new Scanner(System.in);
		time = inputTime.nextInt();
		if(checkTimeValidation(time)) {
			System.out.println("Welcome to Furama swimming pool...");
		} else {
			System.out.println("Please come here at 9:00 AM");
		}
		
		System.out.println("How much do you have? (100 or 50 or 30 USD???)");
		Scanner inputMoney = new Scanner(System.in);
		money = inputMoney.nextInt();
		System.out.println("You can stay at villa " + stayDaysAtVilla(money) + " day(s) with " + money + " USD.");
	}
	
	public static boolean checkTimeValidation(int time) {
		return (time > 8);
	}
	
	public static int stayDaysAtVilla(int money) {
		switch(money) {
			case 100: return money/10;
			case 50: return money/10;
			case 30: return money/10;
			default: return 1;
		}
	}
	
	public void run() {
		showTask1();
		showTask2();
	}
}
