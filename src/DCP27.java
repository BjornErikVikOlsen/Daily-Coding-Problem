import java.util.Stack;

/*
Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false.
 */
public class DCP27 {

    public static void main(String[] args) {

        String s = "([])[]({})";
        String s1 = "([)]";

        DCP27 dcp27 = new DCP27();

        System.out.println(dcp27.isBracketsBalanced(s1));

    }

    public boolean isBracketsBalanced(String s){

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if (a == '(' || a == '[' || a == '{'){
                stack.push(a);
                continue;
            }

            if (stack.isEmpty()){
                return false;
            }

            char check;
            switch (a){
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
