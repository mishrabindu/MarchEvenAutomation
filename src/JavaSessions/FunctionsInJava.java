package JavaSessions;

public class FunctionsInJava {
	
	//1. no input and no return
	// void means this function cannot return any value
	
	public void test() {   //0 parameter
//		System.out.println("test method");
	}
	
	//2. no input but return
	//return type is int
	
	public int getMarks() {
//		System.out.println(" get Marks........");
		int a= 100;
		int b= 200;
		int Total= a+b;
		return Total;
	}
	
	public String getTrainerName() {
		return "Bindu";
	}
	
	//3. some input and some return
	
	public int add(int a ,int b) {
		int sum=a+b;
		return sum;
//		return 100;    only 1 time we can have return ..no two returns in a function 
	}
	
	
	// give input but no return
	
	public void getEmpInfo(String name) {
		System.out.println(" emp info is........"+ name);
	}
	
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		int m1= obj.getMarks();  //m1 called holding parameter....
		System.out.println(m1+20-5);
		System.out.println(obj.getMarks());
		
		String name= obj.getTrainerName();
		System.out.println(name);
		System.out.println(" my trainer name is :" + name);
		
		int n1= obj.add(10, 20);
		System.out.println(n1);
		
		obj.getEmpInfo("Anant");
		

		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
