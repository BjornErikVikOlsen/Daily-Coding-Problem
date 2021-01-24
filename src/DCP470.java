import java.util.Arrays;
import java.util.List;

/*
Given an array of numbers and an index i, return the index of the nearest larger number of the number at index i, where distance is measured in array indices.

For example, given [4, 1, 3, 5, 6] and index 0, you should return 3.

If two distances to larger numbers are the equal, then return any one of them. If the array at i doesn't have a nearest larger integer, then return null.

Follow-up: If you can preprocess the array, can you do this in constant time?
 */
public class DCP470 {

    public static void main(String[] args) {
        DCP470 dcp470 = new DCP470();

        List<Integer> arr = Arrays.asList(4, 1, 3, 5, 6);
        System.out.println(dcp470.indexOfNearestLargerNum(arr, 0));

    }

    public int indexOfNearestLargerNum(List<Integer> arr, int i){

        if (arr.size() < 1){
            return 0;
        }

        int start = arr.get(i);
        int num = arr.get(i);
        for(int j = i; j < arr.size(); j++){
            if (arr.get(j) > num){
                return arr.indexOf(arr.get(j));
            }
        }
        for (int k = i; k > 0; k--){
            if (arr.get(k) > num){
                return arr.indexOf(arr.get(k));
            }
        }
        return 0;
    }
}
