/*
Given integers M and N, write a program that counts how many positive
integer pairs (a, b) satisfy the following conditions:

    a + b = M
    a XOR b = N

 */

public class DCP332 {

    public static void main(String[] args) {

        System.out.println(countPairs(5,5));

    }

    public static int countPairs(int a, int b){
        int count = 0;
        for (int i = 0; i < 100; i++){
            for (int j = 0; j < 100; j++){
                if ((i + j == a) && (i == b || j == b)){
                    count++;
                    System.out.println("i = " + i + " j = " + j);
                }
            }
        }
        System.out.println("Count = " + count);
        return count;
    }
}
