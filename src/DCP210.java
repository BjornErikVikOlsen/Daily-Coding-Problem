/*
A Collatz sequence in mathematics can be defined as follows. Starting with any positive integer:

    if n is even, the next number in the sequence is n / 2
    if n is odd, the next number in the sequence is 3n + 1

It is conjectured that every such sequence eventually reaches the number 1. Test this conjecture.

Bonus: What input n <= 1000000 gives the longest sequence?
 */

public class DCP210 {

    public static void main(String[] args) {
        DCP210 test = new DCP210();
        test.collatz(7);
    }

    public void collatz2(int n){

        int k = 0;
        if(n % 2 == 0){
            k = n /2;
        }
        else {
            k = 3 * n + 1;
        }
        System.out.println(k);
        collatz(k);
    }

    public void collatz(int n){

        System.out.println(n + " ");
        if (n == 1){
            return;
        }
        else if (n % 2 == 0) 
            collatz(n / 2);
        else
            collatz(3*n + 1);
    }
}
