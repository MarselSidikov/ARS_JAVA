import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = scanner.nextInt();

		// sum ~ 13 768
		int c5000 = sum / 5000; // c5000 ~ 2
		sum = sum % 5000; // sum ~ 3 768
		int c2000 = sum / 2000;
		sum = sum % 2000;
		int c1000 = sum / 1000;
		sum = sum % 1000;
		int c500 = sum / 500;
		sum = sum % 500;
		int c200 = sum / 200;
		sum = sum % 200;
		int c100 = sum / 100;
		sum = sum % 100;
		int c50 = sum / 50;
		sum = sum % 50;
		int c10 = sum / 10;
		sum = sum % 10;
		int c5 = sum / 5;
		sum = sum % 5;
		int c2 = sum / 2;
		sum = sum % 2;
		int c1 = sum / 1;
		sum = sum % 1;

		System.out.println("5000 - " + c5000);
		System.out.println("2000 - " + c2000);
		System.out.println("1000 - " + c1000);
		System.out.println("500 - " + c500);
		System.out.println("200 - " + c200);
		System.out.println("100 - " + c100);
		System.out.println("50 - " + c50);
		System.out.println("10 - " + c10);
		System.out.println("5 - " + c5);
		System.out.println("2 - " + c2);
		System.out.println("1 - " + c1);

	}
}