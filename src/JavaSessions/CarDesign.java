
package JavaSessions;

public class CarDesign {

	String name;
	int price;
	String color;
	double mileage;
	boolean islaunched;
	char isAutomatic;

	static int wheels;// becuase in all objects int wheel is common fr all cars so we make it static
						// so that it will be common and take only 4 bytes instaed of 4*3=12(3 could be
						// your different objects

	// static final int wheels=4; it means final is used where no one can change
	// static variable can be used only in class variable not in main method or in
	// static method.
	// static value willnt get store in heap it will get store in seperate space
	// -CMA -Meta Space(limited space ..not dynamic/permanent generation...(dynamic
	// space)
	// wheels variable is a class property but not object property

	public static void main(String[] args) {

		CarDesign obj = new CarDesign();
		obj.name = "Audi";
		obj.price = 70;
		obj.color = "White";
		obj.mileage = 42.54;
		obj.islaunched = true;
		obj.isAutomatic = 'Y';

		System.out.println(obj.name + "  " + obj.price + "  " + obj.color + " " + obj.mileage + " " + obj.islaunched
				+ " " + obj.isAutomatic);

		CarDesign obj1 = new CarDesign();
		obj1.name = "BMW";
		obj1.color = "Black";
		obj1.isAutomatic = 'Y';

		System.out.println(obj1.name + "  " + obj1.price + "  " + obj1.color + " " + obj1.mileage + " "
				+ obj1.islaunched + " " + obj1.isAutomatic);

		CarDesign obj3 = new CarDesign();
		obj3.name = "Honda";
		System.out.println(obj3.name);
		obj3 = null;
		System.out.println(obj3.name); // NullPointerException

	}

}
