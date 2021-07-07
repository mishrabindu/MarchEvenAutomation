package JavaSessions;

public class MethodChainingConcept {
	
	static int age=30; //only static variable can be create only on class not in methods .
	//local variable can be used in methods but i can make final to local variable .
	
	public void launchBrowser() {
		System.out.println("launchbrowser");
		checkVersion();
	}

	public void checkVersion() {
		System.out.println("checkVersion");
		checkOS();
	}
	public void checkOS() {
		System.out.println("checkOS");
		checkRAM();
	
	}
	public void checkRAM() {
		System.out.println("checkRAM");
	}
	
	public static void test1() {
		System.out.println("test1.....");
		test2();
	}
	
	public static void test2() {
		System.out.println("test2.....");
		test3();
	}
	
	public static void test3() {
		System.out.println("test3.....");
	}

	public static void main(String[] args) {
		
		MethodChainingConcept  obj= new MethodChainingConcept();
		
		obj.launchBrowser();
		MethodChainingConcept.test1();
		

		
		
	}

}
