
public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        UserInterface ui = new UserInterface();
        Tournament tournament = new Tournament();
        String input = "Boo!";
        ui.printStart();
        while (!input.equals("")) {
            ui.printParticipantString();
            input = ui.getInput();
            if (!input.equals("")) {
                tournament.addSkier(input);
            }
        }
        ui.printTournament();
        input = "jump";
        while (input.equals("jump")) {
            input = ui.printJumpGetInput();
            if (input.equals("jump")) {
                ui.print(tournament.printJumpingOrder());
                ui.print(tournament.jump());
            }
        }
        ui.printEnd();
        ui.print(tournament.getResultsALL());
    }
}
