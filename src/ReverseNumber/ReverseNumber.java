package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void reversingNumber(int num) {
		int r = 0;
		while(num!=0) {
			r = num%10;
			num = num/10;
			System.out.print(r);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ReverseNumber.reversingNumber(scan.nextInt());
		
	}

}
