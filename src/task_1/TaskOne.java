package task_1;

import java.util.Random;
import java.util.Scanner;

public class TaskOne {

    public static void randomOfNumbers() {
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