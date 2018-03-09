package CheckPallindrome;

import java.util.Scanner;

public class PrintPallindromeNumber {

	public static void isPallindrome(int num) {
		int temp = num;
		int sum = 0;
		while(num>0) {
			int remainder = num%10;
			sum = sum*10 + remainder;
			num =num/10;
		}
		if(temp == sum) {
			System.out.println("Number is Pallindrome");
		}
		else {
			System.out.println("Number is not a Pallindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		isPallindrome(scan.nextInt());
	}

}
