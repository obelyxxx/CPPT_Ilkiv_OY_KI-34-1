package Lab_6;

/**
 * lab 6 package
 */

/**
 * Class CalcException implements calculation exceptions
 *
 * @author Ostap Ilkiv
 * @version 1.0
 */
class CalcException extends ArithmeticException {

    /**
     * Constructor
     */
    public CalcException() {
    }

    /**
     * Constructor
     *
     * @param cause
     */
    public CalcException(String cause) {
        super(cause);
    }
}

