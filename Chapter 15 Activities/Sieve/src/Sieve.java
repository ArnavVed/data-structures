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

        // adds # to the list
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            primes.add(i);
        }

    
        for (int i = 2; i * i <= n; i++) {
            Iterator<Integer> val = primes.iterator();
            while (val.hasNext()) {
                int num = val.next();
                if (num != i && num % i == 0) {
                    val.remove();  
                }
            }
        }

    
        System.out.println(primes);
    }
}
