import java.util.ArrayList;
import java.util.List;

public class Account {
    private double balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            transactions.add(new Transaction("'Депозит'", amount, balance));
        } else {
            System.out.println("Неверная сумма депозита!");
        }
    }

    public void takeOff(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            transactions.add(new Transaction("'Вывод средств'", amount, balance));
        } else {
            System.out.println("Недостаточно средств для вывода!");
        }
    }

    public void payment(String recipient, double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            transactions.add(new Transaction("'Платёж'", amount, balance));
        } else  {
            System.out.println("Произошла ошибка в сумме платежа!");
        }
    }

    public void DisplayTransactionHustory(){
        for (int i = 0; i < transactions.size(); i++){
            System.out.println(transactions.get(i));
        }
    }

    class Transaction{
        private String typeTrans; // Тип транзакции
        private double amount; // Сумма транзакции
        private double currentBalance; // Текущей баланс после транзакций

        public Transaction(String typeTrans, double amount, double currentBalance){
            this.typeTrans = typeTrans;
            this.amount = amount;
            this.currentBalance = currentBalance;
        }

        @Override
        public String toString(){
            return "Транзакция {" +
                    "Тип транзакции: " + typeTrans +
                    " Сумма транзакции: " + amount +
                    " Текущей баланс: " + currentBalance +
                    "}";
        }
    }
}

class MyAccount {

    public static void myAccount(){
        Account account = new Account(25000);
        account.deposit(5000);
        account.takeOff(2500);
        account.payment("Оплата мобильной связи", 500);
        account.DisplayTransactionHustory();
    }

}
