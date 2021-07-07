package SuperKeyword;

public class StringManipulation {

	public static void main(String[] args) {

		String s1= "Bindu";
		String s2= "Automation";
		
		System.out.println(s1.compareTo(s2)>0);
		
		String S3= "     Hello  Everyone      1      ";
		System.out.println(S3.trim());
		
		int n= s1.length();
		System.out.println(n);
		
		char first = s1.charAt(0);
		char last= s1.charAt(n-1);
		System.out.println(first);
		System.out.println(last);
		
		String r= "this is automation selenium java";
		System.out.println(r.contains("java"));
		
		System.out.println(r.substring(0, 15));
		
		int len= s1.length();
		
		String rev = " ";
		
		for (int i= len-1;i>=0;i--) {
			
			rev= rev+s1.charAt(i);
		}
		System.out.println(rev);
		
//		for(int i=0; i<=5;i++) {
//			
//			for(int j=0 ;j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<=4; i++) {
			
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		String lol= "xXTestingXxXseleniumXXxXJavaX";
	    String laugh[]= lol.split("xX");
	    System.out.println(laugh[0]);
	    System.out.println(laugh[1]);
	    System.out.println(laugh[2]);
	    System.out.println(laugh[3]);
	    System.out.println(laugh[4]);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
