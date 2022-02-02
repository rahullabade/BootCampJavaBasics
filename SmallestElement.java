package company;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the you want to store");
		n = scanner.nextInt();
		int[] array = new int[4];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = scanner.nextInt();
		}
		// Initialize max with first element of array.
		int minimum = array[0];
		for (int i = 0; i < array.length; i++) {
			// Compare elements of array with max
			if (array[i] < minimum)
				minimum = array[i];
		}
		System.out.println("Smallest element present in given array: " + minimum);
	}
}
