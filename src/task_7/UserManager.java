package task_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class UserManager {

    public static  void workingWithUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Александр", 22, "Россия"));
        users.add(new User(2, "Виктория", 19, "Россия"));
        users.add(new User(3, "Владислав", 22, "Россия"));
        users.add(new User(4, "Франк", 36, "Канада"));
        users.add(new User(5, "Кэрри", 30, "США"));
        users.add(new User(6, "Глория", 25, "США"));
        users.add(new User(7, "Джо", 43, "CША"));
        users.add(new User(8, "Гризельда", 36, "Германия"));

        users.sort(Comparator.comparing(user -> user.country));
        users.sort(Comparator.comparing(user -> user.age));

        System.out.println("Отсортированный список пользователей: ");
        for (User user : users){
            System.out.println(user);
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("\n\n\nВведите минимальный возраст: ");
        int minAge = scan.nextInt();
        System.out.print("Введите первую букву имени: ");
        char firstLetter = scan.next().charAt(0);

        List<User> queryUsers = new ArrayList<>();
        for (User user: users){
            if (user.age > minAge && user.name.startsWith(String.valueOf(firstLetter))){
                queryUsers.add(user);
            }
        }

        System.out.println("\n\nОтфильтрованный список пользователей: ");
        for (User user: queryUsers){
            System.out.println(user);
        }

        int min_age = Integer.MAX_VALUE;
        int max_age = Integer.MIN_VALUE;

        for (int i = 0; i < users.size(); i++){
            int age = users.get(i).age;
            if (age < min_age) {
                min_age = age;
            }
            if (age > max_age) {
                max_age = age;
            }
        }

        System.out.println("\nМинимальный возраст: " + min_age);
        System.out.println("\nМаксимальный возраст: " + max_age);





















    }
}
