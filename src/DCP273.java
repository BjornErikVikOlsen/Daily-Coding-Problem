/*
A fixed point in an array is an element whose value is equal to its index. Given a sorted array of
distinct elements, return a fixed point, if one exists. Otherwise, return False.

For example, given [-6, 0, 2, 40], you should return 2. Given [1, 5, 7, 8], you should return False.
 */

public class DCP273 {

    public static void main(String[] args) {

        int [] arr = {-6, 0, 2, 40};
        int [] arr2 = {1, 5, 7, 8};

        DCP273 t = new DCP273();
        t.findFixedPoint(arr2);
    }

    public int findFixedPoint(int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(i == arr[i]){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
