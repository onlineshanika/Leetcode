package org.exercises;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {

        int reverse = 0, element, remainder;
        element = x;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            remainder = x % 10;
            reverse = (reverse * 10) + remainder;
            x = x / 10;
        }
        return element == reverse;
    }
}
