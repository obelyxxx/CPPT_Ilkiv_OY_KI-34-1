package Lab_7;

/**
 * Class Shirt implements shirt
 *
 * @author Ostap Ilkiv
 * @version 1.0
 */
public class Shirt implements Thing {

    /**
     * Constructor
     *
     * @param weight
     */
    public Shirt(int weight) {
        this.weight = weight;
    }

    /**
     * Constructor
     */
    public Shirt() {
        this.weight = 50;
    }

    private int weight;

    /**
     * Method prints info about thing
     */
    @Override
    public void print() {
        System.out.println("Type of thing: shirt");
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
