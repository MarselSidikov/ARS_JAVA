import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int previous, current, next;
		previous = scanner.nextInt();
		current = scanner.nextInt();
		next = scanner.nextInt();

		int mult = 1;
		int sum = 0;

		while (next != -1) {
			if (previous < current && current > next) {
				mult = mult * current;
			}
			if (previous > current && current < next) {
				sum = sum + current;
			}

			previous = current;
			current = next;
			next = scanner.nextInt();
		}

		System.out.println(mult);
		System.out.println(sum);
	}
}