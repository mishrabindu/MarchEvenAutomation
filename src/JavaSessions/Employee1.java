package JavaSessions;

import java.util.ArrayList;

public class Employee1 {
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting the marks for .......:"+ studentName);
		
		if(studentName.equals("Sachin")) {
			return 90;
			
		}
		else if(studentName.equals("neha")) {
			return 92;
			
		}
		
		else {
			System.out.println("not found ..... ");
			return -1;

		}
		
	}
	
	//waf-------launch browser
	// input(parameter) ---> brName(String)
	//return -->boolean
	
	public boolean launchbrowser(String brName) {
			System.out.println("browsr name is : "+ brName);
			
			switch (brName) {
			case "chrome":
				System.out.println("chrome is launched");
				return true;   //in switc once condtn satifies retrun will come out of the function...
				

			default:
			System.out.println("browser is not found");	
			return false;
			}
	}
		
	// 254 parameters for non static methods--- int ,short,float,byte,classtype
	// 255 param for static methods----int ,short,float,byte,classtype
	//127 param---> long ,double
	
	//WAF : getEmpInfo
	//para,---> empName(String)
	//return ----> Array of devices (String)
	
	public String[] getEmpDevices(String name) {
		String devices[]= new String[5];
		
		if(name.equals("Abhi")) {
			devices[0]= "Macbook Pro";
			devices[1]= "ipone12";
		}
		else {
			System.out.println("devices not found");
		}
		return devices;
	
	}
	
	//
	public ArrayList<String> getPageLinks(String pageName) {
		System.out.println(" page name is : "+ pageName);
		ArrayList<String> linklist= new ArrayList<String>();
		
		switch (pageName) {
		case "Loginpage":
			linklist.add("login");
			linklist.add("forgot password");
			linklist.add("registration");
			
			break;

		default:
			System.out.println("page not found");
			break;
		}
		
		return linklist;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Employee1 e1= new Employee1();
		int marks =e1.getStudentMarks("neha");
		System.out.println(marks);
		
		
		e1.launchbrowser("chrome");
		if(e1.launchbrowser("chrome")){
			System.out.println("enter the URL....--> http://www.google.com");
		}

		System.out.println(e1.getEmpDevices("Abhi").length);
		System.out.println(e1.getEmpDevices("Abhi")[0]);
        
		System.out.println(e1.getPageLinks("Loginpage").size());
		
		
		
		
		
		
		
		
		
	}

}
