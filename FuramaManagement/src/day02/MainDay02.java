package day02;

public class MainDay02 {

	public static void main(String args[]) {
		MainDay02 mainDay02 = new MainDay02();
		mainDay02.run();
	}

	public static void showInformationOfVillas() {
		Villas villa1= new Villas("Villa Vip1", 1, 10);
		Villas villa2= new Villas("Villa Vip2", 1, 10);
		Villas villa3= new Villas("Villa Vip3", 1, 10);
		Villas villa4= new Villas("Villa Vip4", 1, 10);
		Villas villa5= new Villas("Villa Vip5", 1, 10);
		
		Villas[] villas = new Villas[5];
		villas[0] = villa1;
		villas[1] = villa2;
		villas[2] = villa3;
		villas[3] = villa4;
		villas[4] = villa5;
		
		showInformation(villas);
	}
	
	public static void showInformationOfBeachHouse() {
		BeachHouses beachHouse1 = new BeachHouses("Beach House 1", 4, 5);
		BeachHouses beachHouse2 = new BeachHouses("Beach House 2", 4, 5);
		
		BeachHouses[] beachHouses = new BeachHouses[2];
		beachHouses[0] = beachHouse1;
		beachHouses[1] = beachHouse2;
		
		showInformation(beachHouses);
	}
	
	public static void showInformation(Object[] objects) {
		for(Object object : objects) {
			System.out.println(object.toString());
		}
	}
	
	public void run() {
		showInformationOfVillas();
		showInformationOfBeachHouse();
	}
}