package task_4;

public class AirplaneManager {

    public static void airplaneControl(){
        Engine engine = new Engine(2500, "Турбореактивный двухконтурный ");
        Chassis chassis = new Chassis(3, "Трехопорное");
        Wing wing = new Wing("Титан");

        Airplane airplane = new Airplane(engine, chassis, wing);

        airplane.setRoute("г. Улан-Удэ");

        airplane.printRoute();

        airplane.fly();

        System.out.println(airplane);
    }
}
