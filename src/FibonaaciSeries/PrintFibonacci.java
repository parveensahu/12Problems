package FibonaaciSeries;

public class PrintFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 1;
		System.out.print(x + " " + y + " ");
		for (int i = 0; i <= 10; i++) {
			y = x + y;
			x = y - x;
			
			System.out.print(y + " ");
		}
	}

}
