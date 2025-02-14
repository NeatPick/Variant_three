/*Яковлев Александр Владимирович, студент группы ЗБ762
                       ВАРИАНТ 3
*/

import task_10.SearchingVowel;
import task_11.DirectoryStreamExample;
import task_9.RealNumbers;
import task_9.TransformedException;
import task_8.CorrectionOfText;
import task_1.TaskOne;
import task_2.TaskTwo;
import task_3.PatientManager;
import task_4.AirplaneManager;
import task_5.MyAccount;
import task_6.CandyFactory;
import task_7.UserManager;
import java.util.Scanner;

public class VariantThree {

    public static void main(String[] args) {
        itemMenu();
    }

    private static void itemMenu(){
        System.out.println("Лабораторные работы по Java.");
        System.out.println("Выполнил Яковлев Александр студент группы ЗБ 762. ВАРИАНТ 3");
        String item;
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите задание, для тестирования (1-9.1, 10, 10.2): ");
        item = scan.nextLine();
        switch (item) {
            case "1":
                TaskOne.randomOfNumbers();
            break;
            case "2":
                TaskTwo.lengthOfNumbers();
            break;
            case "3":
                PatientManager.workingWithPatients();
            break;
            case "4":
                AirplaneManager.airplaneControl();
            break;
            case "5":
                MyAccount.myAccount();
            break;
            case "6":
                CandyFactory.CandyInfo();
            break;
            case "7":
                UserManager.workingWithUsers();
            break;
            case "8":
                CorrectionOfText.testString();
                break;
            case "9":
                RealNumbers.operationsNumbers();
                break;
            case "9.2":
                TransformedException.exception();
                break;
            case "10":
                SearchingVowel.task10_1();
                break;
            case "10.2": SearchingVowel.task10_2();
            case "11":
                DirectoryStreamExample.checkDirectory();
            break;


            default: System.out.println("Неверно выбран номер задания!");
        }
    }
}









