
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        int money1 = this.euros() * 100 + this.cents();
        int money2 = added.euros() * 100 + added.cents();
        int resultDollars = (money1 + money2) / 100;
        int resultCents = (money1 + money2) % 100;
        return new Money(resultDollars, resultCents);
    }

    public Money minus(Money decremented) {
        int money1 = this.euros() * 100 + this.cents();
        int money2 = decremented.euros() * 100 + decremented.cents();
        if (money1 - money2 < 0) {
            return new Money(0, 0);
        }
        int resultDollars = (money1 - money2) / 100;
        int resultCents = (money1 - money2) % 100;
        return new Money(resultDollars, resultCents);
    }

    public boolean less(Money compared) {
        int money1 = (this.euros() * 100) + this.cents();
        int money2 = (compared.euros() * 100) + compared.cents();
        return money1 < money2;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
