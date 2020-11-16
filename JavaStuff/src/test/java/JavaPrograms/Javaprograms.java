package JavaPrograms;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Javaprograms {
	@Test(enabled = false)
	public void f() {
		String s = "HapPinesS";
		StringBuilder build = new StringBuilder();
		// build.replace(0, 2, "");
		// String a = s.replaceAll("s", "");
		// System.out.println(build);
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLowerCase(ch[i])) {
				String t = String.valueOf(Character.toUpperCase(ch[i]));
				build.append(t);
			} else {
				String t = String.valueOf(Character.toLowerCase(ch[i]));
				build.append(t);
			}
		}
		System.out.println(build);
		
		String str= "Its a new feature to learn today";
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		StringBuilder builder = new StringBuilder();
		System.out.println("Actual: "+str);
		while(tokenizer.hasMoreTokens()) {
			builder.append(tokenizer.nextToken());
			builder.append(" ");
		}
		System.out.println(builder.reverse());
	}

	@Test(enabled = false)
	public void readNwrite() {
		File readFile = new File("C:\\Users\\soujanya.p\\Desktop\\Interview\\Reading.txt");
		File writeFile = new File("C:\\Users\\soujanya.p\\Desktop\\Interview\\writing.txt");
		try {

			BufferedReader br = new BufferedReader(new FileReader(readFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(writeFile));
			String line = "";

			while ((line = br.readLine()) != null) {
				System.out.println(line);
				bw.write(line);
			}
			bw.close();
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(enabled = false)
	public void hashMapexample() {
		String str = "This this is is done by Saket Saket";
		String[] check = str.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < check.length; i++) {
			if (map.containsKey(check[i])) {
				int count = map.get(check[i]);
				map.put(check[i], count + 1);
			} else {
				map.put(check[i], 1);
			}
		}

		// System.out.println(map);

		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> s = (Map.Entry) iterator.next();
			System.out.println(s.getKey());// returns only that single key
		}
	}

	@Test(enabled = true)
	public void arrayListing() {
		String[] names = { "Tom", "Bob", "Jerry", "Hanna", "Alex" };
		//Sort using list and treeSet
		 ArrayList<String> list = new ArrayList<String>();
		 TreeSet<String> set = new TreeSet<String>();
		 for (String s : names) {
		 set.add(s);
		 list.add(s);
		 }
		 Collections.sort(list);
		 System.out.println(set);
		
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].compareToIgnoreCase(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		for (String s : names) {
			System.out.print(s + " ,");
		}
		System.out.println("\n");
		System.out.println("DONE");

	}

	@Test(enabled = false)
	public void testMap() {
		// insertion order is not there
		// Hashmap is not thread safe. But Hashtable is thread safe.
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Set");
		map.put(2, "Values");
		map.put(3, "Entry object");
		map.put(4, "views");
		map.put(5, "map");
		map.put(6, null);

		System.out.println(map.keySet()); // returns all the keys
		System.out.println(map.values()); // returns all the values
		System.out.println(map.entrySet());// returns all key value pairs

		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry next = (Map.Entry) iterator.next();
			System.out.println(next.getKey() + "---" + next.getValue());
			if (next.getKey().equals(1)) {
				next.setValue("newSet");
			}
		}

		System.out.println(map);

	}

	@Test(enabled = false)
	public void testMap2() {
		String words = "Given a string, convert the characters of the string into opposite";
		String[] word = words.split(" ");
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < word.length; i++) {
//			map.put(word[i], 1);
			if (map.containsKey(word[i])) {
				int count = map.get(word[i]);
				map.put(word[i], count + 1);
			} else {
				map.put(word[i], 1);
			}
		}
		System.out.println(map.values());
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "---" + m1.getValue());
		}

		TreeSet<Integer> set2 = new TreeSet<Integer>(map.values());
		System.out.println(set2);
	}

	@Test(enabled = false)
	public void fibonacciSeries() {
		//0,1,1,2,3,5,8,13,21..
		int count=10;
		int[] a= new int[10];
		
		a[0] =0;
		a[1] =1;		
		for(int i =2; i<count; i++) {
			a[i] = a[i-1]+a[i-2];
		}
		
//		for(int k:a) {
//			System.out.print(k+",");
//		}
//		System.out.println("\n");
		System.out.println(Arrays.toString(a));
		
		//2nd way
		int k=0;
		int num1 =0; int num2=1; 
		while( k <count) {
			System.out.print(num1+",");
			int num3 = num1+num2;
			num1=num2;
			num2=num3;			
			k++;
		}
	}

	@Test(enabled = false)
	public void factorial() {
		//4*3*2*1 =24
		int num=6;
		int product=1;
		for(int i=1;i<=num;i++) {
			product = product*i;
		}
		System.out.println(product);
		
	}
	
	@Test(enabled=false)
	public void getSum() {
		//sum the digits of a number
		int a =345;
		int sum =0;
		
		while (a !=0) {			
			sum = sum+ a%10;
			a= a/10; //34	
		}
		System.out.println(sum);
	}

	@Test(enabled = false)
	public void primeNum() {
		int[] num = new int[] {4,3,5,6,9,2,67,8,49,47,101};
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		
		for(int i :num) {
			if(i==2) {
				primeList.add(i);
				continue;
			}
			else if (i<=1 || i%2 ==0) {
				continue;
			}else {
				int k=2; 
				int flag= 0;
				while ( k<=i/2) {
					if(i%k ==0) {
						flag =1;
					} k++;
				}
				if(flag==0)
					primeList.add(i);
		}
		
		} System.out.println(primeList);
	}

	@Test(enabled= false)
	public void starWatch() {
		int count = 5;

		for(int i=1; i<=count; i++) {
			int k=1;
			while(k<=i) {
				System.out.print("* ");
				k++;
			}
			System.out.println("\n");
		}
		
		for(int i=1; i <=count ; i++) {
			for(int j=count; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1 ; k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}
	}

	@Test(enabled=true)
	public void stringPlay() {
		String word ="Write a Java Program to reverse a string without using String inbuilt function.";
		StringBuilder builder = new StringBuilder();
		builder.append(word);
		builder.reverse();
		System.out.println(builder);
		
		//reverse entire line but not the words
		String[] words = word.split(" ");
		System.out.println(words.length);
		StringBuilder builder2 = new StringBuilder();
		for(int i = words.length-1; i>=0 ; i--) {
			builder2.append(words[i]);
			builder2.append(" ");
		}
		System.out.println(builder2);
		
		//reverse using toCharArray()
		String str = "LinkedHashMap";
		char[] cs = str.toCharArray(); 
		String expected= "";
		for(int i=cs.length-1 ; i>=0; i-- ) {
			expected = expected.concat(Character.toString(cs[i]));
		}
		System.out.println("Expected: "+expected);
		
		//caps to small and viceversa
		
	}

}
