import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/**
		It's bad version from Arseniy
		int array[] = new int[15];
		array[0] = scanner.nextInt();
		array[1] = scanner.nextInt();
		array[2] = scanner.nextInt();
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
        **/

		int n = scanner.nextInt();
		int array[] = new int[n];

		/**
		Esho odin plohoy variant
		int i = 0;
		while (i < n) {
			array[i] = scanner.nextInt();
			i = i + 1;
		}

        i = 0;
		while (i < n) {
			System.out.print(array[i] + " ");
			i = i + 1;
		}
		**/

		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int min = array[i];
			int minIndex = i;
			for (int j = i; j < n; j++) {
				if (array[j] < min) {
					min = array[j];
					minIndex = j;
				}
			}
			// array[i] <-> array[minIndex]
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}


	}
}