package BinarySearch;

public class BinarySearch {
	public static int binarySearch(int[] arr, int l, int r, int x) {
		int m;
		if (l <= r) {
			m = l + (r - 1) / 2;

			if (arr[m] == x) {
				return m;
			}
			if (arr[m] > x) {
				return binarySearch(arr, l, m - 1, x);
			} else {
				return binarySearch(arr, m + 1, r, x);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 4, 5, 10, 12, 1 };
		int x = 10;
		int result = binarySearch(arr, 0, arr.length - 1, x);
		if (result == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found at index: " + result);
		}

	}

}
