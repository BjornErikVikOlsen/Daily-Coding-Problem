/*
Write a function that takes a natural number as input and returns the number of digits the input has.
 */

public class DCP372 {

    public static void main(String[] args) {
        DCP372 dcp372 = new DCP372();
        System.out.println(dcp372.numberOfDigits2(370));
    }

    public int numberOfDigits(int num){
        int count = 0;

        if(num == 0){
            return 1;
        }
        while (num != 0){
            num = num/10;
            count++;
        }
        return count;
    }


    public int numberOfDigits2(int num){
        if(num == 0){
            return 1;
        } else {
            return (int) Math.floor(Math.log10(num)) + 1;
        }

    }
}
