package org.exercises;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(53453464));
    }

    public static boolean isPalindrome(int x) {
//
        if (x < 0) {
            return false;
        }
//         String reverseOrder = new StringBuilder(Integer.toString(x)).reverse().toString();
        return Integer.toString(x).equalsIgnoreCase(new StringBuilder(Integer.toString(x)).reverse().toString());
    }
}
