package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		//ArrayList --- is dynamic array
		//noneed to mention size of the arraylist
		//to use arraylist we have to create object of arraylist;
  
	//arraylist is a class so when creating class arraylist classname shouldnot be same ..so i created ArrayListConcepts
		
		//default value of Vc(vertual capacity=10)
		// dynamic array
		// no need to mention the size of the AL
		// TO Use arraylist we need to create object of arraylist
		//its an order/index based collection
		ArrayList<Object> ar= new ArrayList<Object>();
		
 		System.out.println(ar.size());   //arraylist size = pc =0 ..we havent added any value;
		ar.add(100); //0
		ar.add(200); //1
	
		System.out.println(ar.size());//2
		
		ar.add(300); //2
		ar.add(400);  //3
		
		
		ar.add(500);  //4
		
		System.out.println(ar.size());//5
		
		ar.add(600); //5
		ar.add(700);  //6
		ar.add(800);  //7
		
		System.out.println(ar.size());//8
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(7));
		
//		System.out.println(ar.get(8));  //Arrayindexoutofboundsexception
		
		//to print all values from Arraylist;  Using for loop;
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		//rawtype   : itmeans u can any value in arra list but java doesnt like it ..so put diamond bracket with ohject type of data
		//this concept is called generics in java ...ie object type of generics
		
		
		//for each loop
		
		for(Object e : ar) {
			System.out.println(e);
		}
		
		//list-which will hold student marks;
		
		ArrayList<Integer>  marklist= new ArrayList<Integer>();
		
		marklist.add(1000); //0
		marklist.add(2000); //1
		
		System.out.println(marklist.get(0));
		
		//String type data 
		
		ArrayList<String> namesList = new ArrayList<String>(20);  //it means we are passing 20 ..vc= woud be 20   (0-19 )
		
		
		namesList.add("Seema"); //0
		namesList.add("Ravi");  //1
		namesList.add("rema");  //2
		namesList.add("Pavan");  //3
		
		System.out.println(namesList.size());  //4
		
		namesList.remove(2);  //value will be removed 
		System.out.println(namesList.get(2));  //pavan 

		
		for(String e : namesList) {
			System.out.println(e);
		}
		
		System.out.println(namesList);
		
         ArrayList<String> EmpList = new ArrayList<String>(20);  
		
		
         EmpList.add("Seema"); //0
         EmpList.add("Ravi");  //1
         EmpList.add("rema");  //2
         EmpList.add("Pavan");  //3
//         EmpList.add("Pavan");  //4
         
         System.out.println(EmpList);   //here we are allowed to add duplicate value ...null value...blank values)
         
         //Streams on List:
         //JDK 1.8:  ADDED AFTER 1.8 
         
//         EmpList.stream().forEach(ele -> System.out.println(ele));                   //it will convert the arraylist in terms of stream...we can use as chaining mechanism
         
        EmpList.stream().forEach(ele -> System.out.println(ele));
        
         		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}

}
