package PrintDistinctEInArray;

public class PrintDistinctArray {
	public static void printDistinctElement(int[] arr_ele) {
		for(int i = 0; i<arr_ele.length; i++) {
			boolean distinct = true;
			for(int j = 0; j<i; j++) {
				if(arr_ele[i] == arr_ele[j]) {
					distinct = false;
					break;
				}
			}
			if(distinct == true) {
				System.out.print (arr_ele[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {4,4,5,5,6,7,8,9,0};
		printDistinctElement(arr);
	}

}
