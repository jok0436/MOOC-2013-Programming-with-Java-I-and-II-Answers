/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
package movable;

import java.util.ArrayList;

public class Group implements Movable {
    
    private ArrayList<Movable> items = new ArrayList<Movable>();
    
    public void addToGroup(Movable movable) {
        items.add(movable);
    }
    
    public String toString() {
        String output = "";
        for (Movable item : items) {
            output += item.toString() + "\n";
        }
        return output;
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable item : items) {
            item.move(dx, dy);
        }
    }
    
}
