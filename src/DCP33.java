import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DCP33 {

    public static void main(String[] args) {

        List <Double> arr = new ArrayList<>();
        arr.add(1.0);
        arr.add(5.0);
        DCP33 test = new DCP33();
        test.GetNumber(arr);

    }


    public void GetNumber(List<Double> arr){
        Scanner findNumber = new Scanner(System.in);
        System.out.println("Enter number");
        //int k = findNumber.nextInt();
        arr.add(findNumber.nextDouble());
        FindSum(arr);
    }

    public double FindSum(List<Double> arr){

        double median;
        double sum = 0.0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);

        }
        Median(arr, sum);
        return sum;
    }

    public void Median(List <Double> arr, Double sum){
        int ListSize = arr.size();
        double DListSize = ListSize;
        double median = 0.0;
        median = sum/ListSize;

        System.out.println(median);
        GetNumber(arr);

    }


}
