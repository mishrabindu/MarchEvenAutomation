package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcepts {
	//hashmap will take key ,value format
	//parent interface of arraylist is list interface
	//so parent interface of haspmap is map.

	public static void main(String[] args) {
		
		//do topcasting 
		//it doesnt maintina any order..when we fetechthe data we get in any order....
		
		Map<String, String> mp =new  HashMap<String, String>();

		//  .put to add in hashmap
		
		mp.put("A", "TOM");
		mp.put("B", "lISA");
		mp.put("C", "TINA");
		mp.put("D", "TIGER");
		mp.put("D", "raj");
		mp.put(null, "raj");

		

		
		
		System.out.println(mp.get("A"));
		System.out.println(mp.get("F"));  //NULL value no f is there 
		System.out.println(mp.get("D")); //i will get update value ..nt the tiger
		System.out.println(mp.get(null));

		//dafult capacty of hasmap is =
		//to print all values form hashmap
		
		mp.forEach((k ,v) -> System.out.println(k + ":" + v));

		
		
		
		
		
		
		
		
		
	}

}
