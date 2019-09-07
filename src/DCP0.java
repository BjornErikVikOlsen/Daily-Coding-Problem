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
            if (i % 5 == 0){
                a += "Buzz";
            }
            if (a == ""){
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
            if(i % 3 == 0){
                System.out.println("Fizz");
            }
            if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }
    }

    public void FizzBuzz3(){
        
    }

    public static void main(String[] args) {

        DCP0 test = new DCP0();
        test.FizzBuzz2();

    }

}
