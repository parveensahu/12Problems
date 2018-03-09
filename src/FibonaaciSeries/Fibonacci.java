package FibonaaciSeries;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y = 1, z = 0;
		System.out.print(x + " ");
		System.out.print(y + " ");
		for(int i =0; i< 16; i ++){
			z = x+y;
			x  = y;
			y = z;
			System.out.print(z + " ");
		}
	}

}
