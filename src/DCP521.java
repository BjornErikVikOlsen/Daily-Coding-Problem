import java.util.Arrays;

/*
Given a string and a number of lines k, print the string in zigzag form. In zigzag, characters are printed out diagonally from top left to bottom right until reaching the kth line, then back up to top right, and so on.

For example, given the sentence "thisisazigzag" and k = 4, you should print:
 */
public class DCP521 {

    public static void main(String[] args) {
        String word = "THISISATEST";
        DCP521 dcp521 = new DCP521();
        dcp521.printZigZag(word, 3);
    }

    public void printZigZag(String word, int num){

        if (num == 1){
            System.out.println(word);
            return;
        }

        char[] word1 = word.toCharArray();

        int length = word.length();

        String[] arr = new String[num];
        Arrays.fill(arr, "");

        int row = 0;
        boolean down = true;

        for (int i = 0; i < length; i++){
            arr[row] += (word1[i]);

            if (row == num - 1){
                down = false;
            }
            else if (row == 0){
                down = true;
            }
            if (down){
                row++;
            }
            else {
                row--;
            }
        }

        for (int i = 0; i < num; i++){
            System.out.print(arr[i]);
        }
    }
}
