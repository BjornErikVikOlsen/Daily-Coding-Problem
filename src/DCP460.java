/*
You are given a string consisting of the letters x and y, such as xyxxxyxyy. In addition, you have an operation called flip, which changes a single x to y or vice versa.

Determine how many times you would need to apply this operation to ensure that all x's come before all y's. In the preceding example, it suffices to flip the second and sixth characters, so you should return 2.
 */
public class DCP460 {

    public static void main(String[] args) {

    }

    public char flip(char c){
        if (c != 'x' || c != 'y'){
            return 0;
        }
        if (c == 'x'){
            return 'y';
        }
        else if (c == 'y'){
            return 'x';
        }
        return 0;
    }


    public int timesToFlip(String s){

    return 0;
    }


}
