import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int sum = 0;
		int mult = 1;
		while (x != -1) {
			if (x % 10 == 3) {
				sum = sum + x;				
			} else if (x % 10 == 2) {
				mult = mult * x;
			}
			x = scanner.nextInt();
		}
		System.out.println(sum);
		System.out.println(mult);
	}
}