/*
Given a string, return the first recurring character in it, or null if there is no recurring character.

For example, given the string "acbbac", return "b". Given the string "abcdef", return null.
 */

import java.util.Scanner;

public class DCP159 {

    String word;

    public String getWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        word = scanner.toString();
        printString(word);
        return word;
    }

    public void printString(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        DCP159 test = new DCP159();
        test.getWord();
    }


}
