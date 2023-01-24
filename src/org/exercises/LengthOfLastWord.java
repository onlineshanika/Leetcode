package org.exercises;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        String[] strSplit = s.split("\\s+");
        return strSplit[strSplit.length - 1].length();
    }

}
