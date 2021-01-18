/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
 */

public class DCP560 {

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        DCP560 dcp560 = new DCP560();
        System.out.println(dcp560.doesItAddUp(arr, 19));
    }

    public boolean doesItAddUp(int[] arr, int k){

        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr.length - 1; j++){
                int num = arr[i];
                if(arr[i] + arr[j] == k){
                    return true;
                }
            }
        }
        return false;
    }


}
