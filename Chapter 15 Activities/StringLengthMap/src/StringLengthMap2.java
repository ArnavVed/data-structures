import java.util.*;
import java.io.*;

/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 */
public class StringLengthMap2
{
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "Chapter 15 Activities//StringLengthMap//src//test1.txt";

        try (Scanner in = new Scanner(new File(filename))) {
            Map<Integer, Set<String>> map = new HashMap<>();

            while (in.hasNext()) {
                String word = clean(in.next());
                Integer len = word.length();

                // Use merge with a Set to prevent duplicates
                map.merge(len, new HashSet<>(Arrays.asList(word)), (existingWords, newWordSet) -> {
                    existingWords.addAll(newWordSet);
                    return existingWords;
                });
            }

            // Sort the map by the length of the words (keys)
            List<Integer> sortedKeys = new ArrayList<>(map.keySet());
            Collections.sort(sortedKeys);

            // Print the map in the format: length: word1, word2, word3
            for (Integer key : sortedKeys) {
                System.out.println(key + ": " + String.join(", ", map.get(key)));
            }

        } catch (FileNotFoundException e) {
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
