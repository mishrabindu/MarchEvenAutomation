package JavaSessions;

public class IfelseCondition {

	public static void main(String[] args) {
    String browser = "Opera";
    if(browser.equals("Chrome"))
    {
    	System.out.println("Launch Chrome");
    }
    else if(browser.equals("Mozilla")) {
    	System.out.println("Launch Mozilla");
    }
    else if(browser.equals("Edge")) {
    	System.out.println("Launch Edge");
    }
    else if(browser.equals("IE")) {
    	System.out.println("Launch IE");
    }
    else {
    	System.out.println("no browser found");
    }
    
    
    
    
	}

}
