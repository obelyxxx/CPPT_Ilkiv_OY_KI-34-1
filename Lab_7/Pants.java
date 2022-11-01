package Lab_7;

/**
 * Class Pants implements pants
 *
 * @author Ostap Ilkiv
 * @version 1.0
 */
public class Pants implements Thing {

    /**
     * Constructor
     *
     * @param weight
     */
    public Pants(int weight) {
        this.weight = weight;
    }

    /**
     * Constructor
     */
    public Pants() {
        this.weight = 200;
    }

    private int weight;

    /**
     * Method prints info about thing
     */
    @Override
    public void print() {
        System.out.println("Type of thing: pants");
        System.out.println("Weight: " + weight + " g");
    }

    /**
     * Method returns thing's weight
     */
    @Override
    public int getWeight() {
        return weight;
    }

    /**
     * Method compares current Thing with another Thing
     */
    @Override
    public int compareTo(Thing d) {
        if (this.weight < d.getWeight())
            return -1;
        if (this.weight == d.getWeight())
            return 0;
        return 1;
    }
}
