
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class test
     */
    public test()
    {
        x = 0;
        while (x < 100)
        {
            System.out.println(x);
            x++;
        }
    }

    /**
     */
    public void sum(int num1, int num2)
    {
        int i = 0;
        int Sum = 0;
        while (i > num1 && i < num2)
        {
            Sum += i;
            i++;
        }
        
    }
    
    public boolean isPrime(int n)
    {
        int i = 2;
        while (i < n)
        {
            if (n % i == 0)
            {
                return true;
            }
        }
        return false;
    }
}
