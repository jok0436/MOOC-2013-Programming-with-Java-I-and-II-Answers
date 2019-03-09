
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
public class Person implements Comparable<Person> {

    private String name;
    private ArrayList<String> numbers = new ArrayList<String>();
    private ArrayList<String> addresses = new ArrayList<String>();

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String other, boolean isNumber) {
        this.name = name;
        if (isNumber) {
            numbers.add(other);
        } else {
            addresses.add(other);
        }
    }

    public int countNumbers() {
        return numbers.size();
    }

    public int countAddresses() {
        return addresses.size();
    }

    public String getAllNumbers() {
        String output = "";
        for (String number : numbers) {
            output += "   " + number + "\n";
        }
        return output.substring(0, output.length() - 1);
    }

    public String getAllAddresses() {
        String output = "";
        for (String number : addresses) {
            output += number + "\n";
        }
        if (output.equals("")) {
            return "  not found";
        } else {
            return output.substring(0, output.length() - 1);
        }
    }

    public void addNumber(String number) {
        numbers.add(number);
    }

    public void addAddress(String address) {
        numbers.add(address);
    }

    public boolean gotNumber(String number) {
        return numbers.contains(number);
    }

    public boolean gotAddress(String address) {
        return addresses.contains(address);
    }

    public void clearInfo() {
        this.numbers.clear();
        this.addresses.clear();
    }

    @Override
    public String toString() {
        String output = "";
        if (this.countAddresses() > 0) {
            output += "  address: " + this.getAllAddresses();
        } else {
            output += "  address unknown" + "\n\n";
        }
        if (this.countNumbers() > 0) {
            output += "  phone numbers:" + "\n" + this.getAllNumbers();
        } else {
            output += "  phone number not found";
        }
        return output;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}
