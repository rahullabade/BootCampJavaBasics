package company;

import java.util.Scanner;

public class SumOfArray {

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
		int sum = 0;
		// Loop through the array to calculate sum of elements
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of all the elements of an array: " + sum);
	}
}
