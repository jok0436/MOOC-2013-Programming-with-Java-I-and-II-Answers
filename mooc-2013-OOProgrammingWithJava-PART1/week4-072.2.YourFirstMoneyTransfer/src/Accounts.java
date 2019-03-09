
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account ac1 = new Account("Matt\'s account", 1000.00);
        Account ac2 = new Account("My account", 0.00);
        ac1.withdrawal(100);
        ac2.deposit(100);
        System.out.println(ac1);
        System.out.println(ac2);
    }

}
