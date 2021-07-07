 package JavaSessions;

public class ClassAndObjectConcepts {
	
	//CLASS - its a Blueprint/Template/Category of Objects
	//Object-   is a physical entity---> instance of the class
	//data members:
	    //class vars
	    // class methods
	
	String name;     //null
	int age;         // 0
	double salary;   //0.0 
	char gender;      // space
	boolean flag;     //false

	public static void main(String[] args) {
		
       //create the object 
		ClassAndObjectConcepts obj = new ClassAndObjectConcepts();
		
		obj.name= "Bindu";
		obj.age = 30;
		obj.salary = 34.55;
		obj.gender = 'm';
		obj.flag = true;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary + "   " +obj.gender + "  " + obj.flag);
		
		
		ClassAndObjectConcepts  obj1 = new ClassAndObjectConcepts();
		
		obj1.name = "Sweta";
		obj1.age= 25;
		obj1.salary= 20.45;
		obj.gender = 'F';
		obj.flag = false;
		
		System.out.println(obj1.name);
		
		obj1= null;
		System.out.println(obj1);
		
//		ClassAndObjectConcepts  obj3= new ClassAndObjectConcepts();
//		obj3= null;  // null reference objects ...means it will create the object but   break the connection from obj3...
		
		//Garbage collector will kill all the objects which has no refrence and also the null values in heap 
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
