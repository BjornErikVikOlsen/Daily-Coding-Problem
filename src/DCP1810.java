import java.util.ArrayList;
import java.util.Arrays;

public class DCP1810 {

    public static void main(String[] args) {

        DCP1810 dcp1810 = new DCP1810();
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(20, 303, 3, 4, 25));
        dcp1810.isTrue(49,list);
    }

    public boolean isTrue(int kn, ArrayList<Integer> list){

        for (int i = 0; i <= list.size(); i++){
            int x = list.get(i);

            for (int j = 1; j <= list.size() - 1; j++){
                int y = list.get(j);

                for (int k = 2; k <= list.size() - 2; k++){
                    int z = list.get(k);

                    int a = x + y + z;
                    if (a == kn){
                        System.out.println("Yay");
                        return true;
                    }
                }
            }
        }
        System.out.println("Oh no");
        return false;
    }
}
