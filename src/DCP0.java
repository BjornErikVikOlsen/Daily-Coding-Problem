/*
Implement FizzBuzz
 */

public class DCP0 {

    public void FizzBuzz(){
        for(int i = 1; i < 100; i++){
            String a = "";
            if (i % 3 == 0){
                a += "Fizz";
            }
            else if (i % 5 == 0){
                a += "Buzz";
            }
            else if (a == ""){
                a = Integer.toString(i);
            }
            System.out.println(a);
        }

    }

    public void FizzBuzz2(){
        for(int i = 1; i<100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }
    }

    public void FizzBuzz3(){
        for(int i = 1; i<100; i++){

        }
    }

    public static void main(String[] args) {

        DCP0 test = new DCP0();
        test.FizzBuzz2();

    }

}
