import java.util.Random;

/*
You have n fair coins and you flip them all at the same time. Any that come up tails you set aside. The ones that come up heads you flip again. How many rounds do you expect to play before only one coin remains?

Write a function that, given n, returns the number of rounds you'd expect to play until one coin remains.
 */
public class DCP598 {

    public static void main(String[] args) {
        DCP598 dcp598 = new DCP598();
        dcp598.flipCoins(10);
    }

    public void flipCoins(int n){
        Random random = new Random();
        int count = 0;

        for(int i = 0; i < n; i++){
            if(random.nextInt() > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
