package JavaSessions;

public class ConditionalOperator {

	public static void main(String[] args) {
		
//  Short circuit && and operator (when check first condition is false it will become short circuit and move to next line to execute)
		int x=300;
		int y=200;
		int z=100;
		
		if(x>y  &&  x>z) {
			System.out.println("x is the highest");
		}
		else if(y>z){
			System.out.println("y is the highest");
		}
		else
		{
			System.out.println("z is the highest");
		}


//		String Total="100";
		// Dead code
//		if(false) {
//			System.out.println("pass the value");
//		}
//		else {
//			System.out.println("leave it");
//		}

		String Total="100";
		if(Total!="100") {
			System.out.println("leave");
		}
		else {
			System.out.println("pass");
		}
	}
}
