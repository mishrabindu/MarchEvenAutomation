package SuperKeyword;

public class Car extends Vehicle{
	
	int speed= 100;
	
	
	public Car() {
		super();//it should be first line or statemet in constructor to call the const from parent ...
//		super(10);  it is second line so should not use super keyword
		System.out.println("car.....default..const....");
	}
	
	public void dashboard() {
		
//		super   from method i can call parent constructor ....
		
		System.out.println(speed);
		System.out.println(super.speed);
	}
	@Override
	public void min_speed() {
		System.out.println("Car_speed");
		super.min_speed();
	}


}
