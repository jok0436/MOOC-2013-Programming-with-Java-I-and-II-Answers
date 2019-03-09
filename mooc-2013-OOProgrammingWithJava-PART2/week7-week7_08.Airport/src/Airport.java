
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
public class Airport {

    ArrayList<Airplane> planes = new ArrayList<Airplane>();
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public void addPlane(Airplane plane) {
        planes.add(plane);
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void printPlanes() {
        for (Airplane plane : planes) {
            System.out.println(plane);
        }
    }

    public void printFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public Airplane getPlane(String id) {
        for (Airplane plane : planes) {
            if (plane.getID().equals(id)) {
                return plane;
            }
        }
        return new Airplane("Nothing", 0);
    }

    public String getPlaneInfo(String planeID) {
        for (Airplane plane : planes) {
            if (plane.getID().equals(planeID)) {
                return plane.toString();
            }
        }
        return "Nothing!";
    }
}
