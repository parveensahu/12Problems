package ReverseString;

public class ReverseString {

	public static void reverseString(String str) {
		char[] charArr = str.toCharArray();
		for(int i =  str.length()-1; i>=0; i-- ) {
			System.out.print(charArr[i]);
		}
	}
	public static void main(String args[]) {
		String str = "PARVEEN";
		reverseString(str);
	}
}
