/*
Implement FizzBuzz
 */

public class DCP0 {

    public void FizzBuzz(){
        for(int i = 1; i < 100; i++){
            String a = "";
            if (i%3 == 0){
                a = "Fizz";
            }
            else if (i%5 == 0){
                a = "Buzz";
            }
            else
                a = Integer.toString(i);
                System.out.println(a);

        }

    }

    public static void main(String[] args) {

        DCP0 test = new DCP0();
        test.FizzBuzz();

    }

}
