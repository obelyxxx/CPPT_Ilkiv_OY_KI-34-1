package Lab_4;




import Lab_4.Plane;

import java.io.FileNotFoundException;

interface Bombing{
    void bomb(double x);
}


interface Shot extends Lab_4.Bombing {
    double frequency  ();  //прототип методу
    int LIMIT = 10; //константа
}


public class Bomber  extends Lab_4.Plane implements Lab_4.Shot {
    static double i = 0;
    public Bomber (double EbombSize, double ESpeed, double Edistance) throws FileNotFoundException {
        super();
        speed = EbombSize;
        bombSize = ESpeed;
        distance = Edistance;

        if(distance>i){
            i=distance;
        }

    }
    public Bomber () throws FileNotFoundException {
        super();
        speed = 0.0;
        bombSize = 0.0;
        distance = 0.0;
    }
    public void bomb (double x)
    {
        distance = distance + x;
        speed = speed - distance / bombSize;
    }
    public double getDistance()
    {
        return distance;
    }
    public double milesToFueling ()
    {
        return speed*bombSize;
    }
    private double distance;
    private final double bombSize;
    private double speed;



    @Override
    public double frequency() {
        return 0;
    }
}
