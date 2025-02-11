package task_4;

import java.util.Objects;

//Класс Двигатель
class Engine {
    private int power; // Мощность
    private  String type; // Тип двигателя

    public  Engine(int power, String type){
        this.power = power;
        this.type = type;
    }

    public int getPower(){
        return power;
    }
    public String getType(){
        return type;
    }

    @Override
    public  String toString(){
        return "Двигатель (" +
                "Мощность: " + power + " " +
                "Тип двигателя: " + type +
                ") ";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Engine engine = (Engine) obj;
        return power == engine.power && Objects.equals(type, engine.type);
    }
    @Override
    public int hashCode(){
        return  Objects.hash(type, power);
    }
}

//Класс Шасси
class Chassis {
    private int countOfWheels; //Количество колёс
    private  String typeChassis; // Тип шасси

    public Chassis(int countOfWheels, String  typeChassis){
        this.countOfWheels = countOfWheels;
        this.typeChassis = typeChassis;
    }
    public int getCountOfWheels(){
        return countOfWheels;
    }
    public String getTypeChassis(){
        return typeChassis;
    }

    @Override
    public String toString(){
        return "Шасси (" +
                "Количество колёс: " + countOfWheels + " " +
                "Тип шасси: " + typeChassis +
                ") ";
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Chassis chassis = (Chassis) obj;
        return countOfWheels == chassis.countOfWheels && Objects.equals(typeChassis, chassis.typeChassis);
    }
    @Override
    public int hashCode(){
        return Objects.hash(countOfWheels, typeChassis);
    }
}

//Класс Крылья
 class  Wing {
    private String material; //Материал крыльев

    public Wing(String material){
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }

    @Override
    public String toString(){
        return "Крыло (" +
                "Материал: " + material + " " +
                ") ";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() == obj.getClass()) {
            return false;
        }
        Wing wing = (Wing) obj;
        return material == wing.material && Objects.equals(material, wing.material);
    }

    @Override
    public int hashCode(){
        return Objects.hash(material);
    }
}
//Класс Самолёт
public class Airplane {
    private Engine engine; // Двигатель
    private Chassis chassis; // Шасси
    private Wing wing; //Крылья
    private String route; // Маршрут

    public Airplane(Engine engine, Chassis chassis, Wing wing){
        this.engine = engine;
        this.chassis = chassis;
        this.wing = wing;
    }

    public Engine getEngine(){
        return engine;
    }

    public Chassis getChassis(){
        return chassis;
    }
    public Wing getWing(){
        return wing;
    }

    public void setRoute(String route){
        this.route = route;
    }
    public void printRoute(){
        if (route != null) {
            System.out.println("Маршрут задан!");
            System.out.println(route);
        } else {
            System.out.println("Маршрут не задан!");
        }
    }
    public void fly(){
        System.out.println("Самолёт летит по маршруту!");
    }

    @Override
    public String toString(){
        return "Самолёт (" +
                "Двигатель: " + engine + " " +
                "Шасси: " + chassis + " " +
                "Крылья: " + wing + " " +
                "Маршрут: " + route +
                ") ";
    }
    @Override
    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() == obj.getClass()){
            return false;
        }
        Airplane airplane = (Airplane) obj;
        return Objects.equals(engine, airplane.engine) && Objects.equals(chassis, airplane.chassis) &&
                Objects.equals(wing, airplane.wing) && Objects.equals(route, airplane.route);
    }

    @Override
    public int hashCode(){
        return Objects.hash(engine, chassis, wing, route);
    }
}

