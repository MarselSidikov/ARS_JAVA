class Program {

	public static int isPrime(int number) {
		if (number == 2 || number == 3) {
			return 1;
		}

		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return 0;
			}
		}

		return 1;

	}

	public static void main(String[] args) {
		int array[] = {23, 8, 6, 11, 169, 113};

		for (int i = 0; i < array.length; i++) {
			if (isPrime(array[i]) == 1) {
				System.out.print(array[i] + " ");
			}
		}
	}
}