package Oops_Inheritance;

public class TestCar {

	public static void main(String[] args) {
 
		BMW b= new BMW();
		b.start(); // overridden   advantage of override ..i dont like car method i will be using urs but style could be mine
		b.stop();  //inherited from child object i can access parent and canuse the property ..i need not to create the method in child. 
		b.refuel();  //inherited
		b.autoparking(); //individual
		System.out.println(b.min_speed);
		BMW.speed();  //we didnt call with object becuase it is static in nature ...call with class
		Car.speed();  //we didnt call with object becuase it is static in nature ...call with class
		b.engine();  //child can access from grandparent
		
		
		Car c= new Car();
		c.start();  //car has all these three methods
		c.stop();
		c.refuel();
		
		c.engine();  //car is a child now to grandparent vehicle 
		
		//child class object canbe referred by parent class ref variable :
		//this concept is called Top/Up Casting
		
		Car c1= new BMW();  //i have created child BMW object now ....so i get bmw results 
		c1.start();
		c1.stop();
		c1.refuel();
//		c1.autopar ..its not allowing yyyyyy ----java create secritu level to indiviual method 
//		           in bmw object ...ref type check is failed becuase here the refrence is car(parent)
		
		//the above concept is called Reference Type check...
		
		//down casting:  AT compile time it will give u exception
		// parent class object canbe referred by child class ref variable :
		
//		BMW b1 = (BMW) new Car(); //WE GET EXCEPTION -ClassCastException
		
		Audi a= new Audi();
		a.start();
		a.theftclass();
	}

}
