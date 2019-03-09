
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class Controller {

    private HashMap<String, Person> people = new HashMap<String, Person>();

    public void addNumber(String who, String number) {
        if (people.containsKey(who)) {
            people.get(who).addNumber(number);
        } else {
            Person newPerson = new Person(who, number, true);
            people.put(who, newPerson);
        }
    }

    public String searchNumber(String who) {
        if (people.containsKey(who) && people.get(who).countNumbers() > 0) {
            return people.get(who).getAllNumbers();
        } else {
            return "  not found";
        }
    }

    public String searchPersonByPhone(String number) {
        String output = "";
        for (String person : people.keySet()) {
            if (people.get(person).gotNumber(number)) {
                output += " " + person;
            }
        }
        if (output.equals("")) {
            return "  not found";
        } else {
            return output;
        }
    }

    public void addAddress(String who, String address, String city) {
        String newAddress = address + " " + city;
        if (people.containsKey(who)) {
            people.get(who).addAddress(newAddress);
        } else {
            Person newPerson = new Person(who, newAddress, false);
            people.put(who, newPerson);
        }
    }

    public String searchPersonal(String who) {
        if (people.containsKey(who)) {
            return people.get(who).toString();
        } else {
            return "  not found";
        }
    }

    public void deletePerson(String who) {
        if (people.containsKey(who)) {
            people.get(who).clearInfo();
        }
    }

    public String searchFiltered(String who) {
        String output = "";
        List<Person> people2 = new ArrayList<Person>(people.values());
        Collections.sort(people2);
        for (Person person : people2) {
            if (who.equals("") || person.getName().contains(who) || people.get(person.getName()).getAllAddresses().contains(who)) {
                output += " " + person.getName() + "\n" + people.get(person.getName()).toString() + "\n";
            }
        }
        if (output.equals("")) {
            return " keyword not found";
        } else {
            return output;
        }
    }
}
