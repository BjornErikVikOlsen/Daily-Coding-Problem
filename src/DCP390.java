import java.util.ArrayList;
import java.util.Random;

/*
You are given an unsorted list of 999,000 unique integers, each from 1 and 1,000,000. Find the missing 1000 numbers. What is the computational and space complexity of your solution?
 */
public class DCP390 {

    public static void main(String[] args) {
        DCP390 dcp390 = new DCP390();
        ArrayList arr = dcp390.generateList(1000000);
        dcp390.findMissingIntegers(arr);

    }

    public ArrayList generateList(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= num; i++){
            arr.add(i);
        }
        Random random = new Random();
        for (int j = 0; j <= 1000; j++){
            arr.remove(random.nextInt(1000));
        }
        System.out.println(arr.size());

        return arr;
    }

    public int findMissingIntegers(ArrayList arr){
        ArrayList newArr = new ArrayList();
        for (int i = 0; i <= arr.size(); i++){
            if (!arr.contains(i)){
                newArr.add(i);
            }
        }
        System.out.println(newArr.size());
        return newArr.size();
    }
}
