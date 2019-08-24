import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DCP33 {

    public static void main(String[] args) {

        List arr = new ArrayList();
        DCP33 test = new DCP33();
        test.GetNumber(arr);


    }
    public void Median(List arr){

        int median = 0;
        //for(int numb : arr)

        System.out.println("Is this your number? " +);



    }

    public void GetNumber(List arr){
        Scanner findInt = new Scanner(System.in);
        System.out.println("Enter number");
        int k = findInt.nextInt();
        arr.add(k);
        Median(arr);
    }


}
