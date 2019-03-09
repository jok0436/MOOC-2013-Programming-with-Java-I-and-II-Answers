/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josia
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        // write code here
        if (this.balance >= 4.0) {
            this.balance -= 4.0;
        }

    }

    public void loadMoney(double amount) {
        if (amount >= 0) {
            this.balance += amount;
            if (this.balance > 150.0) {
                this.balance = 150.0;
            }
        }
    }

}
