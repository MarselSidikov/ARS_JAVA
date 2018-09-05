class Program {

    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }

        return sum;
    }

	public static int findMaxDigitsSumNumber(int array[]) {
		int max = sumDigits(array[0]);
		int number = 0;
		for (int i = 1; i < array.length; i++) {
			if (max < sumDigits(array[i])) {
				max = sumDigits(array[i]);
				number = array[i];
			}
		}

		return number;
	}

	public static void main(String[] args) {
		int array[] = {23, 11, 550, 101, 576};
		System.out.println(findMaxDigitsSumNumber(array));
	}
}