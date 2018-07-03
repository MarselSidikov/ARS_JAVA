import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		int count = 0;
		int sumDigits = 0;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 1) {
				while (array[i] != 0) {
					int lastDigit = array[i] % 10;
					sumDigits = sumDigits + lastDigit;
					array[i] = array[i] / 10;
				}
				if (sumDigits == 7) {
					count++;
				}
				sumDigits = 0;
			}
		}

		System.out.println(count);
	}
}