package Oops_Interface;

public interface WebDriver extends SearchContext {
	
	int timeout= 10 ;
	//interface variables are final & static 

	//method cannot have method body
	//only method declaration
	//these methods are caled abstract class
//	public abstract void get();  //abtract you wrrit or not its a by default abstract method
	//cannot create the object of interface
	//private method cannot be overridden
	
	
	public void get(String url);
	
	public String getTile();
	
	public void close();
	
	public void findelement(String element);
		
	public void bug();
	
	//after jdk 1.8
	 //we can have static method  with method body;
	
	public static void cloud() {
		System.out.println("WebDriver----cloud");
	}

	//2. default method wth method body
	
	default void openSource() {
		System.out.println("WD---Open source");
	}
	
	
}
