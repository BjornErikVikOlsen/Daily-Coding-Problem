/*
Implement the function fib(n), which returns the nth number in the Fibonacci sequence, using only O(1) space.
 */
public class DCP451 {

    public static void main(String[] args) {
        DCP451 dcp451 = new DCP451();
        System.out.println(dcp451.fib(9));
    }

    public int fib(int n){
        if (n <= 1){
            return n;
        }
    return fib(n - 1) + fib(n - 2);
    }
}
