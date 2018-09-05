import java.util.Arrays;

/**
 * 05.07.2018
 * Program3
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Program3 {
    // отсортировать числа в порядке возрастания суммы цифр
    // [23, 11, 550, 101, 576]
    // [11, 101, 23, 550, 576]

    public static int min(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int array[] = {23, 11, 550, 101, 576};

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sumDigits(array[j]) > sumDigits(array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(min(array));
    }
}
