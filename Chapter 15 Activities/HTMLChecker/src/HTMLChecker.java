import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "/Users/arnavvedavyas/Desktop/data-structures/Chapter 15 Activities/HTMLChecker/src/TagSample3.html";

        try (Scanner in = new Scanner(new File(filename)))
        {
            // Your code goes here
            Stack<String> stack = new Stack<>();
            boolean isValid = true;

            // Read each tag from the file
            while (in.hasNext()) {
                String tag = in.next();

                // Check if the tag is an opening tag
                if (tag.startsWith("<") && !tag.startsWith("</")) {
                    stack.push(tag); // Push opening tags onto the stack
                } 
                // Check if the tag is a closing tag
                else if (tag.startsWith("</")) {
                    // Check if there is a matching opening tag on top of the stack
                    if (!stack.isEmpty() && stack.peek().equals("<" + tag.substring(2))) {
                        stack.pop(); // Pop the matching opening tag
                    } else {
                        isValid = false; // No matching opening tag
                        break;
                    }
                }
            }

            // Check if there are any unclosed tags left in the stack
            if (!stack.isEmpty()) {
                isValid = false;
            }

            // Output the result
            if (isValid) {
                System.out.println("The HTML tags are properly nested.");
            } else {
                System.out.println("The HTML tags are not properly nested.");
            }


        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }

    }
}
