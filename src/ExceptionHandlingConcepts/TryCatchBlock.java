package ExceptionHandlingConcepts;

public class TryCatchBlock {
	
	String name ="Naveen";

	public static void main(String[] args) {

		
		//exception is unwanted condition in code ....program is terminated......
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
		int i=9/0;  //ArithmeticException
		TryCatchBlock obj = new TryCatchBlock();
		obj= null;
		System.out.println(obj.name);
		
		System.out.println("Hi");
		System.out.println("Hi");

		}
		
		catch(ArithmeticException e) {
			System.out.println("AE IS COMING");
			e.printStackTrace();
			}
		
		catch(NullPointerException e){
			System.out.println("NP IS COMING");
			e.printStackTrace();
			
		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
