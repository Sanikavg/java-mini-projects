
/**
 * Write a description of class member here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class member
{
    // instance variables - replace the example below with your own
    private String name;
    private int year;
    private boolean student_membership;

    /**
     * Constructor for objects of class member
     */
    public member(String name, int year)
    {
        this.name = name;
        this.year = year;
        student_membership = false; // initialise instance variables
        
    }

    public String getName()
    {
        return name;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String getMembership()
    {
        if (student_membership) 
        {
            return "Student Membership";
        }
        else
        {
            return "Normal Membership";
        }
        
    }
          
    
    public void setStudent()
    {
        student_membership = true;
    }
    
    public void changeName(String newname)
    {
        name = newname;
    }
}

