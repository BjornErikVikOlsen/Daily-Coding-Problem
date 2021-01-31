import java.util.ArrayList;

/*
Given a array of numbers representing the stock prices of a company in chronological order,
write a function that calculates the maximum profit you could have made from buying and selling
that stock once. You must buy before you can sell it.

For example, given [9, 11, 8, 5, 7, 10], you should return 5,
since you could buy the stock at 5 dollars and sell it at 10 dollars.
 */

public class DCP47 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList();

        arr.add(9);
        arr.add(11);
        arr.add(8);
        arr.add(5);
        arr.add(7);
        arr.add(10);

        DCP47 dcp47 = new DCP47();
        dcp47.CalcMaxProf(arr);

    }

    public int CalcMaxProf(ArrayList <Integer> arr){
        int max = 0;
        for(int i = 0; i < arr.size(); i++){
            for (int j = 1; j < arr.size(); j++){
                if (arr.get(j) > arr.get(i)){
                    if ((arr.get(j) - arr.get(i)) > max){
                        max = (arr.get(j) - arr.get(i));
                    }
                }
            }
        }
        System.out.println(max);
        return max;
    }

}
