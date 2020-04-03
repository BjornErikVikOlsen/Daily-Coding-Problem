/*

On a mysterious island there are creatures known as Quxes which come in three colors: red, green, and blue.
One power of the Qux is that if two of them are standing next to each other, they can transform into a single
creature of the third color.

Given N Quxes standing in a line, determine the smallest number of them remaining after any possible sequence
of such transformations.

For example, given the input ['R', 'G', 'B', 'G', 'B'], it is possible to end up with a single Qux through
the following steps:

        Arrangement       |   Change
----------------------------------------
['R', 'G', 'B', 'G', 'B'] | (R, G) -> B
['B', 'B', 'G', 'B']      | (B, G) -> R
['B', 'R', 'B']           | (R, B) -> G
['B', 'G']                | (B, G) -> R
['R']                     |

 */

public class DCP290 {

    public static void main(String[] args) {

        char[] arr = {'R', 'G', 'B', 'G', 'G'};
        System.out.println(calc(arr));

    }

    public static void calculateQuxes(char[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++ ){
                if(arr[j] == arr[j + 1]){

                }
            }
            
        }
    }

    public static int calc(char[] arr){
        int red = 0;
        int green = 0;
        int blue = 0;

        for(char c : arr){

            switch (c){

                case 'R':
                    red++;
                    break;

                case 'G':
                    green++;
                    break;

                case 'B':
                    blue++;
                    break;

            }
        }
        if(red == arr.length || green == arr.length || blue == arr.length){
            return arr.length;
        }

        if(red % 2 == green % 2 && red % 2 == blue % 2){
            return 2;
        }
        return 1;
    }


}
