/*
The Sieve of Eratosthenes is an algorithm used to generate all prime numbers smaller than N.
The method is to take increasingly larger prime numbers, and mark their multiples as composite.

For example, to find all primes less than 100, we would first mark [4, 6, 8, ...] (multiples of two),
then [6, 9, 12, ...] (multiples of three), and so on. Once we have done this for all primes less than N,
the unmarked numbers that remain will be prime.

Implement this algorithm.

Bonus: Create a generator that produces primes indefinitely (that is, without taking N as an input).
 */

import java.util.ArrayList;
import java.util.List;

public class DCP244 {

    public static void main(String[] args) {
        int n = 100;
        //System.out.println(sieve(100));
        //System.out.println(count(100));
        DCP244 a = new DCP244();
        a.sieveOfEratosthenes(100);
    }

    public void sieveOfEratosthenes(int n)
    {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }

    public static int sieve(int n){

        for(int i = 0; i <= n; i++){

        }
        return 0;
    }

    public static int count(int n){
        List <Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            arr.add(i);

        }

        return 0;
    }

    public void view(){

    }

}
