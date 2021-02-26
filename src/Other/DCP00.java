package Other;

import java.util.ArrayList;
import java.util.Iterator;

public class DCP00 {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(4);
        arr.add(6);

        int [] arra = {2,4,6};

        Iterator it = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };

        DCP00 test = new DCP00();
        //test.PrintNum(arra, 5);
        //test.PrintNum2(arr, 5);
        test.PrintNum3(arr);
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

    public void PrintNum3(ArrayList<Integer> arr){

        while (arr.isEmpty()){
            System.out.println("h");
        }
    }
}
