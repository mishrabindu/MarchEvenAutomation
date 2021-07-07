package FinalizeMethod;

public class Testing {
	
	//object is the super classs is parent of the child class by default ...
	
	//finalize()---its a method ---in object class
	
	@Override
	public void finalize() {  //clean up activity we write in finalze method so garbage collector will destroy null refernce object
		System.out.println("Inside testing ----finalize method ");
		
	}
	
	

	public static void main(String[] args) {  //overridden method in finalize needs to do ...
		
		
		
		Testing t = new Testing();
		t=null; //object got null value 
		System.gc();
		
		System.out.println("this is main mthod/....");
		
		
		

	}

}
