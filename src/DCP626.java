import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of integers, return the largest product that can be made by multiplying any three integers.

For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.

You can assume the list has at least three integers.
 */
public class DCP626 {

    public static void main(String[] args) {

        DCP626 dcp626 = new DCP626();
        List<Integer> arr = Arrays.asList(-10, -10, 5, 2);
        System.out.print(dcp626.returnLargestProduct(arr));
    }

    public int returnLargestProduct(List<Integer> arr){
        int max = 0;
        for (int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.size(); j++){
                for (int k = 0; k < arr.size(); k++){
                    int num = (arr.get(i) * arr.get(j) * arr.get(k));
                    if (num > max){
                        max = num;
                    }
                }
            }
        }
        return max;
    }


}
