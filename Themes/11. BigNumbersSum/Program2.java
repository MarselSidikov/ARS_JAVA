import java.util.Arrays;
import java.util.Scanner;

class Program2 {
    public static void main(String[] args) {
        // создаем считыватель с консоли
        Scanner scanner = new Scanner(System.in);
        // два массива, хранят цифры исходных чисел
        char x[];
        char y[];
        // считываем оба длинных числа в исходные массивы
        x = scanner.nextLine().toCharArray();
        y = scanner.nextLine().toCharArray();

//        System.out.println(Arrays.toString(x));
//        System.out.println(Arrays.toString(y));

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

        int temp = 0;
        for (int i = 0; i < maxLength; i++) {
            char digitFromX = newX[i];
            char digitFromY = newY[i];
            int integerDigitFromX = digitFromX - '0';
            int integerDigitFromY = digitFromY - '0';
            int result = integerDigitFromX + integerDigitFromY + temp;
            if (result >= 10) {
                temp = 1;
                z[i] = (char) ((result - 10) + '0');
            } else {
                temp = 0;
                z[i] = (char) ((result) + '0');
            }
        }

        int start = maxLength - 1;
        if (z[maxLength] != '0') {
            start = maxLength;
        }

//        System.out.println(Arrays.toString(newX));
//        System.out.println(Arrays.toString(newY));
//        System.out.println(Arrays.toString(z));

        for (int i = start; i >= 0; i--) {
            System.out.print(z[i]);
        }
    }
}