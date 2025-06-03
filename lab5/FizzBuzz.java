
/**
 * Write a description of class FizzBuzz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FizzBuzz
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class FizzBuzz
     */
    public FizzBuzz()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void print()
    {
        for (int i = 1; i < 101; i++)
        {
            if (i % 3 == 0 && i % 5== 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
