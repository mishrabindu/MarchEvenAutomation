package JavaSessions;

public class CompanyConstructor {
//	
//	String name;
//	int shareprice;
//	String HQ;

	
	//constructor: 
	//its having the same name as the class name 
	// can be overloaded
	//is not a function
	//cannot return any value(no void)
	//having no return
	//used to initialize the class variables
	//will be called when you create the object of the class
	
	//function is used for business logic/feature/behavior of the application
	
//	public CompanyConstructor() {  // 0 param or default const...
//		System.out.println("default const....");
//		
//	}
//	
//	
//	public CompanyConstructor(int a) {  // 1 param or default const...
//		System.out.println("default const...." + a);
//		
//	}
//	
//	public CompanyConstructor(int a, int b) {  // 2 param or default const...
//		System.out.println("default const...." + a+b);
//		
//	}
//	
	
	//no one can write the constructor without passing the arguemnts..
	String name;
	int shareprice;
	String HQ;
	
	public CompanyConstructor(String name , int shareprice,	String HQ ) {  //name1 is local variable  & name is the class variable 
		//name = name1;so instead of writinh this ..it looks ugly so we use this keyword 
		this.name= name;
		this.shareprice= shareprice;
		this.HQ = HQ;
		
		//so overload this contructuot 
		
		
		
	}
	
	public CompanyConstructor(String name) {
		this.name = name;
	}
	
	

	public CompanyConstructor(String name, int shareprice) {
		super();
		this.name = name;
		this.shareprice = shareprice;
	}

	
	
	public CompanyConstructor(String name, String hQ) {
		super();
		this.name = name;
		HQ = hQ;
	}

	public static void main(String[] args) {
		
		CompanyConstructor obj = new CompanyConstructor("IBM" , 1000, "Pune");
		System.out.println(obj.name + " "+ obj.shareprice + " " + obj.HQ);
		
		
		CompanyConstructor obj1 = new CompanyConstructor("Infosys");
		System.out.println(obj1.name + " "+ obj1.shareprice + " " + obj1.HQ);
		
		
//		MySystem m1= new MySystem(30, "Bindu");
//		System.out.println(m1.age + " " + m1.name);  //mysytem is havig private /System.out .println--- system is private construcotr 

//		System m= new System();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	

}
