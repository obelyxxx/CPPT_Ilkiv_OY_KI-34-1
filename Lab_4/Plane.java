package Lab_4;

/**

/**
 * Class <code>Plane</code> implements plane
 40
 * @author Ostap Ilkiv
 * @version 1.0
 */

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


abstract class Plane {
    static int count;
    private Lab_3.Plane.Engine engine;
    private Lab_3.Plane.StrapMode strapMode;
    private Lab_3.Plane.Wheels wheels;

    /* Constructor
     *
     * @throws FileNotFoundException
     */
    Plane() throws FileNotFoundException {
        engine = new Lab_3.Plane.Engine();
        strapMode = new Lab_3.Plane.StrapMode();
        wheels = new Lab_3.Plane.Wheels();
        PrintWriter fout = new PrintWriter(new File("Log.txt"));
        count++;
    }

    /* Constructor
     *
     * @param engine capacity
     * @throws FileNotFoundException
     */
    Plane(float engineCapacity) throws FileNotFoundException {
        engine = new Lab_3.Plane.Engine(engineCapacity);
        strapMode = new Lab_3.Plane.StrapMode();
        wheels = new Lab_3.Plane.Wheels();
        PrintWriter fout = new PrintWriter(new File("Log.txt"));
    }

    /* Constructor
     *
     * @param engine capacity
     * @param number of people
     * @throws FileNotFoundException
     */
    Plane(float engineCapacity, int peopleCap) throws FileNotFoundException {
        engine = new Lab_3.Plane.Engine(engineCapacity);
        strapMode = new Lab_3.Plane.StrapMode(peopleCap);
        wheels = new Lab_3.Plane.Wheels();
        PrintWriter fout = new PrintWriter(new File("Log.txt"));

    }

    /* Constructor
     *
     * @param engine capacity
     * @param number of people
     * @param number of wheels
     * @throws FileNotFoundException
     */
    Plane(float engineCapacity, int peopleCap, int wheelsQuantity) throws FileNotFoundException {
        engine = new Lab_3.Plane.Engine(engineCapacity);
        strapMode = new Lab_3.Plane.StrapMode(peopleCap);
        wheels = new Lab_3.Plane.Wheels(wheelsQuantity);
        PrintWriter fout = new PrintWriter(new File("Log.txt"));
        count++;
    }


    /* Getter for Engine
     */
    public Lab_3.Plane.Engine getEngine() {
        return engine;
    }

    /* Setter for Engine
     */
    public void setEngine(Lab_3.Plane.Engine engine) {
        this.engine = engine;
    }


    /* Getter for StrapMode
     */
    public Lab_3.Plane.StrapMode getStrapMode() {
        return strapMode;
    }

    /* Setter for StrapMode
     */
    public void setStrapMode(Lab_3.Plane.StrapMode strapMode) {
        this.strapMode = strapMode;
    }


    /* Getter for Wheels
     */
    public Lab_3.Plane.Wheels getWheels() {
        return wheels;
    }

    /* Setter for Wheels
     */
    public void setWheels(Lab_3.Plane.Wheels wheels) {
        this.wheels = wheels;
    }







    /* Method implements plane moving
     */
    public void go() {
        engine.start();
        System.out.println("The plane started to go...");
        wheels.spin();
        //fout.println("The car started to go...");
        strapMode.StrapOn(100);

    }
    /* Method implements plane stopping
     */
    public void planeStop(){
        engine.stop();
        System.out.println("The plane stopped");
        wheels.brake();
        strapMode.StrapOn(0);
    }




    /* Method shows plane info
     */

    public void info(){
        System.out.println("engine capacity is: "+engine.getCapacity());
        System.out.println("number of straps: "+strapMode.getModeCapacity());
        System.out.println("number of wheels: "+ wheels.getNumberOfWheels());
    }



    /* Class Engine implements plane engine
     *
     * @author Ilkiv
     * @version 1.0
     */
    class Engine {

        private float capacity;


        /* Constructor
         */
        public Engine() {
            this.capacity = 1.0f;
        }

        /* Constructor
         *
         * @param engine capacity
         */
        public Engine(float capacity) {
            this.capacity = capacity;
        }

        /* Getter for capacity
         */
        public float getCapacity() {
            return capacity;
        }

        /* Setter for capacity
         */
        public void setCapacity(float capacity) {
            this.capacity = capacity;
        }

        /* Method implements engine start
         */
        public void start() {
            System.out.println("Engine is started...");
            //fout.println("Engine is started...");
        }

        public void stop() {
            System.out.println("Engine is stopped...");
            //fout.println("Engine is started...");
        }
    }

    class StrapMode {

        private int ModeCapacity = 0;


        /* Constructor
         */
        public StrapMode() {
            this.ModeCapacity = 0;
        }

        /* Constructor
         *
         * @param engine ModeCapacity
         */
        public StrapMode(int ModeCapacity) {
            this.ModeCapacity = ModeCapacity;
        }

        /* Getter for ModeCapacity
         */
        public float getModeCapacity() {
            return ModeCapacity;
        }

        /* Setter for ModeCapacity
         */
        public void setModeCapacity(int ModeCapacity) {
            this.ModeCapacity = ModeCapacity;
        }

        public void StrapOn(int strap) {
            ModeCapacity = strap;
            System.out.println("Seats straped: " + ModeCapacity);
        }
    }



    /* Class Wheels implements plane wheels
     *
     * @author Ilkiv
     * @version 1.0
     */
    class Wheels {

        private int numberOfWheels;
        /* Constructor
         */
        public Wheels() {
            this.numberOfWheels = 4;
        }

        /* Constructor
         *
         * @param number of wheels
         */
        public Wheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }

        /* Getter for numberOfWheels
         */
        public int getNumberOfWheels() {
            return numberOfWheels;
        }

        /* Setter for numberOfWheels
         */
        public void setNumberOfWheels(int numberOfWheels) {
            this.numberOfWheels = numberOfWheels;
        }

        /* Method implements the rotation of the wheels
         */
        public void spin() {
            System.out.println("Wheels are spinning...");
            // fout.println("Wheels are spinning...");
        }

        /**
         * Method implements braking
         */
        public void brake() {
            System.out.println("Wheels are braking...");
            //fout.println("Wheels are braking...");
        }
    }

}


