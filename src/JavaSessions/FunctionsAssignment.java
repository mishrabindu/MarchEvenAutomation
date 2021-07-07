package JavaSessions;

public class FunctionsAssignment {
	
	// 1. 
	public int addition() {
		System.out.println("do the addition....");
		int a = 10;
		int b=20;
		int sum= a+b;
		return sum;
	}
	//2.
	public int product(int a, int b) {
		System.out.println("print the product");
		int prod= a*b;
		return prod;
	}
	
	//3. 
	public double circle(int a) {
		System.out.println("printing the circumference of the circle ...");
		double circumference= 2*3.14*a;
		return circumference;
	}
	
	//4. 
	  public int maxMin(int a , int b , int c){
		  System.out.println("Print max & min ");
		  
		  if(a>b && a>c) {
			  System.out.println("a is max");
		  }
		  else if(a<b && a<c) {
			  System.out.println("a is min");
		  }
		  else if(b>c) {
			  System.out.println("b is max");
		  }
		  else if(b<c) {
			  System.out.println("b is min");
		  }
		  
		  else {
			  System.out.println("c is max");
		  }
		  return 0;
	  }
	  
	//5. 
	  
	  public int evenOdd(int a) {
		  System.out.println("given number is even or odd");
		  
		 
		  
		  switch (a%2) {
		case 0:
			System.out.println("a is even");
			
			break;
		case 1:
			System.out.println("a is odd");


		default:
			break;
		  }
		  return -1;
	  }
	
	
	
	

	public static void main(String[] args) {
		
		FunctionsAssignment obj = new FunctionsAssignment();
		int s1= obj.addition();
		System.out.println(s1);
		int m2 =obj.product(10, 20);
		System.out.println(m2);
		double m3=obj.circle(1);
		System.out.println(m3);
		int m4=obj.maxMin(30, 10, 20);
		System.out.println(m4);
		int m5=obj.evenOdd(4);
		System.out.println(m5);
		
		
	}

}
