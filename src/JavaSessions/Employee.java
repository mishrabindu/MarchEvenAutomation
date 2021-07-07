package JavaSessions;

public class Employee {
	
	//WAF
	//INPUT PARAMETER : studentName(String)
	//return  : marks(int)
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting the marks for : "  + studentName);
		
		if(studentName.equals("Sachin")) {
			return 90;
		}
		else if( studentName.equals("sonia")) {
			return 95;
			
		}
		else {
			System.out.println(" No student found-----404 error found");
			return -1;
		}
	}
	
	//WAF --- Launch browser
	//parameter--- > browserName(String)
	//return---->  boolean
	
	public boolean launchBrowser(String browserName) {
		System.out.println("launch browser name :" +  browserName);
		
		switch (browserName) {
		case "Chrome":
			System.out.println("chrome is launched");
			return true;
		case "IE":
			System.out.println("IE is launched");
			return true;
		case "FF":
			System.out.println("FF is launched");
			return true;
		case "Edge":
			System.out.println("Edge is launched");
			return true;
			

		default:
			System.out.println("browser not found:");
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		Employee obj = new Employee();
		
		int m1= obj.getStudentMarks("radhika");
		System.out.println(m1);

		
		System.out.println(obj.launchBrowser("Chrome"));
		
		
		//FUNCTION parameter limit is :
		//int ,short,byte,float,classtype - 254 parameters- non static methos
		// long ,double -  127 parameters
		
		
		
		
		
		
		
	}

}
