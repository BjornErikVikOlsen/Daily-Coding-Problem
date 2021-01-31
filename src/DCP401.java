/*
A permutation can be specified by an array P, where P[i] represents the location of the element at i in the permutation. For example, [2, 1, 0] represents the permutation
where elements at the index 0 and 2 are swapped.

Given an array and a permutation, apply the permutation to the array. For example, given the array ["a", "b", "c"] and the permutation [2, 1, 0], return ["c", "b", "a"].
 */
public class DCP401 {

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        int[] list = {2, 1, 0};
        DCP401 dcp401 = new DCP401();
        String[] newArr = dcp401.permutation(arr, list);
        dcp401.printList(newArr);

    }

    public String[] permutation(String[] arr, int[] list){
        if (arr.length != list.length){
            System.out.println("Arrays is not the same length.");
        }
        String[] newArr = arr;
        for (int i = 0; i <= arr.length -1; i++){
            newArr[list[i]] = arr[i];
            System.out.println(arr[i]);
        }
        return newArr;
    }

    public void printList(String[] arr){
        for (int i = 0; i <= arr.length -1 ; i++){
            System.out.println(arr[i]);
        }
    }
}
