package BubbleSort;

public class BubbleSort {
	public void sortingofarr(int[] arr) {
		int tmp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println("List after " + i + " iteration");
			printArray(arr);
		}
	}

	public void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String args[]) {
		int[] arr = new int[] { 5, 6, 9, 11, 3, 2 };
		BubbleSort bs = new BubbleSort();
		bs.sortingofarr(arr);
	}
}
