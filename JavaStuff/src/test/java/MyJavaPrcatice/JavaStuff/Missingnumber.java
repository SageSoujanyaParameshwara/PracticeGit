package MyJavaPrcatice.JavaStuff;

import java.util.Arrays;

public class Missingnumber {

	public static void main(String[] args) {
//		int[] a = { 1, 2, 4, 5, 6, 3, 7, 8, 9,10,11,12, 13,15 };
		int[] a = { 1, 2, 4, 5}; 
		int n = a.length;
		int total = (n+2) * (n + 1) / 2;
		// int total = (n)*(n+1)/2;			//this will work too
		System.out.println("Total: " + total);
		int j = 0;
		for (int i = 0; i < n ; i++) {
			//for(int i=0; i<n-1; i++){     //this will work too
			j = j + a[i];
		}
		System.out.println("J: " + j);

		int miss = total - j;
		System.out.println("Missing number: " + Math.abs(miss));
		 System.out.println("Highest no. is " + m1());
//		 sorting();
//		repeatingChars();
	}

	public static int m1() {
		int[] a = { 3, 10, 6, 1, 99, 20 };
		int temp = 0;

		temp = a[0];
		for (int j = 0; j < a.length; j++) {
			if (temp < a[j]) {
				temp = a[j];
			}

		}

//		for (int k = 0; k < a.length; k++) {
//			System.out.print(a[k] + ", ");
//		} //no use
		return temp;
	}

	public static void sorting() {
		int[] a = { 3, 2, 10, 6, 1, 8, 9, 4, 77, 55, 99, 13, 76 };
		int len = a.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len - 1; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
//		for (int k : a) {
//			System.out.print(k + ", ");
//		}
		System.out.println(Arrays.toString(a));
	}

	public static void repeatingChars() {
	
		String str = new String("Sakkett  and Simmy ");
		int count = 0;
		char[] chars = str.toCharArray();
		System.out.println("Duplicate characters are:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (chars[i] == chars[j]) {
					System.out.print(chars[j]+",");
					count++;
					break;
				}
			}
		}

		String str2 = str.replaceAll("\\s", "");// removes white space
		System.out.println(str2);
	}

}
