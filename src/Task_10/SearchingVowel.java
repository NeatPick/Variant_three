package Task_10;

import java.util.Scanner;

public class SearchingVowel {

    public static void task10_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        if (isVowel(word.charAt(0))) {
            System.out.println("Слово начинается с гласной буквы: " + word);
        } else {
            System.out.println("Слово не начинается с гласной буквы: " + word);
        }
    }
    public static void task10_2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        String[] words = str.split("\\s+");
        for (String word: words){
            if (isVowel(word.charAt(0))){
                System.out.println("Слово начинается с гласной: " + word);
            } else {
                System.out.println("Слово не начинается с гласной буквы: " + word);
            }
        }
    }



    public static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        if  ("аеёиоуыэюя".indexOf(c) != -1){
            return true;
        }
        return false;
    }
}
