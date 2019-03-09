
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class Phonebook {

    private ArrayList<Person> people;

    public Phonebook() {
        this.people = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        people.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }

    public String searchNumber(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
