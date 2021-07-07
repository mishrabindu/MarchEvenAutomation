package Oops_Inheritance;

public class Car extends Vehicle {
	int min_speed= 100;

	
	public void start() {
		System.out.println("car--start");
	}

	public void stop() {
		System.out.println("car--stop");
	}

	public void refuel() {
		System.out.println("car--refuel");
	}

	public static void speed() {
		System.out.println("Car---Speed");
	}
}
