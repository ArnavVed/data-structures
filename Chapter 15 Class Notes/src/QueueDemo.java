import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        //Create a print queue of strings using a linked list
        Queue<String> jobs = new LinkedList<>();

        //add some print jobs

        jobs.add("Joes Quarter 2 expense report");
        jobs.add("sallays secret mnecraft world");
        
        System.out.println("Printing: " + jobs.remove());

        jobs.add("Kathy really top secret document");
        jobs.add("Joes grocery list");
        jobs.add("Kathy: Can I get fired for this");

        System.out.println("Printing: " + jobs.remove());

        jobs.add("Boss: kathys termination letter");

        while (jobs.size() > 0){
            System.out.println("Printing: " + jobs.remove());
        }
    }
}
