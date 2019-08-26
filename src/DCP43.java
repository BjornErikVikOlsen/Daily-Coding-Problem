import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DCP43 {




    public void push(int val, Stack <Integer> arr){
        arr.push(val);

    }

    public void pop(int val, Stack <Integer> arr){
        arr.pop();
    }

    public void max(int val, Stack <Integer> arr){
        int maxValue = 0;

        for(int i = 0; i < arr.size(); i++){
            
        }

    }

    public void GetNumber(Stack <Integer> arr){
        Scanner findNumber = new Scanner(System.in);
        System.out.println("Enter number");
        arr.add(findNumber.nextInt());
    }

    public static void main(String[] args) {
        Stack <Integer> arr = new Stack();

        DCP43 test = new DCP43();
        test.GetNumber(arr);
    }
}
