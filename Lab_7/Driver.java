package Lab_7;


/**
 * Driver class implements main method for Wardrobe class possibilities demonstration
 *
 * @author Ostap Ilkiv
 * @version 1.0
 */
public class Driver {

    public static void main(String[] args) {
        Wardrobe<? super Thing> wardrobe = new Wardrobe<Thing>();

        wardrobe.add(new Shirt(0));
        wardrobe.add(new Pants(10));
        wardrobe.add(new Shirt(20));
        wardrobe.add(new Shirt(20));
        wardrobe.add(new Shirt(30));
        wardrobe.add(new Pants(10));
        wardrobe.add(new Pants(100));

        wardrobe.remove(0);

        Thing thing = wardrobe.findMin();
        //System.out.println("The lightest thing is: ");
        thing.print();

        wardrobe.weight();

    }
}
