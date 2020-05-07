/*
This problem was asked by Microsoft.

Given an array of numbers and a number k, determine if there are three entries in the array which
add up to the specified number k. For example, given [20, 303, 3, 4, 25] and k = 49, return true
as 20 + 4 + 25 = 49.
 */
public class DCP339 {

    public static void main(String[] args) {

        int[] list = {20, 303, 3, 4, 25};
        int[] list2 = {20, 303, 3, 4, 24};
        System.out.println(addUp(49, list));

    }

    public static boolean addUp(int n, int[] list){

        for (int i = 0; i < list.length - 2; i++){
            for (int j = 1; j < list.length - 1; j++){
                for (int k = 2; k < list.length; k++){
                    if((list[i] + list[j] + list[k]) == n){
                        return true;
                    }
                }
            }
        }
        return false;
    }


}
