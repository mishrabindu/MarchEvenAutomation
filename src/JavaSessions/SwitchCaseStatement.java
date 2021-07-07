package JavaSessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		 String browser= "Chrome";
		 
		 switch (browser) {
		case "Chrome":
			System.out.println("Launch Chrome");
			break;
         case "Firefox":
        	 System.out.println("Launch Firefox");
        	 break;
        	 
        	 
		default:
			System.out.println(" browser not found" + browser);
			break;
			
			
		}
	}

}
