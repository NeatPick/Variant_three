package task_7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class User {
    int id;
    String name;
    int age;
    String country;

    public User(int id, String name, int age, String country){
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString(){
        return "Пользователь{ ID: " +
                " Имя: " + name +
                " Возраст: " + age +
                " Страна: " + country + " }";
    }
}

