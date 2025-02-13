package task_8;

import java.util.Scanner;

public class CorrectionOfText {

    public static void testString() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scan.nextLine();
        System.out.println(correctText(str));
    }

    public static String correctText(String text) {
        String[] str = text.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("ра")) {
                str[i] = str[i].replaceAll("ра(?!$)", "ро");
            }
        }
        return String.join(" ", str);
    }
}
