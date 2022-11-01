package Lab_7;

import java.util.ArrayList;

/**
 * Class Wardrobe implements wardrobe
 *
 * @author Ostap Ilkiv
 * @version 1.0
 */
public class Wardrobe<T extends Thing> {

    /**
     * Constructor
     */
    public Wardrobe() {
        list = new ArrayList<T>();
    }

    ArrayList<T> list;

    /**
     * Method puts thing into a box
     */
    public void add(T t) {
        list.add(t);
    }

    /**
     * Method prints info about thing
     */
    public void get(int index) {
        list.get(index).print();
    }

    /**
     * Method removes thing from box
     */
    public void remove(int index) {
        list.remove(index);
    }

    /**
     * Method prints weight of box
     */


    /**
     * Method returns thing with the little weight
     */
    public T findMin() {
        T min = list.get(0);
        for (T t : list)
            if (t.compareTo(min) == -1)
                min = t;
        return min;
    }



    //сума ваги
    public void weight() {
        int sumWeight = 0;
        for (T t : list)
            sumWeight += t.getWeight();
        System.out.println("Total weight of things in this wardrobe is: " + sumWeight + " g");
    }
}