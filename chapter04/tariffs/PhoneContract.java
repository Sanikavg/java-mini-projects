/**
 * Maintain details of a mobile phone contract in terms of
 * the rate charged for phone calls.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2017.10.15
 */
public class PhoneContract
{
    // The number for this contract.
    private String phoneNumber;
    // How calls are charged.
    private PhoneRate tariff;
    // How cheaper calls are charged.
    private PhoneRate cheapTariff;
    // The billing amount (in cents) for this contract.
    private int bill;

    private int totalDuration;
    private int numberOfCalls;
    private int numberOfCheaperCalls;
    /**
     * Constructor for objects of class PhoneContract.
     * @param phoneNumber The number of this contract.
     */
    public PhoneContract(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        tariff = new PhoneRate(5, 10);
        cheapTariff = new PhoneRate(3, 6);
        bill = 0;
        totalDuration = 0;
        numberOfCalls = 0;
        numberOfCheaperCalls = 0;
    }

    /**
     * Calculate the cost of a call of the given duration.
     * @param duration The length of the call in seconds.
     */
    public void makeCall(int duration)
    {
        int cost;
        if(duration < 3600){
            cost = tariff.calculateCost(duration);
        } else {
            cost = cheapTariff.calculateCost(duration);
            numberOfCheaperCalls++;
        }
        bill = bill + cost;
        totalDuration = totalDuration + duration;
        numberOfCalls++;
        System.out.println(phoneNumber + ": The call lasting " +
            duration + " seconds costs " + cost +
            " cents.");
    }

    /**
     * Print bill details.
     */
    public void sampleMethod()
    {
        System.out.println("number: "+ phoneNumber);
        System.out.println("number of calls: "+ numberOfCalls);
        System.out.println("amount:" + bill);
        System.out.println("average time: "+ totalDuration/numberOfCalls);
        System.out.println("original rate calls:" + (numberOfCalls - numberOfCheaperCalls));
        System.out.println("cheaper rate calls:" + numberOfCheaperCalls);
    }

    /**
     * Return the current bill, in cents.
     * @return The current bill.
     */
    public int getBill()
    {
        return bill;
    }

    /**
     * Return the current totalDuration.
     * @return The current totalDuration.
     */
    public int getTotalDuration()
    {
        return totalDuration;
    }
}
