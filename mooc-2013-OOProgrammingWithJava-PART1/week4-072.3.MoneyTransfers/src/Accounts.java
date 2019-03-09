
public class Accounts {

    public static void main(String[] args) {

        Account a = new Account("A", 100.00);
        Account b = new Account("B", 0.00);
        Account c = new Account("C", 0.00);
        transfer(a, b, 50.0);
        transfer(b, c, 25.0);

    }

    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }
}
