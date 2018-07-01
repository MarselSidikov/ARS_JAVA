import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int min;
		int max;

		int x = scanner.nextInt();
		min = x;
		max = x;

		while (x != -1) {
			if (min > x) {
				min = x;
			}
			if (max < x) {
				max = x;
			}
			x = scanner.nextInt();
		}
		System.out.println("MAX " + max);
		System.out.println("MIN " + min);
	}
}