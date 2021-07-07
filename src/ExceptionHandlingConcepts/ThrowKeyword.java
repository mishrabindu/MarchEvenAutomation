package ExceptionHandlingConcepts;

public class ThrowKeyword {
	
	//if i want to generate my own exception then we use throw keyword

	public static void main(String[] args) {

		
		String data= null;
		
		if(data == null) {
			try {
//			throw new Exception("DataNotFoundInExcel");
				throw null;  //it will throw null point expection//return null will ive u null value ..interview question
			}
			catch(Exception e){
				System.out.println("Datanotcomng...bye");
				e.printStackTrace();
			}
		}
		
	}

}
