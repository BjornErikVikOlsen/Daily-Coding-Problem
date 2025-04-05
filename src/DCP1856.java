public class DCP1856 {

    static int count = 0;
    public static void main(String[] args) {

        DCP1856 dcp1856 = new DCP1856();
        dcp1856.collatzSequence(1000000);

    }

    public void collatzSequence(float num){

        if (num == 1){
            System.out.println("Number is 1. Count is " + count);
        } else if ((num % 2) == 0){
            count++;
            collatzSequence(num/2);
        } else {
            count++;
            float newNum = (3 * num) + 1;
            collatzSequence(newNum);
        }
    }
}
