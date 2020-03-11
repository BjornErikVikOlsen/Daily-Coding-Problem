/*

Given an array of integers, determine whether it contains a Pythagorean triplet.
Recall that a Pythogorean triplet (a, b, c) is defined by the equation a2+ b2= c2.
 */

public class DCP282 {

    public static void main(String[] args) {
        int [] arr = {3,4,5};

        DCP282 t = new DCP282();
        System.out.println(containsPythagoreanTriplet(arr));
    }

    public static boolean containsPythagoreanTriplet(int [] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                for (int k = 0; k < arr.length; k++){
                    if((arr[i] * arr[i]) + (arr[j]* arr[j]) == (arr[k]* arr[k])){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
