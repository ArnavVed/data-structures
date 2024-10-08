import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /*
         * the map interaface is generic
         * The first type given is the type of the key
         * The second type given is the type of the value 
         */
        Map<String, Color> favColors = new HashMap<>();

        //Add elements to the map using put method 

        favColors.put("henry", Color.BLUE);
        favColors.put("Jack", Color.RED);
        favColors.put("Priya", Color.GREEN);

        favColors.put("Dr Miller", Color.GREEN);
        
        //same key cannot have 2 different values 
        //Using pit on a key that already exists changes the value
        favColors.put("Jack", Color.MAGENTA);

        //Crete a set of the keys in a map
        Set<String> keys = favColors.keySet();

        for(String key: keys){
            System.out.println(key + "(" + key.hashCode() + "): "+favColors.get(key));
        }
        
    }
}
