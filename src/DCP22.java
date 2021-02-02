/*
Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list. If there is more than one possible reconstruction,
return any of them. If there is no possible reconstruction, then return null.

For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].

Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].

 */
public class DCP22 {

    public static void main(String[] args) {
        String s = "thequickbrownfox";
        String[] arr = {"the", "quick", "brown", "fox"};
        DCP22 dcp22 = new DCP22();
        System.out.println(dcp22.returnWords(s, arr));

    }

    public String[] returnWords(String s, String[] arr){

        return arr;
    }
}
