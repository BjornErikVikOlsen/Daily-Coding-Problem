/*
Implement integer division without using the division operator. Your function should return a tuple of (dividend, remainder) and it should take two numbers, the product and divisor.

For example, calling divide(10, 3) should return (3, 1) since the divisor is 3 and the remainder is 1.

Bonus: Can you do it in O(log n) time?
 */
public class DCP380 {

    public static void main(String[] args) {
        DCP380 dcp380 = new DCP380();
        dcp380.divide(10, 3);

    }

    public void divide(int product, int divisor){

        if (divisor == 0){
            System.out.println("Cannot divide by 0");
        }
        int count = 1;
        int i = divisor;
        while (i <= product){
            count++;
            i += i;
        }
        System.out.println("Divisor is " + count + " and remainder is " + (product - (count * divisor)));
    }
}
