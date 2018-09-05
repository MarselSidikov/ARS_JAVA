import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x[];
        char y[];
        x = scanner.nextLine().toCharArray();
        y = scanner.nextLine().toCharArray();

        int maxLength = Math.max(x.length, y.length);

        char newX[] = new char[maxLength];
        char newY[] = new char[maxLength];

        for (int i = 0; i < maxLength; i++) {
            newX[i] = '0';
            newY[i] = '0';
        }

        for (int i = x.length - 1; i >= 0; i--) {
            newX[x.length - 1 - i] = x[i];
        }

        for (int i = y.length - 1; i >= 0; i--) {
            newY[y.length - 1 - i] = y[i];
        }

        char z[] = new char[maxLength + 1];

        for (int i = 0; i < maxLength + 1; i++) {
            z[i] = '0';
        }

        for (int i = 0; i < maxLength; i++) {
            char digitFromX = newX[i];
            char digitFromY = newY[i];
            int integerDigitFromX = digitFromX - '0';
            int integerDigitFromY = digitFromY - '0';

            if (integerDigitFromX < integerDigitFromY) {
                int k = i + 1;
                while (newX[k] == '0') {
                    k++;
                }
                newX[k] = (char)(newX[k] - 1);
                for (int j = i + 1; j < k; j++) {
                    newX[j] = '9';
                }
                integerDigitFromX = integerDigitFromX + 10;
            }
            int result = integerDigitFromX - integerDigitFromY;
            z[i] = (char) ((result) + '0');
        }

        int start = maxLength - 1;
        if (z[maxLength] != '0') {
            start = maxLength;
        }

        for (int i = start; i >= 0; i--) {
            System.out.print(z[i]);
        }
    }
}