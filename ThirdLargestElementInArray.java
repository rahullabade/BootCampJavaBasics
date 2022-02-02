package company;

import java.util.Scanner;

public class ThirdLargestElementInArray {
	public static int getThirdLargest(int[] array, int n) {
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[n - 3];
	}

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the you want to store");
		n = scanner.nextInt();
		int[] array = new int[6];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = scanner.nextInt();
		}
		System.out.println("ThirdLargest: " + getThirdLargest(array, n));
	}
}
