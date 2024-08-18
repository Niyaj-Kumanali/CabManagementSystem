package Cab;

public class MainClass {
	public static void main(String[] args) {
		Cab c1 = new Cab(123, "Suraj", 3456789, "54etgji", "KA23BG7563", "21N34S", "32S34N", "North", "32S34N", "21N34S", "South");
		
		System.out.println("Cab ID: "+c1.getCabID());
		System.out.println("From Longtitude: "+c1.getPickupLocation().getLongitude());
		System.out.println("To Longtitude: "+c1.getDropLocation().getLongitude());

		
	}

}
