package SuperKeyword;

public class Vehicle {

	
	public Vehicle() {
		System.out.println("vehicle....const...");
	}
	
	public Vehicle(int a) {
		System.out.println("vehicle..one param..const...a");
	}
	
	public Vehicle(int a ,String b) {
		System.out.println("vehicle...two param....const...a+b");
	}
	
	
	int speed=200; //variable hiding in parent class ///
	
	public void min_speed() {
		System.out.println("Vehicle_speed");
	}

}
