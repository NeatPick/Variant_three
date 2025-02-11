package task_2;

import java.util.Scanner;

public class TaskTwo {

    public static void lengthOfNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scan.nextInt();
        int[] numbers = new int[n];

        double generalCountNumber = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
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