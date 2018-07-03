import java.util.Scanner;
import java.util.Arrays;
class Program {
	public static void main(String[] args) {
		int counts[] = new int[25];
		Scanner scanner = new Scanner(System.in);
		char text[] = scanner.nextLine().toCharArray();
		for (int i = 0; i < text.length; i++) {
			if (text[i] != ' ') {
				counts[text[i] - 65]++;	
			}
		}

		for (int i  = 0; i < 25; i++) {
			if (counts[i] != 0) {
				System.out.println((char)(i + 65) + " " + counts[i]);
			}
		}

		int max = counts[0];
		int maxLetter = 0;
		for (int i = 0; i < 25; i++) {
			if (counts[i] > max) {
				max = counts[i];
				maxLetter = i;
			}
		}

		System.out.println("MAX:" + " " + (char)(maxLetter + 65) + " " + max);
	}  
}