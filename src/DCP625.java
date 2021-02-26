/*
Given an integer n, return the length of the longest consecutive run of 1s in its binary representation.

For example, given 156, you should return 3.
 */
public class DCP625 {

    public static void main(String[] args) {

        DCP625 dcp625 = new DCP625();
        System.out.println(dcp625.lengthOfBinary(156));

    }

    public int lengthOfBinary(int n){
        String m = Integer.toBinaryString(n);
        int count = 0;
        int result = 0;
        for (int i = 0; i < m.length(); i++){
            char c = m.charAt(i);
            if (c == '1'){
                count++;
                result = Math.max(count, result);
            }
            else {
                count = 0;
            }
        }
        return result;
    }


}
