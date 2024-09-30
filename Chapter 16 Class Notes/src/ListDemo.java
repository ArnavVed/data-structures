/**
 *   A program that demonstrates the LinkedList class
 */
public class ListDemo
{
    public static void main(String[] args)
    {

        LinkedList Students = new LinkedList();

        Students.addFirst("Arthur");
        Students.addFirst("john");
        Students.addFirst("shartier");
        Students.addFirst("Peopel");

        System.out.println(Students);
    }
}
