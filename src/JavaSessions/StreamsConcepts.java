package JavaSessions;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamsConcepts {

	public static void main(String[] args) {

		//without any array list i can create stream..
		
		IntStream.of(1,2,3,4,5,6,7).forEach(ele -> System.out.println(ele));
		
		IntStream.of(0,1,5,4).forEach(ele->System.out.println(ele));
		
		IntStream.range(1, 50).forEach(ele-> System.out.println(ele));
		
		IntStream.iterate(0, i-> i+2).limit(10).forEach(ele -> System.out.println(ele));
		
		
		ArrayList<String> empList = new ArrayList<String>();
		
		empList.add("Seema IBM");
		empList.add("Ravi");
		empList.add("Sonia IBM");
		empList.add("Rajat IBM");
		empList.add("Kiran");
		
		empList.stream().filter(ele-> ele.contains("IBM")).forEach(ele-> System.out.println(ele));
		
		
		empList
		  .stream()
		      .filter(ele -> ele.contains("IBM"))
		         .filter(ele -> ele.contains("S"))
		            .forEach(ele -> System.out.println(ele));  ///THIS IS CALLED STREAM PIPELINE CONCEPT...we can filter the data ...
		
		
		
		//Parallel stream
		
//		empList.parallelStream().forEach(ele -> System.out.println(ele));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
