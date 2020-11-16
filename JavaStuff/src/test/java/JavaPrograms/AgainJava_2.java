package JavaPrograms;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.*;

@Test
public class AgainJava_2 {

	@Test(enabled= false)
	public void testExcel() {
		try {
		File file = new File("C:\\Users\\soujanya.p\\Documents\\PracticeTest1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);		
		int numberOfsheets = wb.getNumberOfSheets();
		System.out.println("No. of sheets: "+numberOfsheets);		
		for(int i=0; i<numberOfsheets ; i++) {
			if(wb.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = wb.getSheetAt(i);
				System.out.println("No. of rows in the sheet: "+ sheet.getPhysicalNumberOfRows() );								
				Iterator<Row> itr = sheet.iterator();				
				while(itr.hasNext()) {
					Row row = itr.next();
					System.out.println("No. of cells in a row: "+row.getPhysicalNumberOfCells());
					int totalCells = sheet.getRow(0).getPhysicalNumberOfCells();				
					for(int j= row.getFirstCellNum(); j< totalCells ; j++) {
						if(row.getCell(0).getStringCellValue().equalsIgnoreCase("purchase") && row.getCell(j)==null) {
							row.createCell(j);
							row.getCell(j).setCellValue("Purchase Done !");
						} else if(row.getCell(0).getStringCellValue().equalsIgnoreCase("Add profile") && row.getCell(j)==null) {
							row.createCell(j);
							row.getCell(j).setCellValue("Profile created !");
						} else {
							if(row.getCell(j) ==null) {
								row.createCell(j);
								row.getCell(j).setCellValue("Extras !!");
							}
						}
						
						System.out.print(row.getCell(j)+"   ");						
					}			
					System.out.println("\n");
				}				
			}
		}
		
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		fos.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(enabled= false)
	public void testStrings1() {
		String word = "GeekForGeeks" ;
		String w="";
		//reverse 1
		StringBuilder builder = new StringBuilder() ;
		builder.append(word);
		System.out.println("Builder reversed: "+builder.reverse());
		
		//reverse 2
		char[] cs = word.toCharArray();
		for(int i=cs.length-1; i>=0;i--) {
			w= w.concat(String.valueOf(cs[i]));
		}
		System.out.println("reversed from char array: "+w);
		
		//change caps to small and viceversa
		char[] array = word.toCharArray();
		String s="";
		for(int i=0; i<array.length; i++) {
			if(Character.isLowerCase(array[i])) {
				array[i] = Character.toUpperCase(array[i]);
			} else {
				array[i] = Character.toLowerCase(array[i]);
			}
			s= s.concat(String.valueOf(array[i]));
		}
		System.out.println(s);
		
	}
	
	@Test(enabled= false)
	public void testPalindrome() {
		 String word = "Malayalam";
		 StringBuilder builder = new StringBuilder();
		 builder.append(word);
		 String rev = builder.reverse().toString();
		 Assert.assertTrue(word.equalsIgnoreCase(rev),"They are not equal !");
		 
		 int num= 1234;
		 int revs=0;
		 while(num>0) {
			revs= revs*10+num%10;
			 num= num/10;
		 }
		 System.out.println(revs+" and original No.= "+num);
		 
	}
	
	@Test(enabled= false)
	public void removeDuplicatesFromArray() {
		 int[] a = new int[] {1,2,3,4,4,3,5,6,5,7,8};
		 LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		 ArrayList<Integer> list= new ArrayList<Integer>();
		 
		 for(int i=0; i<a.length; i++) {
			 if(map.containsKey(a[i])) {
				 int count = map.get(a[i]);
				 map.put(a[i], count+1);
			 } else {
				 map.put(a[i], 1);
			 }
		 }
		 
		 Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();
		 while(itr.hasNext()) {
			 Map.Entry next= (Map.Entry)itr.next();
			 if(next.getValue()==(Integer)1) {
				 list.add((Integer)next.getKey());
			 }
		 }
		
		 System.out.println(list);
	}
	
	@Test(enabled= false)
	public void swapArray() {
		 int[] a= new int[] {23,34,5,56,7,8,100,200,33};
		 int j=0;
		 for(int i=0; i< a.length; i++) {
			 for( j=a.length-1-i; j>=0; j--) {
				 if(i==j) {
					 break;
				 } else {
//				 if(i !=j) {
					 int temp = a[i];
					 a[i] = a[j];
					 a[j]= temp;
					 break;
				 } 
			 }
			 if(i==j)
				 break;
		 }
		 System.out.println(Arrays.toString(a));
		 
	}
	
	@Test(enabled= false)
	public void testSorting() {
		 int[] a= new int[] {23,34,5,56,7,8,100,200,33};
//		 Arrays.sort(a);
//		 System.out.println(Arrays.toString(a));
		 
		 for(int i=0; i<a.length; i++) {
			 for(int j=i+1; j<a.length; j++) {
				 if(a[i] > a[j]) {
					 int temp = a[i];
					 a[i]= a[j];
					 a[j] = temp;
				 }
			 }
		 }
		 System.out.println(Arrays.toString(a));
	}
	
	@Test(enabled= false)
	public void testPrime() {
		//single number
		int num =101;
		
		if(num==2) {
			System.out.println("Number is prime: "+num);
		} else if( num<=1 || num%2==0) {
			System.out.println("Number is not prime: "+num);
		} else {
			int check = 2;
			int flag=0;
			while(check<num/2) {
				if(num%check ==0) {
					System.out.println("its divided by "+check);
					flag++;
					break;
				}				
				check++;
			}
			if(flag==0)
				System.out.println("Number is prime: "+num);
			else
				System.out.println("Number is not prime: "+num);
		}
		
		//prime numbers from an array
		int[] a= new int[] {23,34,5,56,7,8,100,200,33};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==2) {
				list.add(a[i]);
				continue;
			} else if(a[i]<=1 || a[i] % 2 ==0) {
				continue;
			} else {
				int check=2;
				int flag=0;
				while(check <a[i]/2) {
					if(a[i] % check==0) {
						flag++;
					}
					check++;
				}
				
				if(flag==0)
					list.add(a[i]);								
			}
		}
		System.out.println("Prime numbers: "+list);
		
		
	}

	@Test(enabled= false)
	public void testToSumTheDigits() {
		int num= 1234 ; //10
		String str = String.valueOf(num);
		
			int sum =0;
			while(num >0) {
				sum= sum+ num%10;				
				num = num/10;
			}
			
			System.out.println(sum);
	}
	
	@Test(enabled= false)
	public void testArmsStrongNumber() {
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		// If you have a four-digit number lets say
		// 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1 + 1296 + 81 + 256 = 1634
		
		int num= 153;
		int expected = num;
		String str = String.valueOf(num);
		int sum=0;
		
		while(num >0) {
			int product=1;
			int rem = num %10;
			for(int i=0; i<str.length(); i++) {
				product= product * rem;
			}
			sum = sum+product;
			num = num/10;
		}
		System.out.println("Expected Number is: "+expected);
		System.out.println("Actual Number is: "+sum);
	}
	
	@Test(enabled= false)
	public void testStars() {
		int count = 5;
		
		for(int i=0; i< count; i++) {
			for(int j=0; j<=i ; j++) {
			System.out.print(" * ");
			}
			System.out.println("\n");
		}
		
		for(int i=0; i< count; i++) {
			for(int k=count-1 ; k>=i; k-- ) {
				System.out.print(" ");
			}
			
			for(int j=0; j<=i ; j++) {
			System.out.print(" * ");
			}
			System.out.println("\n");
		}
		
	}

	@Test(enabled= false)
	public void testToFindUniqueNumber() {
		int[] a = {1, 1, 3, 3, 2, 2, 5, 6, 4, 5, 6, 6 };
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0; i<a.length ; i++) {
			if(map.containsKey(a[i])) {
				int count = map.get(a[i]) ;
				map.put(a[i], count+1);
			} else {
				map.put(a[i], 1);
			}
		}
		
		Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry next = (Map.Entry) itr.next();
			if(next.getValue()==(Integer)1) {
				System.out.println("First non- repeating no.: "+next.getKey());
				break;
			}
		}	
	}
	
	@Test(enabled=true)
	public void test() {
		
	}
	
}
 