package JavaSessions;

public class B {

	public static void main(String[] args) {

		System.out.println("A----Main");
		A.main(args);
		
		//it will get terminate after StackOverflowError ...
	}

}
