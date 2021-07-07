package JavaSessions;

public class LoopsAssignment {

	public static void main(String[] args) {
		
		   //1. WAP to print I am Batman
		
		int i=1;
		
		while(i<=5) {
			System.out.println("I am Batman");
			i++;
		}
		
		//2. WAP to print I am Batman 9 times
		
		int j=1;
		do {
			System.out.println("I am Batman "+ j);
			j++;
		} 
		while (j<=9);
		
		// 10-1 Print using for while loop & do while 
		System.out.println("----------do while---------------");
		int k=10;
		
		do {
			System.out.println(k);
			--k;
		} 
		while (k>=1);
		
		System.out.println("------------while loop---------------------");
		
		int i1=10;
		while(i1>=1) {
			System.out.println(i1);
			--i1;
			
		}
		
		System.out.println("-----Hello World-10times--------");
		
		int p=1;
		
		while(p<=10) {
			System.out.println("Hello World");
			p++;
		}
		
		System.out.println("-----------------Print-1-10 ----------------multiple of 7 occur----------");
		
	   int m=1;
	   while(m<=10) {
		   System.out.println(m);
		   if (m%7==0) {
			   System.out.println("7 encountered");
			   break;		
		}
		 m++;  
		   
	   }
		
		
	   //sum of  naturals number 1-1000;
	   
	   int sum=0;
	   for (int d=1; d<=1000; ++d) {
		   sum= sum+d;
		   System.out.println("Sum= "+  sum);
		   
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
