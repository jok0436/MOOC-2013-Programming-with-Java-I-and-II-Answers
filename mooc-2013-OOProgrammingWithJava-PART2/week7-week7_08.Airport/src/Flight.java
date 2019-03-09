/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josia
 */
public class Flight {

    private Airplane plane;
    private String departure;
    private String arrival;

    public Flight(Airplane newPlane, String newDeparture, String newArrival) {
        this.plane = newPlane;
        this.departure = newDeparture;
        this.arrival = newArrival;
    }

    public String toString() {
        return this.plane.toString() + " (" + this.departure + "-" + this.arrival + ")";
    }
}
