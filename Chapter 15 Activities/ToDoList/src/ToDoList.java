import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
/**
 * Implement a to do list. Tasks have a priority between 
 * 1 and 9 (with 1 being most urgent), and a description.
 * When the user enters the command 'add priority description', 
 * the program adds a new task. When the user enters next, 
 * the program removes and prints the most urgent task. 
 * The quit command quits the program. 
 * Use a priority queue in your solution.
*/
public class ToDoList 
{
    // Instance variable(s)
   
    Queue<Task> TaskList;
    /**
     * Constructor
    */
    public ToDoList()
    {
        // Complete this
        TaskList = new PriorityQueue<>();
        
    }
    /**
     * Display a menu and accepts commands.
     */
    public void run()
    {
        String option = "";
        System.out.println("To Do List - Please enter an option");
        System.out.println("     add priority description (add a new task)");
        System.out.println("     next (remove and print most urgent task)");
        System.out.println("     quit (exit this program)");
        System.out.println();
        
        Scanner in = new Scanner(System.in);
        
        do
        {
            System.out.print("> ");
            option = in.nextLine();
            if (option.startsWith("add"))
            {
                addTask(option);
            } else if (option.equals("next"))
            {
                nextTask();
            }
        } 
        while (! option.equals("quit"));
    }
    
    /**
     * Parse the add option line.
     *
     * @param optionStr the option line
    */
    public void addTask(String optionStr)
    {
        // Complete this method
        try {
            String[] parts = optionStr.split(" ", 3);
            if (parts.length < 3) {
                throw new IllegalArgumentException("Invalid command format.");
            }
            int priority = Integer.parseInt(parts[1]);
            if (priority < 1 || priority > 9) {
                throw new IllegalArgumentException("The priority must be an integer between 1 and 9.");
            }
            String description = parts[2];
            TaskList.add(new Task(priority, description));
            System.out.println("Task added: " + description);
        } catch (NumberFormatException e) {
            System.out.println("The priority must be an integer between 1 and 9.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
            
            
    }

    /**
     * Get the next highest priority task and
     * display the description to the user.
    */
    public void nextTask()
    {
       
        
        // Complete this method
        
        
        
        if (TaskList.isEmpty())
        {
            System.out.println("There are no tasks in the list.");
        } else
        {
            Task next = TaskList.poll();
            System.out.println(next.getDescription());
        }
    }
}
