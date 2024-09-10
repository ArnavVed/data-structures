import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * A program that implements the sieve of Eratosthenes.
 */
public class Sieve {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        in.close();

        // Initialize the ArrayList with all numbers from 2 to n
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            primes.add(i);
        }

        // Sieve of Eratosthenes algorithm
        for (int i = 2; i * i <= n; i++) {
            Iterator<Integer> val = primes.iterator();
            while (val.hasNext()) {
                int num = val.next();
                if (num != i && num % i == 0) {
                    val.remove();  // Remove multiples of i
                }
            }
        }

        // Print the remaining numbers in the list, which are primes
        System.out.println("Primes up to " + n + ": " + primes);
    }
}
