/*
Given a number in Roman numeral format, convert it to decimal.

The values of Roman numerals are as follows:

{
    'M': 1000,
    'D': 500,
    'C': 100,
    'L': 50,
    'X': 10,
    'V': 5,
    'I': 1
}

In addition, note that the Roman numeral system uses subtractive notation for numbers such as IV and XL.

For the input XIV, for instance, you should return 14.
 */

import java.util.ArrayList;
import java.util.List;

public class DCP216 {

    public static void main(String[] args) {

        //List<Character> charList = new ArrayList<>();
        //List<Integer> intList = new ArrayList<>();
        Character[] charList = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        Integer[] intList = {1000, 500, 100, 50, 10, 5, 1};


    }

    public String reverse(String input) {

        if (input == null) {
            return input;
        }

        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }

        return output;
    }


    public int romNum(String output){


        for (Character c : output.toCharArray()) {


        }
        return 0;
    }
}
