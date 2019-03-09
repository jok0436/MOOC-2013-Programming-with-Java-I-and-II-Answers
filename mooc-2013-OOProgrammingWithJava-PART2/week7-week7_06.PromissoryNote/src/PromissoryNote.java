
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class PromissoryNote {

    private HashMap<String, Double> note = new HashMap<String, Double>();

//    public PromissoryNote(String newName, int newAmount) {
//        this.name = newName;
//        this.amount = newAmount;
//    }
    public PromissoryNote() {

    }

    public void setLoan(String toWhom, double value) {
        note.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (note.containsKey(whose)) {
            return note.get(whose);
        } else {
            return 0;
        }
    }
}
