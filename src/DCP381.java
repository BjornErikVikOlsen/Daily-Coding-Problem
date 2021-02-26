/*
Implement a function that converts a hex string to base64.

For example, the string:

deadbeef

should produce:

3q2+7w==
 */

import java.math.BigInteger;


public class DCP381 {

    public static void main(String... args) {
        String hexadecimal = "6a95b4dd5419f2ffb9f655309c931cb0";
        System.out.println("hexadecimal: " + hexadecimal);

        BigInteger bigint = new BigInteger(hexadecimal, 16);

        StringBuilder sb = new StringBuilder();
//        byte[] ba = Base64.encodeInteger(bigint);
//        for (byte b : ba) {
//            sb.append((char)b);
//        }
//        String s = sb.toString();
//        System.out.println("base64: " + s);
//        System.out.println("encoded: " + Base64.isBase64(s));
    }

}
