package assignmentmdk;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int rev_arr[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			rev_arr[arr.length - 1 - i] = arr[i];
		}
		System.out.println("reversed array is" + Arrays.toString(rev_arr));
	}

}
