import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DCP1 {


        public boolean checkForTargetSum(int[] arr, int targetSum) {
            Set<Integer> set = new HashSet<>();

            for (int num : arr) {
                if (set.contains(targetSum-num)) {
                    return true;

                }

                set.add(num);
            }
            return false;

        }

    public static void main(String[] args){
        int[] arr = {10,15,3,7};

        DCP1 test = new DCP1();
        test.checkForTargetSum(arr, 17);
    }
}



