import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		int divResult = value / 3; // div
		int modResult = value % 3; // mod
		System.out.println(divResult);
		System.out.println(modResult);
	}
}