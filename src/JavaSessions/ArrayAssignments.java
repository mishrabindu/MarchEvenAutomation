package JavaSessions;

public class ArrayAssignments {

	public static void main(String[] args) {

		// 1. print the patern using for loop

		// 00 01 02 03 04 05 06 07 08 09

//		String num[]= { "00" ,"01", "02", "03", "04", "05", "06", "07", "08", "09" };

//		for( String e : num) {
//			System.out.println(e);
//		}

		// 2. create static array having cricket data

//	    String name= "Tom";
//	    int age= 30;
//	    String teamname= "Daredevils";
//	    String DOB = "07-08-90";
//	    char gender= 'm';
//	    double StrikeRate= 6.22;
//	    boolean isActive= true;

		Object ob[] = new Object[6];

		ob[0] = "Tom";
		ob[1] = 30;
		ob[2] = "07-08-90";
		ob[3] = 'm';
		ob[4] = 6.22;
		ob[5] = true;

		System.out.println("--------------for each loop---------------------");

		// for each loop;
		for (Object e : ob) {
			System.out.println(e);
		}

		// for loop;
		System.out.println("--------------for loop---------------------");

		for (int p = 0; p < ob.length; p++) {
			System.out.println(ob[p]);
		}

		// while loop
		
		System.out.println("--------------while loop---------------------");
		
		int k=0;
		while(k<ob.length) {
			System.out.println(ob[k]);
			k++;
			
		}

		Object ob1[]= new Object[6];
		
		ob1[0] = "Peter";
		ob1[1] = 32;
		ob1[2] = "07-07-90";
		ob1[3] = 'f';
		ob1[4] = 6.22;
		ob1[5] = true;
		
		for(Object e: ob1) {
			System.out.println(e);
		}
		

		
		int j[]= new int[5];
		j[0]=4;
        j[1]=3;
        j[2]=2;
        j[3]=1;
        j[4]=0;
        
        for( int l=0;l<j.length; l++) {
        	System.out.println("n = "+ j[l]);
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
