package ConvertDecimaltoBinary;

public class ConvertDecimaltoBinary {
	public static void convertDecimalBinary(int x) {
		int[] remainder = new int[x];
		int i = 0;
		while (x > 0) {
			remainder[i++] = x % 2;
			x = x / 2;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.println(remainder[j]);
		}
	}

	public static void main(String args[]) {
		convertDecimalBinary(10);

	}
}
