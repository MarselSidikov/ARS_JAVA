import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int sum = 0;
		while (x != -1) {
			sum = sum + x;
			x = scanner.nextInt();
		}
		System.out.println(sum);
	}
}