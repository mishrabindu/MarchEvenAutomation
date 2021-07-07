package JavaSessions;

public class AmazonApp {
	
	//this method is called methodoverloading : polymorphism : poly(many)+ morphism (forms)- also called static(compileTime polymorphism)
	//within the same class we have diff methods
	
	//1. with same name of the method
	//2. diff param
	//3. diff sequence of param
	

	public void test() {
		System.out.println("test...0 param");

	}

	public int test(int i) {
		return 100;

	}
	
    public void test(int i , int j) {
		System.out.println(i+j);

		
	}
    
      public void test(int i , String j) {
		
	}
      
      public void test(String i , int j) {
  		
  	}

	public static void main(String[] args) {
		
		AmazonApp  obj= new AmazonApp();
		
		obj.test();
		obj.test(10, 20);
       int m1=obj.test(10);
       System.out.println(m1);
	}

}
