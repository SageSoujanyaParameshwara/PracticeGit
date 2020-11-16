package JavaPrograms;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.*;

public class Javaprograms2 {
	@Test(enabled = false)
	public void stringPlay() {
		String word = "Write a Java Program to reverse a string without using String inbuilt function.";
		StringBuilder builder = new StringBuilder();
		builder.append(word);
		builder.reverse();
		System.out.println(builder);

		// reverse entire line but not the words
		String[] words = word.split(" ");
		System.out.println(words.length);
		StringBuilder builder2 = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			builder2.append(words[i]);
			builder2.append(" ");
		}
		System.out.println(builder2);

		// reverse using toCharArray()
		String str = "LinkedHashMap";
		char[] cs = str.toCharArray();
		String expected = "";
		for (int i = cs.length - 1; i >= 0; i--) {
			expected = expected.concat(Character.toString(cs[i]));
			// String.valueOf(cs[i]) //other way of converting to String
		}
		System.out.println("Expected reversred word: " + expected);

		// caps to small and viceversa
		StringBuilder build = new StringBuilder();
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (Character.isLowerCase(array[i])) {
				build.append(Character.toUpperCase(array[i]));
			} else {
				build.append(Character.toLowerCase(array[i]));
			}
		}
		System.out.println("Caps and small letters: " + build.toString());

	}

	@Test(enabled = false)
	public void listToArrayconversions() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("how");
		list.add("are");
		list.add("you?");
		System.out.println(list);
		String[] stringArray = new String[list.size()];
		list.toArray(stringArray);

		for (String s : stringArray) {
			System.out.print(s + ", ");
		}
		System.out.println("\n");

		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i <= 4; i++) {
			intList.add(i + 1);
		}
		System.out.println("From the intList: " + intList);
		int[] intArray = new int[intList.size()];
		int i = 0;
		for (int a : intList) {
			intArray[i++] = a;
		}
		System.out.println("converted to array: ");
		for (int b : intArray) {
			System.out.print(b + ",");
		}
		System.out.println("\n");

		// convert to list
		String[] newstr = { "tom", "bob", "bill", "jane", "Kat" };
		System.out.println(Arrays.asList(newstr));

		for (int k = 0; k < newstr.length; k++) {
			for (int j = k + 1; j < newstr.length; j++) {
				if (newstr[k].compareToIgnoreCase(newstr[j]) > 0) {
					String temp = newstr[k];
					newstr[k] = newstr[j];
					newstr[j] = temp;
				}
			}
		}
		for (String s : newstr) {
			System.out.print(s + ",");
		}
		System.out.println("\n");

		List<String> list2 = Arrays.asList(newstr);
		TreeSet<String> set = new TreeSet<String>();
		set.addAll(list2);
		System.out.println(set);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);

	}

	@Test(enabled = false)
	public void testHashMap() {
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		String word = "There are several ways with which you can reverse your string if you are allowed to use the other string inbuilt functions.";
		String[] words = word.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (map.containsKey(words[i])) {
				Integer count = map.get(words[i]);
				map.put(words[i], count + 1);
			} else {
				map.put(words[i], 1);
			}
		}
		System.out.println(map);
		System.out.println("Keys only: " + map.keySet());
		System.out.println("Values only: " + map.values());
		System.out.println("Entry set: " + map.entrySet());

		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry next = (Map.Entry) iterator.next();
			System.out.println(next.getKey() + "--" + next.getValue());
		}
	}

	@Test(enabled = false)
	public void testPrime() {
		int num = 98;
		if (num == 1 || num % 2 == 0) {
			System.out.println(num + " is not prime");
		} else {
			int i = 2;
			int flag = 1;
			while (i < num / 2) {
				if (num % i == 0) {
					flag++;
				}
				i++;
			}
			if (flag == 1)
				System.out.println(num + " is prime");
			else
				System.out.println(num + " is not prime");
		}

	}

	@Test(enabled = false)
	public void primeNum() {
		int num = 97;
		if (num == 1 || num % 2 == 0) {
			System.out.println(num + " is not prime");
		} else {
			int i = 2;
			int flag = 1;
			while (i < num / 2) {
				if (num % i == 0) {
					flag++;
				}
				i++;
			}
			if (flag == 1) {
				System.out.println(num + " is prime");
			} else {
				System.out.println(num + " is not prime");
			}

		}

		int[] nums = new int[] { 1, 2, 4, 6, 7, 43, 9, 53, 11, 45 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				list.add(nums[i]);
				continue;
			}
			if (nums[i] <= 1 || nums[i] % 2 == 0) {
				continue;
			} else {
				int k = 2;
				int flag = 1;
				while (k < nums[i] / 2) {
					if (nums[i] % k == 0) {
						flag++;
						break;
					}
					k++;
				}
				if (flag == 1) {
					list.add(nums[i]);
				}
			}

		}
		System.out.println(list);

	}

	@Test(enabled = false)
	public void getSum() {
		int num = 565;
		int sum = 0;
		while (num > 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		System.out.println("Sum: " + sum);

	}

	@Test(enabled = true)
	public void testStars() {
		int star = 5;

		for (int i = 1; i <= star; i++) {
			int k = 1;
			while (k <= i) {
				System.out.print("* ");
				k++;
			}
			System.out.println("\n");
		}

		for (int i = 1; i <= star; i++) {
			for (int j = star; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" * ");
			}
			System.out.println("\n");
		}

		String s = "word";
		String d = "word";
		if (s == d) {
			System.out.println("equal");
		}
		if (s.equals(d)) {
			System.out.println("You got it !");
		}

		String t = new String("word");
		if (s == t) {
			System.out.println("Yes !");
		} else if (s.equals(t)) {
			System.out.println("Objects are equal");
		} else {
			System.out.println("Donno !");
		}

	}

	@Test(enabled = false)
	public void armsStrongNumber() {
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		// If you have a four-digit number lets say
		// 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634
		int num = 1634;
		String w = String.valueOf(num);
		int sum = 0;
		int n = 0;
		int k = 0;

		while (num > 0) {
			int product = 1;
			n = num % 10;
			for (int i = 1; i <= w.length(); i++) {
				product = product * n;
			}
			sum = sum + product;
			num = num / 10;
		}
		System.out.println("Armstrong number: " + sum);
		AssertJUnit.assertEquals(1634, sum);

	}

	@Test(enabled = false)
	public void testExcel() {
		File file = new File("C:\\Users\\soujanya.p\\Documents\\PracticeTest1.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int sheets = wb.getNumberOfSheets();
			for (int i = 0; i < sheets; i++) {
				if (wb.getSheetName(i).equalsIgnoreCase("testdata")) {
					XSSFSheet sheet = wb.getSheetAt(i);
					int numberOfRows = sheet.getPhysicalNumberOfRows();
					System.out.println("Number of rows: " + numberOfRows);
					Iterator<Row> iterator = sheet.iterator(); 
					while (iterator.hasNext()) {
						Row row = iterator.next();
						int numberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
						for (int k = row.getFirstCellNum(); k < numberOfCells; k++) {
							if (row.getCell(k) == null
									&& row.getCell(0).getStringCellValue().equalsIgnoreCase("Add profile")) {
								row.createCell(k);
								row.getCell(k).setCellValue("Hello***");
							} else if (row.getCell(k) == null
									&& row.getCell(0).getStringCellValue().equalsIgnoreCase("Delete profile")) {
								row.createCell(k);
								row.getCell(k).setCellValue("Hola !!");
							} else {
								if (row.getCell(k).getCellType() == CellType.NUMERIC) {
									System.out.print(row.getCell(k).getNumericCellValue() + " ");
								} else {
									System.out.print(row.getCell(k).getStringCellValue() + " ");
								}
							}
						}
						System.out.println("\n");
					}
				}

			}

			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			fis.close();
			wb.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	@Test(enabled = false)
	public void testGetSum() {
		int num = 345;
		int sum = 0;
		int actualNum = num;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of " + actualNum + " is: " + sum);
	}

	@Test(enabled = false)
	public void armsNumber() {
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		// If you have a four-digit number lets say
		// 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634

		int num = 1634;
		int numCheck = num;
		int sum = 0;

		String str = String.valueOf(num);

		while (numCheck > 0) {
			int product = 1;
			int n = numCheck % 10;
			for (int i = 0; i < str.length(); i++) {
				product = product * n;
			}
			sum = sum + product;
			numCheck = numCheck / 10;
		}
		System.out.println("its :" + sum);

	}

	@Test(enabled = false)
	public void testPrime2() {
		int num = 3;

		if (num == 2) {
			System.out.println("This is prime= " + num);
		} else if (num <= 1 || num % 2 == 0) {
			System.out.println("This number is not prime: " + num);
		} else {
			int i = 2;
			int flag = 1;
			while (i < num / 2) {
				if (num % i == 0) {
					flag++;
				}
				i++;
			}
			if (flag == 1) {
				System.out.println("Number is prime: " + num);
			} else {
				System.out.println("This number is not prime: " + num);
			}
		}

		int[] nums = new int[] { 33, 2, 53, 29, 31, 30, 45, 1989 };
		int len = nums.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				list.add(nums[i]);
			} else if (nums[i] <= 1 || nums[i] % 2 == 0) {
				continue;
			} else {
				int k = 2;
				int flag = 1;
				while (k < nums[i] / 2) {
					if (nums[i] % k == 0) {
						flag++;
					}
					k++;
				}
				if (flag == 1) {
					list.add(nums[i]);
				}
			}
		}
		System.out.println(list);

	}

	@Test(enabled = false)
	public void starWatch() {
		int m = 5;
		for (int i = 1; i <= m; i++) {
			int k = 1;
			while (k <= i) {
				System.out.print("* ");
				k++;
			}
			System.out.println("\n");
		}

		for (int i = 1; i <= m; i++) {
			for (int j = m; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" * ");
			}
			System.out.println("\n");
		}

	}

	@Test(enabled = false)
	public void testMaps() {
		String word = "GET and NAVIGATE do exactly the same thing, the only difference between them is that one is easier to type than other.";
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] split = word.split(" ");
		System.out.println(split[0] + "," + split[1]);

		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count + 1);
			} else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map.entrySet());

		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry next = (Map.Entry) iterator.next();
			// System.out.println(next.getKey()+"--"+next.getValue());
			if (next.getValue() == (Integer) 1) {
				next.setValue(100);
			}
			System.out.println(next.getKey() + "--" + next.getValue());
		}

	}

	@Test(enabled = false)
	public void testLists() {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i <= 4; i++) {
			intList.add(i + 1);
		}

		System.out.println(intList);
		int[] numsArray = new int[intList.size()];
		int k = 0;
		for (int i : intList) {
			numsArray[k++] = i;
		}

		System.out.println(Arrays.toString(numsArray)); // this will print whole array

		String[] newstr = { "tom", "bob", "bill", "jane", "Kat" };
		List<String> list = new ArrayList<String>();
		list = Arrays.asList(newstr);
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After sorting: " + list);

		for (int i = 0; i < newstr.length; i++) {
			for (int j = i + 1; j < newstr.length; j++) {
				if (newstr[i].compareToIgnoreCase(newstr[j]) > 0) {
					String temp = newstr[i];
					newstr[i] = newstr[j];
					newstr[j] = temp;
				}
			}
		}

		for (String s : newstr) {
			System.out.print(s + ",");
		}
		System.out.println("\n");

	}

	// Again part-2
	@Test(enabled = false)
	public void excelTest() {
		File file = new File("C:\\Users\\soujanya.p\\Documents\\PracticeTest1.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int sheets = wb.getNumberOfSheets();
			for (int i = 0; i < sheets; i++) {
				if (wb.getSheetName(i).equalsIgnoreCase("testdata")) {
					XSSFSheet sheet = wb.getSheetAt(i);
					int rows = sheet.getPhysicalNumberOfRows();
					System.out.println("No. of rows :" + rows);
					Iterator<Row> row = sheet.iterator();
					while (row.hasNext()) {
						Row next = row.next();
						int cells = next.getPhysicalNumberOfCells();
						System.out.println("no. of cells in a row: " + cells);
						for (int k = next.getFirstCellNum(); k < cells; k++) {
							if (next.getCell(0).getStringCellValue().equals("Purchase") && next.getCell(k) == null) {
								next.createCell(k);
								next.getCell(k).setCellValue("done!");

							} else if (next.getCell(0).getStringCellValue().equalsIgnoreCase("Add profile")
									&& next.getCell(k) == null) {
								next.createCell(k);
								next.getCell(k).setCellValue("Added!");

							} else {
								if (next.getCell(k) == null) {
									next.createCell(k);
									next.getCell(k).setCellValue("Bye !");
								}
							}
						}

					}

				}
			}

			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			fos.close();
			wb.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test(enabled = false)
	public void testMaps2() {
		String sentence = "Microsoft won’t just release its next-gen consoles consoles Xbox series X and Xbox series S on November 10.";
		String[] strings = sentence.split(" ");
		int count = strings.length;

		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < count; i++) {
			if (map.containsKey(strings[i])) {
				int num = map.get(strings[i]);
				map.put(strings[i], num + 1);
			} else {
				map.put(strings[i], 1);
			}
		}

		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());

		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry next = (Map.Entry) iterator.next();
			System.out.println(next.getKey() + "--" + next.getValue());
		}

		String word = "Perspective";
		char[] cs = word.toLowerCase().toCharArray();
		int len = cs.length;
		LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<Character, Integer>();

		for (int k = 0; k < len; k++) {
			if (map2.containsKey(cs[k])) {
				int j = map2.get(cs[k]);
				map2.put(cs[k], j + 1);
			} else {
				map2.put(cs[k], 1);
			}
		}

		Iterator<Entry<Character, Integer>> itr = map2.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry chars = (Map.Entry) itr.next();
			if (chars.getValue() == (Integer) 1) {
				System.out.println("First non repeating letter: " + chars.getKey());
				break;
			}
			// System.out.println(chars.getKey()+"--"+chars.getValue());
		}

	}

	@Test(enabled = false)
	public void testPrime3() {
		int num = 59;
		// if(num ==2) {
		// System.out.println("Number "+num+" is prime");
		// } else if(num<=1 || num %2==0) {
		// System.out.println("Number "+num+" is not prime");
		// } else {
		//
		// int i=2;
		// int count=1;
		// while(i<num/2) {
		// if(num %i==0) {
		// count++;
		// }
		// i++;
		// }
		//
		// if(count ==1) {
		// System.out.println("Number "+num+" is prime");
		// } else {
		// System.out.println("Number "+num+" is not prime");
		// }
		// }

		int[] nums = new int[] { 34, 67, 534, 23, 78, 97, 101, 111 };
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				list.add(nums[i]);
				continue;
			} else if (nums[i] <= 1 || nums[i] % 2 == 0) {
				continue;
			} else {
				int k = 2;
				int flag = 1;
				while (k < nums[i] / 2) {
					if (nums[i] % k == 0) {
						flag++;
					}
					k++;
				}
				if (flag == 1) {
					list.add(nums[i]);
				}
			}
		}

		System.out.println(Arrays.toString(nums));
		System.out.println(list);

	}

	@Test(enabled = false)
	public void getSum3() {
		int num = 1234;
		System.out.println("Number is: " + num);
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum is: " + sum);

	}

	@Test(enabled = false)
	public void armsStrongs() {
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		// If you have a four-digit number lets say
		// 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634

		int num = 1634;
		int sum = 0;
		int expected = num;
		int length = String.valueOf(expected).toCharArray().length;
		System.out.println("Number is: " + expected);
		while (num > 0) {
			int product = 1;
			int i = 0;
			while (i < length) {
				product = product * (num % 10);
				i++;
			}
			num = num / 10;
			sum = sum + product;
		}

		if (expected == sum) {
			System.out.println(sum + " is Arms Strong Number");
		}

	}

	@Test(enabled = false)
	public void staars() {
		int count = 5;
		
		for (int k = 0; k < count; k++) {
				for(int i=0; i<=k ;i++) {
				System.out.print(" *");
			}
			System.out.println("\n");
		}
		
		for(int k=0 ; k<count ; k++) {
			for(int j =count; j>=k ; j--) {
				System.out.print(" ");
			}
			for(int m=0; m<=k; m++) {
				System.out.print(" * ");
			}
			System.out.println("\n");
		}

	}
	
	@Test(enabled= true)
	public void findUniqueNumber() {
		int[] a = { 1, 3, 3, 2, 2, 5, 6, 4, 5, 6, 6 };
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		for(int i=0; i<a.length; i++) {
//			int k=0;
//			if(!list.contains(a[i])) {
//				k++;
//				list.add(a[i]);
//				for(int j=i+1; j<a.length; j++) {
//					if(a[i]== a[j]) {
//						k++;						
//					}
//				}
//				if(k==1)
//					list2.add(a[i]);
//			}
//			
//		}
//		System.out.println(list2);
		
		
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int i=0; i<a.length ; i++) {
			if(map.containsKey(a[i])) {
				int count = map.get(a[i]);
				map.put(a[i], count+1);
			} else {
				map.put(a[i], 1);
			}
		}
		
		Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry next = (Map.Entry)itr.next();
			if(next.getValue() == (Integer)1 ) {
				System.out.println(next.getKey());
			}
		}
		
	}

	
}
