package ReverseNumber;

public class isReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int sum = 0;
		int remainder = 0;
		while(num>0) {
			remainder = num%10;
			sum= sum*10+remainder;
			num = num/10;
			System.out.print(remainder);
		}
		
	}

}
