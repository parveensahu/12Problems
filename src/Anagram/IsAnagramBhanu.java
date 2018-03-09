package Anagram;

import java.util.Arrays;

public class IsAnagramBhanu {
	
	public static void isAnagram(String s1, String s2) {
		char[] arr1 = s1.toCharArray();
		StringBuilder sb = new StringBuilder(s2);
		for(Character ch:arr1) {
			int index = s2.indexOf(ch);
			
			if(index != -1) {
				sb.deleteCharAt(index);
			}
		}
		if(sb.length() == 0) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "bca";
		isAnagram(s1,s2);
	}

}
