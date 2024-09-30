import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //We will create a task list
        //The workorder class has a priority and description

        Queue<WorkOrder> toDO = new PriorityQueue<>();

        toDO.add(new WorkOrder(3, "Do galaxy gas"));
        toDO.add(new WorkOrder(3, "Study for test"));
        toDO.add(new WorkOrder(1, "conquer world"));
        toDO.add(new WorkOrder(2, "Call little t man"));
        
        while(toDO.size() > 0){
            System.out.println(toDO.remove());
        }
    }
}
