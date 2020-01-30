/*
Given a string, return the first recurring character in it, or null if there is no recurring character.

For example, given the string "acbbac", return "b". Given the string "abcdef", return null.
 */

import java.util.*;

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

    public Character findRecurringCharacter(String word) {

        Set<Character> recurringChars = new HashSet<>();
        for (char character : word.toCharArray()) {
            if (!recurringChars.add(character)) { // add will return false if character is
                // already in the Set
                return character; // return the first recurring character
            }
        }
        return null; // no recurring characters
    }

}
