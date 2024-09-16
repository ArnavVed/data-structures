import java.util.*;
import java.io.*;

/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 * Modify Worked Example 15.1.
 */
public class StringLengthMap
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename = "Chapter 15 Activities//StringLengthMap//src//test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Create a map with word length as the key and comma-separated strings as values
            Map<Integer, String> map = new HashMap<>();

            while (in.hasNext())
            {
                String word = clean(in.next());
                Integer len = word.length();

                // Update the map without using merge()
                if (map.containsKey(len)) {
                    // If the key already exists, append the word to the existing string
                    String existingWords = map.get(len);
                    map.put(len, existingWords + ", " + word);
                } else {
                    // If the key doesn't exist, create a new entry
                    map.put(len, word);
                }
            }

            // Sort the map by the length of the words (keys)
            List<Integer> sortedKeys = new ArrayList<>(map.keySet());
            Collections.sort(sortedKeys);

            // Print the map in the format: length: word1, word2, word3
            for (Integer key : sortedKeys)
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
