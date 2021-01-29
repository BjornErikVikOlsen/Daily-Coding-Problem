/*
Implement FizzBuzz
 */

public class DCP0 {

    public void fizzBuzz(){
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

    public void fizzBuzz2(){
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

    public void fizzBuzz3(){
        for(int i = 1; i<100; i++){
            if (i % 3 == 0){
                System.out.print("Fizz");
            }
            else if (i % 5 == 0){
                System.out.print("Buzz");
            }
            else {
                System.out.print(i);
            }
        }
    }

    public void fizzBuzz4(){
        int i = 0;
        while (i < 100){
            if(i % 3 == 0 && i % 5 == 0){
                i++;
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                i++;
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                i++;
                System.out.println("Buzz");
            }
            else
                i++;
                System.out.println(i);
        }
    }

    public static void main(String[] args) {

        DCP0 test = new DCP0();
//        test.fizzBuzz2();
//        test.fizzBuzz();
//        test.fizzBuzz3();
        test.fizzBuzz4();


    }

}
