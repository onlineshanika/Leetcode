package org.exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SngleNumber {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> nameAndCount = new HashMap<>();

        for (int val : nums) {
            Integer count = nameAndCount.get(val);
            if (count == null) {
                nameAndCount.put(val, 1);
            } else {
                nameAndCount.put(val, ++count);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = nameAndCount.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
