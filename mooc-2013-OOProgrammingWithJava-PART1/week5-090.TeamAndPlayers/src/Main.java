
public class Main {

    public static void main(String[] args) {
        // test your code here

        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        Team j = new Team("HIFK");
        Player p = new Player("Arto");
        j.addPlayer(p);
    }
}
