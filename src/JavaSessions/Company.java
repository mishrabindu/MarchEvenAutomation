package JavaSessions;

public class Company {
	
	String name;
	int shareprice;
	String HQ;
	
	
	public static void main(String a[]) {
		
		
		Company c1= new Company();
		
		c1.name="IBM";
		c1.shareprice = 10;
		c1.HQ = "NY";
		
		Company c2= new Company();


		c2.name="Infosys";
		c2.shareprice = 20;
		c2.HQ = "NJ";    // Instead of writing for other cases  by creating object fr n companies then its very lenghty ..so 
                          //so Constructor came into picture
		
		

	}

}
