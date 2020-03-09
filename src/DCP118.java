/*
Given a sorted list of integers, square the elements and give the output in sorted order.

For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].

 */

import java.util.ArrayList;
import java.util.List;

public class DCP118 {
    public static void main(String[] args) {

        int[] arr = {-9, -2, 0, 2, 3};

        DCP118 t = new DCP118();
        t.SquareElem(arr, 5);

    }

    public static void SquareElem(int [] arr, int arrLength){
        int [] squaredArr = new int [arrLength];
        for(int i = 0; i < arr.length; i++){
            int tmp = arr[i];
            squaredArr [i] = tmp*tmp;
            System.out.println(tmp*tmp);
        }
        SortList(squaredArr);
    }

    public static void SortList(int [] squaredArr){
        int n = squaredArr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (squaredArr[j] > squaredArr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = squaredArr[j];
                    squaredArr[j] = squaredArr[j+1];
                    squaredArr[j+1] = temp;
                }

    PrintList(squaredArr);
    }

    public static void PrintList(int [] squaredArr){
        System.out.println("=======================");
        for (int i = 0; i < squaredArr.length; i++){
            System.out.println(squaredArr[i]);
        }
    }


}
