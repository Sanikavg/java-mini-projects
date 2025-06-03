import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private HashMap<String, String>responseMap;
    private ArrayList<String> responses;
    private Random randomGenerator;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator = new Random();
        responseMap = new HashMap<>();
        responses = new ArrayList<>();
        fillResponseMap();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> words)
    {
        for (String word: words)
        {
            String response = responseMap.get(word);
            if (response != null)
            {
                return response;
            }
        }
        return pickDefaultResponse();
    }
    
    private void fillResponseMap()
    {
        responseMap.put("slow","I think this has to do with your hardware, Upgrading your processor should solve all performance problems.");
        responseMap.put ("bug","Our software engineers are working very hard to fix them. Can you describe the problem a bit further?");
        responseMap.put("expensive","The cost of our product is quite competitive. Have you looked around and really compared our features?");
    }
    
    private String pickDefaultResponse()
    {
        responses.add("That sounds odd. Could you describe this in more detail?"); 
        responses.add("No other customer has ever complained about this before. What is your system configuration?");
        responses.add("I need a bit more information on that."); 
        responses.add("Have you checked that you do not have a dll conflict?"); 
        responses.add("That is covered in the manual. Have you read the manual?"); 
        responses.add("Your description is a bit wishy-washy. Have you got an expert there with you who could describe this better?");
        responses.add("That's not a bug, it's a feature!"); 
        responses.add("Could you elaborate on that?");
        responses.add("Have you tried running the app on your phone?"); 
        responses.add("I just checked StackOverflow - they don't know either.");
        
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index);
    }
}
