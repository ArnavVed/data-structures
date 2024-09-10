import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        

        for(int i = 0; i < strings.size() / 2; i++) {
            String first = strings.get(i);
            String last = strings.get(strings.size() - 1 - i);

            strings.set(i, last);
            strings.set(strings.size() - 1 - i, first);
        }

    }
}