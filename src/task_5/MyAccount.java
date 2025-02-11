package task_5;

public class MyAccount {

    public static void myAccount(){
        Account account = new Account(25000);
        account.deposit(5000);
        account.takeOff(2500);
        account.payment("Оплата мобильной связи", 500);
        account.DisplayTransactionHustory();
    }

}
