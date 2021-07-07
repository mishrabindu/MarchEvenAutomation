package Oops_Interface;

public class TestSelenium {

	public static void main(String[] args) {
		
		System.out.println(WebDriver.timeout);

		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		String title= driver.getTile();
		System.out.println(title);
		if(title.equals("google")) {
			System.out.println("Pass");
		}
		
		driver.findelement("search");
		driver.bug();
		driver.close();
		
		driver.smokeTesting();
		driver.regressionTesting();
		driver.chromeVersion();
	
		driver.back();
		driver.forward();
		driver.click();
		
		//top casting --child class object can be referred by parent interface ref variable
		
		WebDriver dr= new ChromeDriver();
		dr.getTile();
		dr.bug();
		dr.close();
		dr.click();
	
		
		//downcasting : not possible 
	
	}
	
	
	
	

}
