package org.exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }


    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || (s.length() != t.length())) {
            return false;
        } else {
            HashMap<Character,Character> letterMap = new HashMap<>();
            Set<Character> duplicates = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if(duplicates.add(t.charAt(i))) {
                    letterMap.put(s.charAt(i), t.charAt(i));
                }
            }
            StringBuilder newIsomorphicStr = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                newIsomorphicStr.append(letterMap.get(s.charAt(i)));
            }
            return newIsomorphicStr.toString().equalsIgnoreCase(t);
        }
    }
}
