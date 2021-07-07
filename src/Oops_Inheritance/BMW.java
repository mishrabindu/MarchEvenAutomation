package Oops_Inheritance;

public class BMW extends Car {
	
	int min_speed= 200; //no concept of variable overridding..
	//this concept is called variable hiding
	
	//method overridding --polymorphism--> Runtime(dynamic polymorphism)
    //when you have a method in the 
	//parent class and same method in the child class
	//with :
	//same name
	// same number of args
	//same signature
	//private and static method can not be overridden
	
	//why we are using overridden ..what is the usecase : i can have same feature from parent  but logic would be mine in child ...
	
	@Override
	public void start() {
		System.out.println("BMW---Start");
	}

	public void autoparking() {
		System.out.println("BMW--AUTOPARKING");
	}
	
	//method hiding ...this is not method overriding ....
	public static void speed() {
		System.out.println("BMW---Speed");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW----engine");
	}
}
