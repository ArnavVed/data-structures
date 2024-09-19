import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
    	
        // Complete this method. Use a Stack.
        Stack<String> Reverses = new Stack<>();
        

        while(scanner.hasNext()){
            Reverses.add(scanner.next());

        }
        System.out.println(Reverses);
        while(!Reverses.empty()){
            String temp1,temp2,temp3;



        }


        return "hi";
    }
}
