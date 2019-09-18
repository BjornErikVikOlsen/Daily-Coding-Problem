import java.util.ArrayList;
import java.util.List;

public class DCP00 {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(4);
        arr.add(6);

        int [] arra = {2,4,6};

        DCP00 test = new DCP00();
        //test.PrintNum(arra, 5);
        test.PrintNum2(arr, 5);
    }

    public void PrintNum(int [] arra, int k){

        for(Integer num : arra){
            if (num < k){
                System.out.println(num);
            }
        }

    }

    public void PrintNum2(ArrayList<Integer> arr, int k){
        for(int i = 0; i < arr.size(); i++){

            int l = arr.get(i);
            if(l < k){
                System.out.println(l);
            }
        }
    }
}
