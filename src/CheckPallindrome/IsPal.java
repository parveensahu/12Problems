package CheckPallindrome;

public class IsPal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Malayalam";
		char[] arr = str.toCharArray();
		char[] arr1 = new char[str.length()];
		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--) {
			arr1[j] = arr[i];
			j++;
		}
		String str1 = new String(arr1);
		if(str.equalsIgnoreCase(str1)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
