package Lab_6;
/**
 * lab 6 package
 */


/**
 * Class Equations implements calculation algorithm
 *
 * @author Roman Danchevskyi
 * @version 1.0
 */
class Equations {
    /** Method calculates the tg(x)/sin(2x) expression
     *
     * @param x
     * @return
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try {
            y = (Math.tan(x) / Math.sin(2.0 * x));
//Якщо результат не є числом, то генеруємо виключення
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY || y == Double.POSITIVE_INFINITY || x % 90 == 0)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {
//створимо виключення вищого рівня з поясненням причини
//виникнення помилки
            if (x % 90 == 0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }
}

