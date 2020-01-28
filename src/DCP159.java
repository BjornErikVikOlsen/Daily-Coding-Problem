/*
Given a string, return the first recurring character in it, or null if there is no recurring character.

For example, given the string "acbbac", return "b". Given the string "abcdef", return null.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DCP159 {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        DCP159 test = new DCP159();
        test.getWord(arr);
    }

    public void getWord(List<String> arr){
        Scanner getWord = new Scanner(System.in);
        System.out.println("Enter word:");
        //add word to array

        String word = getWord.nextLine();
        //arr.add(getWord.nextLine());
        //printString(arr);
        findRecurringCharacter(word);
    }

    public void printString(List <String> arr){

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }

    public char findRecurringCharacter(String word) {

        HashSet<Character> h = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);

            if (h.contains(temp))
                return temp;

            else
                h.add(temp);

        }

        return '\0';
    }

}
