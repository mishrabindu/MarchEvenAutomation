package JavaSessions;

public class MainMethodOverloading {

	public static void main(String a[]) {
		System.out.println("main method");
		main(10);
		main(10, "testing");

	}
	
		
		public static void main(int a) {
			System.out.println("main method..."+ a);
		}
		
		public static void main(int a, String b) {
			System.out.println("main method..." + a+b);
		}
		
		
		//static method also can be overloaded ....
		
		
	}


