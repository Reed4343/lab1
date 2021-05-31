package org.example;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Util {

    public static String reverseString(String str){
        if (str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
