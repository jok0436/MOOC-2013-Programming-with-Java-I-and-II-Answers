package farmsimulator;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Farm farm = new Farm("Esko", new Barn(new BulkTank()));
        System.out.println(farm);

        System.out.println(farm.getOwner() + " is a tough guy!");
    }
}
