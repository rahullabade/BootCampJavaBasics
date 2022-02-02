package company;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		int n, m;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Storing elements");
		n = scanner.nextInt();
		int[] array1 = new int[10];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array1[i] = scanner.nextInt();
		}
		int array2[] = new int[array1.length];
		// Copying all elements of one array into another
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		System.out.println("Elements of original array: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();

		System.out.println("Elements of new array: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
	}
}
