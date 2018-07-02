import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int count = scanner.nextInt();

		int array[] = new int[count];

		for (int i = 0; i < count; i++) {
			array[i] = scanner.nextInt();
		}

		int sum = 0;

		/**
		for (int i = 0; i < count; i++) {
			if (i % 2 == 1) {
				sum = sum + array[i];
			}
		}
		**/

		for (int i = 1; i < count; i = i + 2) {
			sum = sum + array[i];
		}
		System.out.println(sum);

	}
}