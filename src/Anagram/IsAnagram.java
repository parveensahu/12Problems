package Anagram;

import java.util.Arrays;

public class IsAnagram {
	
	
	public static void isAnagram(String s1, String s2) {
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String s1_new = new String(arr1);
		String s2_new = new String(arr2);
		//System.out.println(s2_new);
		if(s1_new.equalsIgnoreCase(s2_new)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "bcaa";
		isAnagram(s1,s2);
	}

}
