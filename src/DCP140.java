/*
Given an array of integers in which two elements appear exactly once and all other elements appear exactly twice,
find the two elements that appear only once.

For example, given the array [2, 4, 6, 8, 10, 2, 6, 10], return 4 and 8. The order does not matter.

Follow-up: Can you do this in linear time and constant space?
 */

import java.util.List;

public class DCP140 {


    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 2, 6, 10};

        DCP140 t = new DCP140();
        t.findTwoElements(arr);
    }


    private void findTwoElements(int[] arr){

        for(int i = 0; i < arr.length; i++){
            boolean twoElements = false;
            int tmp = 0;
            for(int j = 0; j < arr.length; j++){
                tmp = arr[i];
                if (tmp == arr[j]){
                    System.out.println("none");
                }

            }
        }
        
    }

}
