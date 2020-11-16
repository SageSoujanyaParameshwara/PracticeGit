package JavaPrograms;

import java.util.*;
import org.testng.annotations.Test;

public class StreamsAndLists {
  
	@Test(enabled = false)
  public void streaming() {
		//adding elements to list
	  ArrayList<String> list = new ArrayList<String>();
	  for(int i=0; i<5; i++) {
		  list.add("Hello"+i);
	  }
	  
//	  list.stream().filter(s->s.contains("2")).forEach(s->System.out.println(s));
//	  list.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
	  list.stream().filter(s->s.equalsIgnoreCase("hello3")).forEach(s->System.out.println(s));
	  long count = list.stream().filter(s->s.equalsIgnoreCase("hello3")).count();
	  System.out.println("Count is: "+count+" "+ list);
	  
	  long i = list.stream().filter(s->s.length()>5).count();
	  System.out.println(i);
	  
	  list.stream().filter(s->s.length()>5).limit(3).forEach(s->System.out.println(s));
  }
	
	@Test(enabled= true)
	public void testSWapping() {
		int[] array= new int[] {23,34,5,-56,7,8,100,200,33};
		int j=0;
		for(int i=0; i<array.length; i++) {
			for( j=array.length-1-i; j>i ; j--) {
				if(i != j) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					break;
				}
			}
			if(i==j)
				break;
		}
		
		System.out.println(Arrays.toString(array));
		
	}
  
  
}
