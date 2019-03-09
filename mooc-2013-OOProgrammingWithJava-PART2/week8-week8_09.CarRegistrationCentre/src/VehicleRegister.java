
import java.util.HashMap;
import java.util.HashSet;
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
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

    public boolean add(RegistrationPlate plate, String owner) {
        if (doesExist(plate)) {
            return false;
        } else {
            owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate) {
        if (doesExist(plate)) {
            return owners.get(plate);
        } else {
            return null;
        }
    }

    public boolean delete(RegistrationPlate plate) {
        if (doesExist(plate)) {
            owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public boolean doesExist(RegistrationPlate plate) {
        return owners.containsKey(plate);
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate key : owners.keySet()) {
            System.out.println(key);
        }
    }

    public void printOwners() {
        Set<String> values = new HashSet<String>();
        for (String owner : owners.values()) {
            values.add(owner);
        }
        for (String value : values) {
            System.out.println(value);
        }
    }
}
