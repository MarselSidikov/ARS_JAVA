import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();

		if (x % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}