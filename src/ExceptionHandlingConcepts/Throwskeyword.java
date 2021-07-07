package ExceptionHandlingConcepts;

public class Throwskeyword {
	
	public void m1() {
		m2();
	}

	public void m2() {
		try {
			m3();
		} 
		catch (ArithmeticException e) {
			System.out.println("AE IS COMING");
			e.printStackTrace();
			System.exit(1);	

		}
		finally {
			System.out.println("miss bindu");
		}
	}
	
	public void m3() throws ArithmeticException {
//		int i=9/0;
		System.out.println("AE IS COMING");
		
	}
	public static void main(String[] args)  {
		
		Throwskeyword obj = new Throwskeyword();
		obj.m1();
		System.out.println("bYE");
		
		
		
        
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
