package org.exercises;

import java.math.BigInteger;

import static java.lang.Math.abs;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-1534236469));
        System.out.println(reverse(-2147483648));
        System.out.println(reverse(5462));
        System.out.println(reverse(150));
        System.out.println(reverse(-8970));
    }

    public static int reverse(int x) {
        if (Integer.MAX_VALUE > x && x > Integer.MIN_VALUE) {

            StringBuilder reverseStr = new StringBuilder(Integer.toString(abs(x))).reverse();
            String returnStr = x > 0 ? reverseStr.toString() : "-" + reverseStr;
            BigInteger value = new BigInteger(returnStr);

            if ((value.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) < 0 && value.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) > 0)) {
                return value.intValue();
            }
        }
        return 0;
    }
}
