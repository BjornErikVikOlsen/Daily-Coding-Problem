/*
Given an integer list where each number represents the number of hops you can make, determine whether you can reach to the last index starting at index 0.

For example, [2, 0, 1, 0] returns True while [1, 1, 0, 1] returns False.
 */

public class DCP565 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1};
        System.out.println(canReachEnd(arr));
    }

    public static boolean canReachEnd(int[] arr){
        int max = 0;
        for(int i=0; i < arr.length; i++){
            if (i > max) {
                return false;
            }
            max = Math.max(arr[i] + i, max);
        }
        return true;
    }

}
