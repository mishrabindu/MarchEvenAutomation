package ExceptionHandlingConcepts;

public class FinallyBlock {
	
	//exception or not 

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
		int i=9/0;
		
		System.exit(1);  //it will shut down the JVM..WILL NOT GO TO Finally block
		}
		
//		catch (Exception e) {
//			System.out.println("AE IS COMING");
//			e.printStackTrace();
//		}
		
		
		finally {
			System.out.println("Ths is my finally block");
		}
		
		System.out.println(getMarks("test"));
	}
		
		
		public static int getMarks(String name) {
			if(name.equals("Tom")) {
				try {
				int j=9/0;
				}
				catch(Exception e) {   //inside catch blcok 
					System.out.println("AE is cming");
					e.printStackTrace();
					return 20;
				}
				finally {
					System.out.println("this is my final");
					return 30;
				}
					
				
			}
			else if (name.equals("Lisa")) {
			return 90;
			}
			
			else if (name.equals("peter")) {
				return 60;
				}
				
			return -1;
			
		
		
		
		
		
		
		
	}

}
