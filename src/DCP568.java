/*
Given a sorted list of integers, square the elements and give the output in sorted order.

For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].
 */

import java.util.Arrays;

public class DCP568 {

    public static void main(String[] args) {
        int[] arr = {-9, -2, 0, 2, 3};
        DCP568 dcp568 = new DCP568();
        dcp568.squareElement(arr);
        dcp568.sortList(arr);
    }

    public int[] squareElement(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int num = arr[i];
            num = Math.multiplyExact(num, num);
            arr[i] = num;
        }
        return arr;
    }

    public void sortList(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }

}
