package JavaSessions;

public class Person {
	
	String name;
	int age;
	String city;
//	double  mileage;
//	boolean isLaunched;
//	char  isAutomatic;
//	static int wheels;// becuase in all objects int wheel is common fr all cars so we make it static so that it will be common and take only 4 bytes instaed of 4*3=12(3 could be your different objects
	
	//static final int wheels=4;  it means final is used where no one can change
	//static variable can be used only in class variable not in main method or in static method.
	//static value willnt get store in heap it will get store in seperate space -CMA -Meta Space(limited space ..not dynamic/permanent generation...(dynamic space)
 // wheels variable is a class property but not object property
	
	public static void main(String[] args) {

		Person p1= new Person();
//		Person.wheels=4;   // static value wheel should call with class name not with p1 object ..like we do for other cases)

		p1.name="Vanita";
		p1.age=30;
		p1.city="Pune";
		
		Person p2= new Person();

	
		p2.name="Anant";
		p2.age=40;
		p2.city="Mumbai";
		
		Person p3= new Person();

	
		p3.name="Shifa";
		p3.age=20;
		p3.city="London";
	
		System.out.println(p1.name+ " " + p1.age + " " + p1.city);
		System.out.println(p2.name+ " " + p2.age + " " + p2.city);
		System.out.println(p3.name+ " " + p3.age + " " + p3.city);
		
		p1=p2;
		
		System.out.println(p1.name+ " " + p1.age + " " + p1.city);
		System.out.println(p2.name+ " " + p2.age + " " + p2.city);
		System.out.println(p3.name+ " " + p3.age + " " + p3.city);
		
		p2=p3;
		
		System.out.println(p1.name+ " " + p1.age + " " + p1.city);
		System.out.println(p2.name+ " " + p2.age + " " + p2.city);
		System.out.println(p3.name+ " " + p3.age + " " + p3.city);
		
		p3=p1;
		
		System.out.println(p1.name+ " " + p1.age + " " + p1.city);
		System.out.println(p2.name+ " " + p2.age + " " + p2.city);
		System.out.println(p3.name+ " " + p3.age + " " + p3.city);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
