
public class Reformatory {

    private int timesMeasured = 0;

    public int weight(Person person) {
        // return the weight of the person
        timesMeasured++;
        return person.getWeight();

    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return timesMeasured;
    }

}
