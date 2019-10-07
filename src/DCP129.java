/*
Given a real number n, find the square root of n. For example, given n = 9, return 3.
 */


public class DCP129 {

    public void sq(int n) {
        double k = 0;
        k = Math.sqrt(n);

        System.out.println(k);
    }

    public static void main(String[] args) {
        DCP129 test = new DCP129();
        test.sq(9);
    }
}


