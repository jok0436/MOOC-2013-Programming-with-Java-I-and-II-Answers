
public class Main {
    
    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        Controller controller = new Controller();
        UserInterface ui = new UserInterface();
        ui.printStart();
        String input = "";
        String input1 = "";
        String input2 = "";
        String input3 = "";
        while (!input.equals("x")) {
            ui.printCommand();
            input = ui.getInput();
            input1 = "";
            input2 = "";
            input3 = "";
            if (input.equals("1")) {
                ui.printWhoseNum();
                input1 = ui.getInput();
                ui.printNumber();
                input2 = ui.getInput();
                controller.addNumber(input1, input2);
                ui.println("");
            }
            if (input.equals("2")) {
                ui.printWhoseNum();
                input1 = ui.getInput();
                ui.print2(controller.searchNumber(input1));
            }
            if (input.equals("3")) {
                ui.printNumber();
                input1 = ui.getInput();
                ui.print2(controller.searchPersonByPhone(input1));
            }
            if (input.equals("4")) {
                ui.printWhoseAddress();
                input1 = ui.getInput();
                ui.printStreet();
                input2 = ui.getInput();
                ui.printCity();
                input3 = ui.getInput();
                controller.addAddress(input1, input2, input3);
            }
            if (input.equals("5")) {
                ui.printWhoseInfo();
                input1 = ui.getInput();
                ui.print2(controller.searchPersonal(input1));
            }
            if (input.equals("6")) {
                ui.printWhoseInfo();
                input1 = ui.getInput();
                controller.deletePerson(input1);
            }
            if (input.equals("7")) {
                ui.printKeyword();
                input1 = ui.getInput();
                ui.print2(controller.searchFiltered(input1));
            }
        }
    }
}
