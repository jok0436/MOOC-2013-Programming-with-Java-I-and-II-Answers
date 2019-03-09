
public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Airport airport = new Airport();
        UserInterface ui = new UserInterface();
        String input = "";
        ui.start();
        while (!input.equals("x")) {
            ui.printOperations();
            input = ui.getStringUser();
            if (input.equals("1")) {
                airport.addPlane(addPlane(ui));
            } else if (input.equals("2")) {
                ui.print("Give plane ID: ");
                String planeid = ui.getStringUserNoGreaterThan();
                Airplane foundPlane = airport.getPlane(planeid);
                airport.addFlight(addFlight(ui, foundPlane));
            }
        }
        ui.printFlightService();
        input = "";
        while (!input.equals("x")) {
            ui.printOperationsStats();
            input = ui.getStringUser();
            if (input.equals("1")) {
                airport.printPlanes();
            } else if (input.equals("2")) {
                airport.printFlights();
            } else if (input.equals("3")) {
                ui.print("Give plane ID: ");
                String planeID = ui.getStringUserNoGreaterThan();
                ui.print(airport.getPlaneInfo(planeID));
            }
        }
    }

    public static Airplane addPlane(UserInterface ui) {
        ui.print("Give plane ID: ");
        String id = ui.getStringUserNoGreaterThan();
        System.out.println("Give plane capacity: ");
        int capacity = ui.getIntUser();
        Airplane newPlane = new Airplane(id, capacity);
        return newPlane;
    }

    public static Flight addFlight(UserInterface ui, Airplane plane) {
        ui.print("Give departure airport code: ");
        String depart = ui.getStringUserNoGreaterThan();
        ui.print("Give destination airport code: ");
        String destination = ui.getStringUserNoGreaterThan();
        Flight newFlight = new Flight(plane, depart, destination);
        return newFlight;

    }
}
