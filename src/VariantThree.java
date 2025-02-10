/*Яковлев Александр Владимирович, студент группы ЗБ762
                       ВАРИАНТ 3
*/

import java.util.Scanner;

public class VariantThree {

    public static void main(String[] args) {
        itemMenu();
    }

    private static void itemMenu(){
        System.out.println("Лабораторные работы по Java.");
        System.out.println("Выполнил Яковлев Александр студент группы ЗБ 762. ВАРИАНТ 3");
        int item;
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите задание, для тестирования (1-10): ");
        item = scan.nextInt();
        switch (item) {
            case 1: TaskOne.randomOfNumbers();
            break;
            case 2: TaskTwo.lengthOfNumbers();
            break;
            case 3: PatientManager.workingWithPatients();
            break;
            case 4: AirplaneManager.airplaneControl();
            break;
            case 5: MyAccount.myAccount();
            break;
            case 6: CandyFactory.CandyInfo();
            break;
            default: System.out.println("Неверно выбран номер задания!");
        }
    }
}









