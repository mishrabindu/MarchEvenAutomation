package JavaSessions;

public class StaticVsNonStatic {
	
	String name;
	static final int age=30;
	
	public void testmail() {
		System.out.println("test mail method");
	}

	public static void sendmail() {
		System.out.println("send mail method");
	}
	
	
	public static void main(String[] args) {
		
		//non static stuff need to create the object
		
		StaticVsNonStatic obj = new StaticVsNonStatic();
		obj.name="Bindu";
		obj.testmail();
		System.out.println(obj.name);
		
		System.out.println(StaticVsNonStatic.age);
		
		StaticVsNonStatic.sendmail();
	}

}
