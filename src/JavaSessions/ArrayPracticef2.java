package JavaSessions;

public class ArrayPracticef2 {

	public static void main(String[] args) {

		
		
//		int i=20;//local variable 
//		i=30;
//		System.out.println(i);
		
		int i[]= new int[4];
		i[0]= 10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		int length= i.length;
		
		System.out.println(length);
		System.out.println("li="+ " " + 0);
		System.out.println("hi=" + " " +(length-1));
		System.out.println(i[0]);
//		System.out.println(i[4]);
		
		
		for(int p=0;p<i.length; p++) {
			System.out.println(i[p]);
		}
		
		
		for(int e : i) {
			System.out.println(e);
		}
		
//		Object is used to store dififent data types in the same array variable
		
		Object ob[]= new Object[3];
		ob[0]= "Bindu";
		ob[1]= 10.02;
		ob[2]= 's';
		
		for(Object e : ob) {
			System.out.println(e);
		}
		  
//		Arrayliterlas  when i have fixed data to use ....
//		int j[]= new int[1000];  here i mnot sure whether i m using 1000 segments 
		 int num[]= {2,3,4,40,506,8,4};
		 for(int e : num) {
			 System.out.println(e);
		 }
		
		System.out.println(num[0]);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
