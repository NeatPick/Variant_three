/*Яковлев Александр Владимирович, студент группы ЗБ762
                       ВАРИАНТ 3
*/

import java.util.Random;
import java.util.Scanner;

public class VariantThree {


    public static void main(String[] args) {

        //TaskOne.RandomOfNumbers();
        TaskTwo.LengthOfNumbers();

    }


}

class TaskOne {

    public static void RandomOfNumbers() {
        System.out.print("Введите количество случайных чисел: ");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        Random random = new Random();
        int array[] = new int[count];
        System.out.print("Числа без перехода: ");
        for (int i = 0; i < array.length; i++) {
            int randomize = random.nextInt(100);
            array[i] +=randomize;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Числа c переходом: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}

class TaskTwo {

    public static void LengthOfNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scan.nextInt();
        int[] numbers = new int[n];

        double generalCountNumber = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i+1) + ": ");
            numbers[i] = scan.nextInt();
            int len = String.valueOf(numbers[i]).length();
            generalCountNumber += len;
        }
        double average = generalCountNumber / n;
        System.out.println("\nСредняя длина чисел: " + average);

        System.out.println("\nЧисла с длиной меньше средней:");
        for (int i = 0; i < n; i++) {
            int length = String.valueOf(numbers[i]).length();
            if (length < average) {
                System.out.println("Длина числа " + numbers[i] + " составляет " + length);
            }
        }

        System.out.println("\nЧисла с длиной больше средней:");
        for (int i = 0; i < n; i++) {
            int length = String.valueOf(numbers[i]).length();
            if (length > average) {
                System.out.println("Длина числа " + numbers[i] + " составляет " + length);
            }
        }
    }
}
