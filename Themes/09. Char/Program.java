import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		/**
		char characterA = 'A';
		System.out.println(characterA);
		char characterB = (char)(characterA + 1);
		System.out.println(characterB);
		**/
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c);
		}
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		char c = scanner.next().toCharArray()[0];

		if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
			System.out.println("Is letter");
		} else if (c >= '0' && c <= '9') {
			System.out.println("Is digit");
		} else {
			System.out.println("Undefinded");
		}
	}
}