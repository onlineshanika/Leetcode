package org.exercises;

public class StringToInteger {

    public static void main(String[] args) {
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("words and 987"));
    }


    public static int myAtoi(String input) {
        int index = 0;
        int sign = 1;
        int result = 0;
        int length = input.length();

        while (index < length && input.charAt(index) == ' ') {
            index++;
        }
        if (index < length && input.charAt(index) == '+') {
            sign = 1;
            index++;
        } else if (index < length && input.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        while (index < length && Character.isDigit(input.charAt(index))) {
            int digit = input.charAt(index) - '0';

            if ((result > Integer.MAX_VALUE / 10) ||
                    (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Append current digit to the result.
            result = 10 * result + digit;
            index++;
        }
        return sign * result;
    }
}
