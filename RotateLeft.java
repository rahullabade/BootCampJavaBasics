package company;

import java.util.Scanner;

public class RotateLeft {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Elements want store");
		int[] array = new int[10];
		n = scanner.nextInt();
		System.out.println("Enter the Elements");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = scanner.nextInt();
		}
		// n determine the number of times an array should be rotated
		int m = 3;
		System.out.println("Original array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// Rotate the given array by n times toward left
		for (int i = 0; i < m; i++) {
			int j, first;
			// Stores the first element of the array
			first = array[0];
			for (j = 0; j < array.length - 1; j++) {
				// Shift element of array by one
				array[j] = array[j + 1];
			}
			// First element of array will be added to the end
			array[j] = first;
		}
		System.out.println();
		// Displays resulting array after rotation
		System.out.println("Array after left rotation: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
