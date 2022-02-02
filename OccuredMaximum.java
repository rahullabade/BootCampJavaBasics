package company;

import java.util.Scanner;

public class OccuredMaximum {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Element To Store");
		int[] array = new int[10];
		n = scanner.nextInt();
		System.out.println("Enter the Elements");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = scanner.nextInt();
		}
		int[] frequency = new int[array.length];
		int visited = -1;
		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count++;
					// To avoid counting same element again
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited)
				frequency[i] = count;
		}
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i] != visited)
				System.out.println("    " + array[i] + "    |    " + frequency[i]);
		}
	}
}
