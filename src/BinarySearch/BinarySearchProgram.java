package BinarySearch;

public class BinarySearchProgram {

	public static int binarySearch(int[] arr, int l, int r, int x) {
		int mid = 0;
		if (r >= l) {
			mid = l + (r - l) / 2;

			if (arr[mid] == x) {
				return mid;
			}
			if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			}
			if (arr[mid] < x) {
				return binarySearch(arr, mid + 1, r, x);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 2, 3, 4, 5, 10, 1 };
		int index_searchElement = binarySearch(arr, 0, arr.length - 1, 10);
		System.out.println(index_searchElement);

	}

}
