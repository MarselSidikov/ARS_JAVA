import java.util.Scanner;
import java.util.Arrays;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char x[]; 
		char y[];

		x = scanner.nextLine().toCharArray();
		y = scanner.nextLine().toCharArray();

		char z[] = new char[x.length + 1];

		int temp = 0;

		for (int i = x.length - 1; i >= 0; i--) {
			char digitFromX = x[i];
			char digitFromY = y[i];

			int integerDigitFromX = digitFromX - '0';
			int integerDigitFromY = digitFromY - '0';

			int result = integerDigitFromX + integerDigitFromY + temp;

			if (result >= 10) {
				temp = 1;
			} else {
				temp = 0;
			}

			z[i + 1] = (char)(result + '0');
		}

		if (temp != 0) {
			z[0] = (char)(temp + '0');
		}

		System.out.println(new String(z));
	}
}