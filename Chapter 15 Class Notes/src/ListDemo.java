import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        /*The add last method to populate a list */      
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony" );
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Gamora");

        System.out.println(staff);
        
        
        /*
         * List iterator method creates a new list iterator 
         * that is positioned at the head of the list 
         */

         ListIterator<String> iterator = staff.listIterator();
         iterator.next();
         
         
         /*The next method also returns the  */

         String avenger = iterator.next();
         System.out.println(avenger);


         /* The add method for iterators inserts an element at the iterator position.
         * The iterator is then postioned after the element that was added.
         */
        iterator.add("steve"); // DHJ|RT
        iterator.add("clint"); // DHJN|RT

        /* The remove method removes the element returned by the last call to 
         * next or previous.
         * The remove method can ONLY be called once after calling next or previous.
         * The remove method CANNOT be called after calling add.
         */
        iterator.next(); // DHJNR|T
        iterator.remove(); // DHJN|T

        System.out.println(staff);

        /* The set method updates the element returned by the last call to
         * next or previous.
         */
        iterator.previous(); // DHJ|NT
        iterator.set("Albert"); // DHJ|AT

        /* The hasNext method returns true if the list has another element.
         * It is often used in the condition of a while loop.
         */

         iterator = staff.listIterator();

         while (iterator.hasNext()){
            String n = iterator.next();
            if (n.equals("Natasha")){
                iterator.remove();
            }
         }

         for (String n: staff) {
            System.out.print(n + " ");
        }

        while (iterator.hasNext()){
            if (n.equals("Tony")){
                staff.remove("Tony");
            }
        }
    }

}

[[[1,2,3,4,5],[6,7,8,9,5]],
 [[1,2,3,4,5],[6,7,8,9,5]
]]