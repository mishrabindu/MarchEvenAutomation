package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListAssignments {

	public static void main(String[] args) {

		//create arraylist ,add some colors(string) and print
//		
		ArrayList<String> colors = new ArrayList<String>();
	
		colors.add("Blue");
		colors.add("Red");
		colors.add("Orange");
		colors.add("white");
		colors.add("Yellow");

//		System.out.println(colors.size());
//		System.out.println(colors.get(0));
////		System.out.println(colors.get(5));  //IOE
//		
//		System.out.println(colors);
		
//		for(String e : colors) {
//			System.out.println(e);
//		}
//		
//		for(int i=0; i<colors.size(); i++) {
//			System.out.println(colors.get(i));
//		}
		
		//2. to insert an element into arraylist at the first and last position
		
		colors.add(0, "indigo");
		colors.add(6, "30");
		
		System.out.println(colors);
		
		
		//3. retrieve an element from the array list at a specified index
		
		System.out.println(colors.get(3));
		
		// 4. update specific element by given element 
		
		colors.add(2, "pink");
		
		System.out.println(colors);
		
		//5. remove the third element 
		
		colors.remove(2);
		
		System.out.println(colors);
		
		//6. search an element in arraylist
		
		ArrayList<String > ar = new ArrayList<String>();
		
		ar.add("Megha M");
		ar.add("Malini M");
		ar.add("Rekha R");
		ar.add("Mital M");
		ar.add("Swapna S");
		
		System.out.println(ar);

		ar.stream().filter(ele -> ele.contains("M")).forEach(ele->System.out.println(ele));		
		
		if(colors.contains("Red")){
			System.out.println("Red is found");
		}
			else {
				System.out.println("Not found");
			}
				
		//7. reverse the element in arraylist
		
	  Collections.reverse(colors);	
	  System.out.println(colors);
	  
	  //8. get the portion of the arraylist
	  
	 System.out.println(colors.subList(0, 3));
	 
	 //9.swap two elements in a arraylist
	 
	 
	 System.out.println("Before swapping:.....");

	 for(String e : colors) {
		 System.out.println(e);
	 }
	 
	 System.out.println("After swapping:.....");
	 
	 Collections.swap(colors, 2, 3);
	 
	 for(String e: colors)
	 {
		 System.out.println(e);
	 }

	 
	 //10. to empty an arraylist
	 
//	 colors.removeAll(colors);
//	 System.out.println(colors);
//	 
	  //or
//	 colors.clear();
//	 System.out.println(colors);
	 
	 //11. trim the VC the currrent size list 
	 
	 colors.trimToSize();
	 System.out.println(colors);
	 
	// 12. print all elements using position of all elements
	 
	 for(int i=0; i<colors.size();i++) {
		 System.out.println(colors.get(i));
	 }
	 
	 
	 System.out.println(20 / 0.0);
	 System.out.println(Double.MIN_VALUE);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			}

}
