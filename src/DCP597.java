import java.util.Arrays;
import java.util.List;

/*
Given an array of integers, determine whether it contains a Pythagorean triplet. Recall that a Pythogorean triplet (a, b, c) is defined by the equation a2+ b2= c2.
 */
public class DCP597 {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 1, 4, 6, 5);

        DCP597 dcp597 = new DCP597();
        System.out.println(dcp597.containsPythagoreanTriplets(arr));
    }

    public boolean containsPythagoreanTriplets(List<Integer> arr){
        for (int i = 0; i < arr.size(); i ++){
            for (int j = 0; j < arr.size(); j++){
                for (int k = 0; k < arr.size(); k++){
                    int a = arr.get(i) * arr.get(i), b = arr.get(j) * arr.get(j), c = arr.get(k) * arr.get(k);
                    if (a == b + c || b == a + c || c == a + b){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
