import java.util.*;
import java.io.*;

/**
 * Read all words from a file and add them to a map
 * whose keys are the first letters of the words and
 * whose values are sets of words that start with
 * that same letter. Then print out the word sets in
 * alphabetical order. Update the map by modifying
 * Worked Example 15.1.
 */
public class FirstLetterMap
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities//FirstLetterMap//FirstLetterMap2//src//test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {
            Map<Character, Set<String>> map = new HashMap<>();

            while (in.hasNext())
            {
                String word = clean(in.next());
                if (!word.isEmpty()) {
                    Character c = word.charAt(0);

                    map.putIfAbsent(c, new HashSet<>()); 
                    map.get(c).add(word); 
                }
            }

            List<Character> sortedKeys = new ArrayList<>(map.keySet());
            Collections.sort(sortedKeys); // Sort the list of keys

            for (Character key : sortedKeys)
            {
                System.out.println(key + ": " + map.get(key));
            }

        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    /**
     * Clean the word by removing non-letter characters and converting to lowercase.
     */
    public static String clean(String s)
    {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r.append(c);
            }
        }
        return r.toString().toLowerCase();
    }
}
