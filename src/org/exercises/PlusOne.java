package org.exercises;

import java.math.BigInteger;

public class PlusOne {


    public static void main(String[] args) {
//        System.out.println(plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}).toString());
        System.out.println(plusOne(new int[]{9}).toString());
//        Long newNum = Long.parseLong("9876543210") + 1;
//        BigDecimal inp;
//        BigInteger big2 = new BigInteger("12345565678566567131275737372777569");
//        System.out.println(newNum);
    }

    public static int[] plusOne(int[] digits) {

        StringBuilder number = new StringBuilder();
        for (int digit : digits) {
            number.append(digit);
        }
        BigInteger newNumber = new BigInteger(number.toString()).add(new BigInteger("1"));
        String numStr = newNumber.toString();
        char[] ch = numStr.toCharArray();
        int[] num = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            num[i] = ch[i] - '0';
        }

        return num;
    }
}
