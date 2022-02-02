package company;

import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
		int number;
		int[] array = new int[10];
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		sumOfTriplets(array, num);
	}

	private static void sumOfTriplets(int[] array, int num) {
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				for (int k = 0; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == num) {
						System.out.println("[" + array[i] + "," + array[k] + "," + array[k] + "]");
						break;
					}
				}
			}
		}
	}

}
