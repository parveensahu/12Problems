package CheckPallindrome;

import java.util.Arrays;

public class CheckPa {

	public static void isAnagram(String str) {
		char[] charArrs = str.toCharArray();
		System.out.println(Arrays.toString(charArrs));
		char[] charArr1 = new char[str.length()];
		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			charArr1[j] = charArrs[i];
			j++;
		}
		System.out.println(Arrays.toString(charArr1));

	String str1 = new String(charArr1);
	// System.out.println(str1);
	if(str.equals(str1))
	{
		System.out.println("Anagram");
	}
	else {
		System.out.println("Not an Anagram");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MALAYALAM";
		isAnagram(str);
	}

}
