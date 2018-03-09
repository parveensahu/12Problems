package SortAndArrange;

import java.util.Arrays;

public class SortandArray {

	public static void main(String args[]) {
		String str = "ADBBCCCDE";
		char[] arr = str.toCharArray();
		
		Arrays.sort(arr);
		
		for(char c: arr) {
			print(c);
		}
	}
	public static void print(Object o) {
		System.out.print(o);
	}
}
