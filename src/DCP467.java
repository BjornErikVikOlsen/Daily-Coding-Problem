/*
Given a real number n, find the square root of n. For example, given n = 9, return 3
 */
public class DCP467 {

    public static void main(String[] args) {

        DCP467 dcp467 = new DCP467();
        System.out.println(dcp467.sqrt(9));

    }

    public int sqrt(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        int i = 1;
        int result = 1;

        while (result <= n){
            i++;
            result = i * i;
        }
        return i - 1;
    }
}
