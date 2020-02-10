/*
In academia, the h-index is a metric used to calculate the impact of a researcher's papers. It is calculated as follows:

A researcher has index h if at least h of her N papers have h citations each. If there are multiple h satisfying this formula, the maximum is chosen.

For example, suppose N = 5, and the respective citations of each paper are [4, 3, 0, 1, 5]. Then the h-index would be 3, since the researcher has 3 papers with at least 3 citations.

Given a list of paper citations of a researcher, calculate their h-index.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DCP241 {

    public static void main(String[] args) {

        int [] arr = {4, 3, 0, 1, 5};

        DCP241 test = new DCP241();
        test.hIndex(arr);

    }

    public int hIndex(int [] arr){

        Arrays.sort(arr);

        int result = 0;
        for(int i =arr.length-1; i >= 0; i--){
            int cnt = arr.length-i;
            if(arr[i] >= cnt){
                result = cnt;
            }else{
                break;
            }
        }
        System.out.println(result);
        return result;
    }

}
