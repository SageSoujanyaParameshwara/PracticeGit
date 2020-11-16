package MyJavaPrcatice.JavaStuff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class JavaStuff {
	@Test(enabled = false)
	public void uniqueNum() {

		int[] a = { 1, 3, 3, 2, 2, 5, 6, 4, 5, 6, 6 };
				
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!list.contains(a[i])) {
				k++;
				list.add(a[i]);
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}
				}
				if (k == 1) {
					list2.add(a[i]);
					System.out.println("unique no. is: " + a[i]);
				}
			}

		}
		System.out.println(list2);
		
		

	}

	@Test(enabled = false)
	public void interviewTest() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");

		System.out.println("Contents of list ::" + list);

		String[] str = new String[list.size()];

		list.toArray(str);

		for (String s : str) {
			System.out.print(s + " ,");
		}

	}

	@Test(enabled = false)
	public void cap() {
		String[] stringArray = { "ajay", "John", "Cat", "List", "Drone", "Elephant" };

		String str = "EALCDJ";
		//Simple way to sort the array --
//		Arrays.sort(stringArray);
//		System.out.println(Arrays.toString(stringArray));
		char[] ch = str.toCharArray();
		int charLen = ch.length;
		int stLen = stringArray.length;
		ArrayList<String> list = new ArrayList<String>();

		for (int j = 0; j < charLen; j++) { // requiredArray

			for (int i = 0; i < stLen; i++) { // stringArray

				char[] sample = stringArray[i].toCharArray();
				if (ch[j] == sample[0]) {

					list.add(stringArray[i]);
				}
			}
		}

		System.out.println("Expected sorted String: " + list);
		String[] myArray = new String[list.size()];
		list.toArray(myArray);

	}

	@Test(enabled= false)
	public void test() {

		String S = "abccbd";  //"aaaa";

		StringBuilder build = new StringBuilder();
		int[] c = { 0, 1, 2, 3, 4 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedHashSet<String> l = new LinkedHashSet<String>();

		char[] ds = S.toCharArray();

		for (int i = 0; i < ds.length; i++) {
			int count =1;
			for (int j = i + 1; j < ds.length; j++) {
				if (ds[i] == ds[j]) {
					l.add(Character.toString(ds[j]));
					list.add(c[i]);
					count++;
					i++;
					break;
				} 
				else if(count<=1){
					l.add(Character.toString(ds[i]));
					break;					
				}
			}
		}
		
		int sum = 0;		
		int[] d = new int[list.size()];
		System.out.println(list);
	      for(int m=0; m<list.size(); m++) {
	    	  d[m] = list.get(m).intValue();
	      }
	  	for (int k = 0; k <d.length; k++) {
			sum= sum+d[k];
		}	      
		System.out.println(l);
		System.out.println(sum);

	}

	@Test(enabled = false)
	public void listToArray() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> str = new ArrayList<String>();
		list.add(1);
		list.add(2);
		list.add(55);
		list.add(98);
		list.add(34);
		
		int[] array = new int[list.size()];
		for (int i=0; i <list.size() ; i++) {
			array[i] = list.get(i).intValue();
		}
		
		str.add("hello"); 
		str.add("hi");
		str.add("how are you");
		String[] strArray = new String[str.size()];
		str.toArray(strArray);
		for(String s : strArray) {
			System.out.print(s+ " ,");
		}
		
		
	}
	
@Test(enabled = true)
public void testOne() {
	int[]  a= new int[] {1,4,6,4,2,34,531,12,32};
	
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
}
	
}
