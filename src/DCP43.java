import java.util.Scanner;
import java.util.Stack;

/*
Implement a stack that has the following methods:

    push(val), which pushes an element onto the stack
    pop(), which pops off and returns the topmost element of the stack.
    If there are no elements in the stack, then it should throw an error or return null.
    max(), which returns the maximum value in the stack currently.
    If there are no elements in the stack, then it should throw an error or return null.

Each method should run in constant time.
 */

public class DCP43 {

    public void push(int val, Stack <Integer> arr){
        arr.push(val);
    }

    public int pop(Stack <Integer> arr){
        return arr.pop();
    }

    public void max(int val, Stack <Integer> arr){
        int maxValue = arr.pop();

        for(int i = 0; i < arr.size(); i++){
            int k = arr.pop();
            if (k < maxValue){
                maxValue = k;
            }
        }
    }

    public void GetNumber(Stack <Integer> arr){
        Scanner findNumber = new Scanner(System.in);
        System.out.println("Enter number");
        arr.add(findNumber.nextInt());

    }

    public void PrintStack(Stack <Integer> arr){
        while(!arr.isEmpty()){
            System.err.println(arr.pop());
        }
    }

    public void PrintStack2(Stack <Integer> arr){

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.pop());
        }
    }

    public void PrintStack3(Stack <Integer> arr){
        for(int i : arr){
            System.out.println(arr.pop());
        }
    }

    public static void main(String[] args) {
        Stack <Integer> arr = new Stack();

        arr.add(9);
        arr.add(5);
        arr.add(3);
        arr.add(8);
        arr.add(4);

        DCP43 test = new DCP43();
        test.PrintStack3(arr);

    }
}
