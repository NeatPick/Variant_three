package task_6;

interface Candies {
    String Manufacturer(); // Производитель
    String Info();// Информация о продукте
    void produce(int count);
    void editingInfo(String newInfo); //Редактирование информации о продукте
}

class Candy implements Candies{
    String name;
    String manufacturer;
    String info;

    Candy(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public void produce(int count) {
        System.out.println("Произведено " + count + " шт. " + name);
    }

    public String Manufacturer(){
        return  "Производитель: " + manufacturer;
    }
    public void editingInfo(String newInfo){
        this.info = newInfo;
        System.out.println("Информация изменена для " + name + ": " + newInfo);
    }

    public String Info(){
        return  "Информация о " + name + ": " + info;
    }
}

class Chocolate extends Candy {
    Chocolate(String manufacturer) {
       super("Шоколад", manufacturer);

    }
}

class Lollipop extends Candy {
    Lollipop(String manufacturer) {
        super("Леденец", manufacturer);
    }
}

class Caramel extends Candy {
    Caramel(String manufacturer) {
        super("Карамель", manufacturer);
    }


}

public class CandyFactory{
    public static void CandyInfo(){
        Chocolate chocolate = new Chocolate("Победа");
        chocolate.produce(100);
        chocolate.editingInfo("Горький шоколад 72% какао");
        System.out.println(chocolate.Manufacturer());
        System.out.println(chocolate.Info());

        Lollipop lollipop = new Lollipop("Кармолис");
        lollipop.produce(50);
        lollipop.editingInfo("Леденец со вкусом имбирь-лимон");
        System.out.println(lollipop.Manufacturer());
        System.out.println(lollipop.Info());

        Caramel caramel = new Caramel("Яшкино");
        caramel.produce(300);
        caramel.editingInfo("Карамель со вкусом яблоко с соком");
        System.out.println(caramel.Manufacturer());
        System.out.println(caramel.Info());
    }
}





