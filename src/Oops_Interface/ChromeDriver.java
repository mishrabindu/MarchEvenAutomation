package Oops_Interface;

public class ChromeDriver extends Browser implements WebDriver , Testing{
	
	public ChromeDriver() { // constructor i have created 
		System.out.println("launch chrome driver");
	}

	@Override
	public void get(String url) {
		System.out.println("launch the URL : " + url);
		
	}

	@Override
	public String getTile() {
		return "google";
	}

	@Override
	public void close() {
		System.out.println("close the brwsr");
		
	}

	@Override
	public void findelement(String element) {
        System.out.println("find element");		
	}

	@Override
	public void smokeTesting() {
        System.out.println("smoke testing");		
		
	}

	@Override
	public void regressionTesting() {
        System.out.println("regression testing");		
		
	}

	@Override
	public void bug() {
        System.out.println("bug raised");	 		
	}


   public void chromeVersion() {
	   System.out.println("chrome Version");
   }

    @Override
    public void click() {
   System.out.println("click");	
}
    
    //method hiding 
//    public static void cloud() {
//		System.out.println("WebDriver----cloud");
//	}
   //default parent method in class with public  
    public void openSource() {
		System.out.println("WD---Open source");
	}
	

}
