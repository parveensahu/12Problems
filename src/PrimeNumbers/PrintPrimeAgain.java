package PrimeNumbers;

public class PrintPrimeAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0;
		int i=0;
		String primeNumber = "";
		for(i = 1 ;i <=100;i++) {
			int count = 0;
			for(num = i ;num>=1; num--) {
				if(i%num == 0) {
				count = count +1;
				}
			}
			if(count == 2) {
				primeNumber = primeNumber + i + " "; 
			}
		}
		System.out.println("List of Prime Numbers:" + primeNumber);
		
	}

}
