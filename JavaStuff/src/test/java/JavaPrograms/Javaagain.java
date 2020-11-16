package JavaPrograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Javaagain {
  @Test(enabled = false)
  public void stringEquals() {
	  String word = "SubStringS";
	  String s = word.concat(" and strings");
	  System.out.println(word+" and- "+s);
	  
	  String w = new String("SubStringS");
	  String t = new String("SubStringS");
	  String k= w;
	 
	  System.out.println(w.equals(t));
	  System.out.println(w==t);
	  System.out.println(w==k);
	  System.out.println(w==word);	  
	  System.out.println(w.equals(word));
	  System.out.println(w.equals(k));
  }
  
  @Test(enabled = false)
  public void testString1() {
	String word = "GeeksForGeeks";
	StringBuilder build = new StringBuilder();
	build.append(word);
	System.out.println("reversed: "+build.reverse());
	
	char[] cs = word.toCharArray();
	String reversed="";
	for(int i=cs.length-1; i>=0; i--) {
		reversed = reversed.concat(String.valueOf(cs[i]));
	}
	System.out.println("reversed again: "+reversed);
	String str ="";
	for(int i=0; i<cs.length ; i++) {
		if(Character.isLowerCase(cs[i])) {
			str= str.concat(String.valueOf(Character.toUpperCase(cs[i])));
		} else {
			str= str.concat(String.valueOf(Character.toLowerCase(cs[i])));
		}
	}
	
	System.out.println("Case changed: "+str);
	
  }
  
  @Test(enabled= false)
  public void testString2() {
	  //arrange an array as per "POTUS"
	  
	  String[] array = new String[] {"Oggy", "Tom","Ursula", "Samy", "Peter"};
	  String word = "POTUS";
	  ArrayList<String> list = new ArrayList<String>();
	  char[] cs = word.toCharArray();
	  for(int i=0; i <cs.length ; i++) {
		  for(int j=0; j<array.length; j++) {
			  char[] temp = array[j].toCharArray();
			  
			  //just a diiferent approach below-
			  
//			  if(array[j].startsWith(String.valueOf(cs[i]))) {
//				  list.add(array[j]);
//			  }
			  if(cs[i]==temp[0]) {
				  list.add(array[j]);
			  }
		  }
	  }
	  
	  System.out.println(list);
	  
  }

  @Test(enabled= false)
  public void palindrome() {
//	  String word = "Malayalam";
//	  StringBuilder builder = new StringBuilder() ;
//	  builder.append(word);
//	  String newWord= builder.reverse().toString();
//	  if(word.equalsIgnoreCase(newWord)) {
//		  System.out.println("a palindrome: "+word);
//	  } else {
//		  System.out.println("Not a palindrome: "+word);
//	  }
	  
	  int num =1001;
	  int expected = num;
	  String nums = "";
	  
	  while(num >0) {
		  int k = num%10;
		  nums= nums.concat(String.valueOf(k));
		  num = num/10;
	  }
	  if(expected== Integer.parseInt(nums)) {
		  System.out.println("Its a integer palindrome: "+expected);
	  } else {
		  System.out.println("Its not a integer palindrome: "+expected);
	  }
	  
  }
  
  @Test(enabled= false)
  public void removeDuplicatedFromArray() {
	  int[] a = new int[] {1,2,3,4,4,3,5,6,5,7,8};
	  int[] b= new int[a.length];	  
	  for(int i=0; i<a.length; i++)  {
		  int flag=1;
		  for(int j=i+1; j<a.length; j++) {			  
			  if(a[i]== a[j]) {
				  flag++;
			  }
		  }
		  if(flag==1) {
			  b[i]=a[i];
		  }
	  }	  
	 System.out.println(Arrays.toString(b));
	  
  }

  @Test(enabled = false)
  public void swapTheArray() {
	  int[] array= new int[] {23,34,5,56,7,8,100,200,33};
	  int j=0;
	  for(int i=0; i<array.length; i++) {
		  for( j=array.length-1-i; j>=0; j--) {
			  if(i != j) {
			  int temp = array[i];
			  array[i]= array[j];
			  array[j] = temp;
			  break;
			  } else {
				  break;
			  }
		  }
		  if(i==j)
			  break;
	  }
	  
	  for(int i: array) {
		  System.out.print(i+",");
	  }
	  System.out.println("\n");
  }
  
  @Test(enabled=  false)
  public void uniqueChar() {
	  
	  //Non- repeating letter in a word
	  String word ="GeekForGeeks";
	  char[] ch = word.toCharArray();
	  LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();
	  
	  for(int i=0; i<ch.length ; i++) {
		  if(map.containsKey(ch[i])) {
			  int count = map.get(ch[i]);
			  map.put(ch[i], count+1);
		  } else {
			  map.put(ch[i], 1);
		  }
	  }
	  
	  Iterator<Entry<Character, Integer>> iterator = map.entrySet().iterator();
	  while(iterator.hasNext()) {
		  Map.Entry next =(Map.Entry) iterator.next();
		  if(next.getValue()==(Integer)1) {
			  System.out.println("First non-repeating letter: "+next.getKey());
			  break;
		  }
	  }
	  
  }
  
  @Test(enabled = false)
  public void testSort () {
	  int[] array= new int[] {23,34,5,-56,7,8,100,200,33};
	  
//	  for(int i :array) {
//		  System.out.print(i+",");
//	  }
//	  System.out.println("\n");
	  System.out.println(Arrays.toString(array));
//	  Arrays.sort(array);
	  for(int i=0; i<array.length; i++) {
		  for(int j=i+1; j<array.length ; j++) {
			  if(array[i] >array[j]) {
				  int temp = array[j];
				  array[j] = array[i];
				  array[i] = temp;
			  }
		  }
	  }
	  System.out.println(Arrays.toString(array));
	  for(int i :array) {
		  System.out.print(i+",");
	  }
	  System.out.println("\n");
  }

  @Test(enabled = false)
  public void testPermutations () {
	  String word = "GOD";
	  
	  char[] ch = word.toCharArray();
	  for(int i=0; i<ch.length; i++) {
		  String check=String.valueOf(ch[i]);
		  for(int j=i+1; j<ch.length; j++) {
			  check= check.concat(String.valueOf(ch[j]));
		  }
		  System.out.println(check);
	  }
  }
  
  @Test(enabled = false)
  public void bubbleSort() {
	  int[] array= new int[] {23,34,5,-56,7,8,100,200,33};
	  
	  for(int i=0; i<array.length ; i++) {
		  for(int j=array.length-1 ; j>i ; j--) {
			  if(array[j]< array[j-1]) {
				  int temp = array[j];
				  array[j] = array[j-1] ;
				  array[j-1] = temp;
			  }
		  }
	  }
	  
	  System.out.println("Sorted Array using Bubble sort algorithm: "+ Arrays.toString(array));

	  
  }

  @Test(enabled = false)
  public void testChartoString() {
	  char s[] = { 'g', 'e', 'e', 'k', 
              's', 'f', 'o', 'r', 
              'g', 'e', 'e', 'k', 's' }; 
	  
	  String word ="";
	  for(char ch : s) {
		  word= word.concat(String.valueOf(ch));
	  }
	  System.out.println(word);
	  
	  
  }
  
  //Pratice 2
  @Test(enabled=false)
  public void testDuplicates() {
	  int[] a = new int[] {1,2,3,4,4,3,5,6,5,7,8};	  
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  
	  for(int i=0; i<a.length; i++) {
		  int flag =1;
		  for(int j= i+1; j<a.length; j++) {
			  if(a[i] == a[j]) {
				  flag++;
			  }
		  }
		  if(flag==1) {
			  list.add(a[i]);
		  }
	  }
	  int[] b= new int[list.size()];
	  System.out.println(list);
	  
	  int i=0;
	  for(Integer k: list) {
		  b[i++] =k;
	  }
	  System.out.println(Arrays.toString(b));
	  
  }

  @Test(enabled= false)
  public void testArraySwapping() {
	  int[] array= new int[] {23,34,5,-56,7,8,100,200,33};
	  System.out.println("Before: "+Arrays.toString(array));
	  
	  for(int i=0 ; i<array.length; i++) {
		  int j=0;
		  for( j= array.length-1-i; j>=0; j--) {
			  if(i!=j) {
				  int temp = array[i];
				  array[i]= array[j];
				  array[j] = temp;
				  break;
			  } else {
				  break;
			  }
		  }
		  if(i==j)
		  break;
	  }
	  
	  System.out.println("After: "+Arrays.toString(array));
  }

  @Test(enabled=false)
  public void testBubble() {
	  int[] array= new int[] {23,34,5,-56,7,8,100,200,33};
	  System.out.println(Arrays.toString(array));
//	  for(int i=0; i<array.length; i++) {
//		  for(int j=i+1; j<array.length; j++) {
//			  if(array[i] >array[j]) {
//				  int temp = array[i];
//				  array[i] = array[j];
//				  array[j] = temp;
//			  }
//		  }
//	  }
//	  System.out.println(Arrays.toString(array));
	  
	  for(int i=0; i<array.length; i++) {
		  for(int j=array.length-1 ; j>0; j--) {
			  if(array[j] < array[j-1]) {
				  int temp = array[j];
				  array[j]= array[j-1];
				  array[j-1] = temp;
			  }
		  }
	  }
	  
	  System.out.println(Arrays.toString(array));
  }
  
  @Test(enabled= false)
  public void testChartoString1() {
	  char s[] = { 'G', 'e', 'e', 'k', 
              's', 'F', 'o', 'r', 
              'g', 'e', 'e', 'K', 's' }; 
	  StringBuilder builder = new StringBuilder();
	  String word="";
	  for(char c :s) {
		  builder.append(c);
		  word = word.concat(String.valueOf(c));
	  }
	  
	  System.out.println(builder+" - " +word);
  }
  
  @Test(enabled= false)
  public void testPalindrome2() {
	  int num =1331;
	  int expected = num;
	  System.out.println("Expected: "+expected);
	  String nums ="";
	  
	  while(num>0) {
		  int k = num%10;
		  nums = nums.concat(String.valueOf(k));
		  num = num/10;
	  }
	  
	  if(expected== Integer.parseInt(nums)) {
		  System.out.println("Palindrome");
	  }else {
		  
		  System.out.println("Not a palindrome");
	  }
	  
  }
  
  @Test(enabled = false)
  public void testStringsOnly() {
  //Swap the caps to small and vicecersa
	  String word="Geeks  ForGeeks";
	  char[] cs = word.toCharArray();
	  String str="";
	  for(int i =0; i<cs.length; i++) {
		  if(Character.isLowerCase(cs[i])) {
			  str = str+String.valueOf(Character.toUpperCase(cs[i]));
		  } else {
			  str = str+String.valueOf(Character.toLowerCase(cs[i]));
		  }
	  }
	  System.out.println(word.replaceAll("\\s", "")); // replaces all whitespaces
	  System.out.println("From "+word+" to "+str);
  }
  
  @Test(enabled= false)
  public void conversionsOnly() {
	  String[] array = new String[] {"Oggy", "Tom","Ursula", "Samy", "Peter"};
	  System.out.println(Arrays.toString(array));
	  List<String> list = new ArrayList<String>();
	  //Array to list
	  list= Arrays.asList(array);
	  System.out.println("list: "+list);
	  
	  TreeSet<String> set = new TreeSet<String>();
	  set.addAll(list);
	  System.out.println("tree set: "+set);
	  
	  //List to array
	  List<String> list2 = new ArrayList<String>();
	  for(int i=0; i<5; i++) {
		  list2.add("a"+i);
	  }
	  System.out.println(list2);
	  String[] b= new String[list.size()];
	  System.out.println(Arrays.toString(list2.toArray(b)));
	  
	  //list of ints to array
	  List<Integer> list3 = new ArrayList<Integer>();
	  for(int i=0; i<5; i++) {
		  list3.add(i);
	  }
	  System.out.println(list3);
	  int[] nums = new int[list3.size()];
	  int i=0;
	  for(Integer k: list3) {
		  nums[i++] = k;
	  }
	  System.out.println(Arrays.toString(nums));
	  
  }

  @Test(enabled = true)
  public void tetsoNe() {
	  
  }
  
}
