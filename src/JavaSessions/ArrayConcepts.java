package JavaSessions;

public class ArrayConcepts {

	public static void main(String[] args) {

		
//		int i=10;
//		i=20;
//		i=30;
//		System.out.println(i);
//		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println("li="+0);
		int len = i.length;
		System.out.println("length="+ len);
		System.out.println("hi="+(len-1));
	    
		System.out.println(i[0]);
		System.out.println(i[3]);
		
//		System.out.println(i[4]);   //ArrayIndexOutOfBoundsException
		
		System.out.println(i[0]+i[1]);
		
		// TO PRINT ALL THE VALUES FROM ARRAY ; FOR LOOP
		
		for(int k=0; k<i.length;k++) {
			System.out.println(i[k]);
		}
			
			//FOR EACH LOOP OR ENHANCED FOR LOOP
			
			for(int bindu : i) {
				System.out.println(bindu);
			}
			
			//double array
	        double d[]= new double[2];
			d[0]=10.33;
			d[1]= 11.20;
			
			System.out.println(d[0]);
			
			//char array
			
			char c[]= new char[2];
			c[0]='a';
			c[1]='1';
				
			System.out.println(c[0]);
			
			//string array
			
			String s[]= new String[3];
			s[0]= "Bindu";
			s[1]= "Vidushi";
			s[2]=  "Ankur";
//			s[3]="loveeachother";
			
			for(String e : s) {
				System.out.println(e);
			}
			
			
			
		//new is the keyword for array memory allocation
			
		// for each loop i am not using the indexing format   //for loop we can have indexing loop to get the particular index value
			
		
		//store diff data types in the same variable --- object array :static-- object is the class o capital
			
			Object  ob[]= new Object[4];
			ob[0]= 25;
			ob[1]="Vidushi";
			ob[2]= 'c';
			ob[3]= 10.33;
			
         for(Object e : ob)	{
        	 System.out.println(e);
         }
         
         for(int p=0; p<i.length; p++) {
        	 System.out.println(ob[p]);
        	 if(ob[p].equals(25)) {
        		 System.out.println("under age...........");
        	 }
         }
			
			// object to int when comparing we use equal to word not  ==;;;;int to int == can use ;
         
         
         //1. new is the keyword
         //2. array literals
         
         int num[]= {0,1,2,3,8,7,4,9,5};
         System.out.println(num[0]);
         
         for(int e : num) {
        	 System.out.println(e);
         }
			
			
			//in array literals when i am sure about the size that how many elements can accomadate
         // in array i am not sure about the elements i can accomodate 
         //ex : int i[]= new int[100];
         i[0]= 10;
         System.out.println(i[0]);

        // in the above case i have used only 1 index or memory to store 0 rest 99 segments are wastage ;;;thisi sthe disadvatage of array
         
         
        //In dynamic array i can add or remove the segments to store the value;;;;; So ARRAYLIST came into picture 
         
//         ARRAYLIST ; HASHMAP;   ARE DYNAMIC ARRAY --- are the data structure 
			
			
		
	}

}
