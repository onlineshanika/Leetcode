package org.exercises;

import java.util.LinkedList;
import java.util.List;

public class ValidParentheses {

    public static void main(String[] args) {

        ValidParentheses validParentheses = new ValidParentheses();
//        System.out.println(validParentheses.isValid("{[]}"));
//        System.out.println(validParentheses.isValid("{}"));
        System.out.println(validParentheses.isValid(")}"));
//        System.out.println(validParentheses.isValid("{[])}"));
    }

    public boolean isValid(String s) {
        List<Character> characterLinkedList = new LinkedList<Character>();
        if (s != null && s.length() > 1) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') {
                    characterLinkedList.add(ch);
                } else {
                    if (!characterLinkedList.isEmpty() && ((characterLinkedList.get(characterLinkedList.size() - 1) == '(' && ch == ')')
                            || (characterLinkedList.get(characterLinkedList.size() - 1) == '{' && ch == '}')
                            || (characterLinkedList.get(characterLinkedList.size() - 1) == '[' && ch == ']'))) {

                        characterLinkedList.remove(characterLinkedList.size() - 1);

                    } else {
                        return false;
                    }
                }
            }
            return characterLinkedList.isEmpty();
        }

        return false;
    }
}
