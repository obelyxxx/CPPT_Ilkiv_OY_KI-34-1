package Lab_5;




import java.util.Scanner;
        import java.io.*;
        import static java.lang.System.out;


public class Lab5 {
    public static void main(String[] args)
    {
        try
        {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));



            try
            {
                try
                {
                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));


                }
                finally
                {
                    fout.flush();
                    fout.close();
                }
            }
            catch (CalcException ex)
            {
                out.print(ex.getMessage());
            }
        }
        catch (FileNotFoundException ex)
        {
            out.print("Exception reason: Perhaps wrong file path");
        }


    }
}



 class IncorrectFileNameException extends ArithmeticException {
    public IncorrectFileNameException(String errorMessage) {
        super(errorMessage);
    }
}


class CalcException extends ArithmeticException
{
    public CalcException(){}

    public CalcException(String cause)
    {
        super(cause);
    }
}


class Equations
{
    public double calculate(int x) throws CalcException
    {
        double y, rad;
        rad = x * Math.PI / 180.0;
        try
        {
            y = Math.tan(rad) / Math.sin(2 * rad);
            if (y==Double.NaN || y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || x==90 || x== -90)
                throw new ArithmeticException();

            else if (x < 0)
                throw new CalcException( "wrong");

        }
        catch (ArithmeticException ex)
        {
            if (rad==Math.PI/2.0 || rad==-Math.PI/2.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");

            else if (x==0)
                throw new CalcException("Exception reason: X = 0");
//            else if (x < 0)
//                throw new CalcException( "wrong");

            else
                throw new CalcException("Unknown reason of the exception during exception calculation");

        }
        return y;

    }
}
