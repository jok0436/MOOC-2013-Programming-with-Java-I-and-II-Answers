package moving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.Item;
import moving.domain.Thing;
import moving.logic.Packer;

public class Main {

    public static void main(String[] args) {
        // test your program here
        Packer packer = new Packer(1000);
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("Olutkori", 10));
        things.add(new Item("Stone", 5));
        things.add(new Item("Taulu", 20));
        packer.packThings(things);
    }
}
