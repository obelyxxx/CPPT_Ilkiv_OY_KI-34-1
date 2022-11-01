package Lab_7;

/**
 * Interface Thing describes rules for thing type
 *
 * @author Ostap Ilkiv
 * @version 1.0
 */
interface Thing {

    /**
     * Method prints info about thing
     */
    public void print();

    /**
     * Method returns thing's weight
     */
    public int getWeight();


    public int compareTo(Thing d);
}

