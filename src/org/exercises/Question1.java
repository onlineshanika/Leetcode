package org.exercises;

import java.util.HashMap;
import java.util.Map;

public class Question1 {


    public static void main(String[] args) {
        String number = "MMCMXCIV";
        System.out.println(romanToInt(number));
    }

    public static int romanToInt(String number) {

        Map<Character, Integer> numeralsMap = new HashMap<Character, Integer>();
        numeralsMap.put('I', 1);
        numeralsMap.put('V', 5);
        numeralsMap.put('X', 10);
        numeralsMap.put('L', 50);
        numeralsMap.put('C', 100);
        numeralsMap.put('D', 500);
        numeralsMap.put('M', 1000);

        if (1 <= number.length() && number.length() <= 15) {
            int num = 0;
            number = number.replace("IV", "IIII");
            number = number.replace("IX", "VIIII");
            number = number.replace("XL", "XXXX");
            number = number.replace("XC", "LXXXX");
            number = number.replace("CD", "CCCC");
            number = number.replace("CM", "DCCCC");

            if (number.matches("[IVXLCDM]*")) {
                for (int i = 0; i < number.length(); i++)
                    num = num + (numeralsMap.get(number.charAt(i)));
            }

            return num;
        }

        return 0;
    }
}
