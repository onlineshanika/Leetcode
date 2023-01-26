package org.exercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;

public class RemoveDuplicatesFromSortedArray {


    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1}));
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> uniqueSet = new LinkedHashSet<Integer>();
        for (int num : nums) {
            uniqueSet.add(num);
        }
        int k = 0;
        for (Integer i: uniqueSet) {
            nums[k++] = i;
        }
        return uniqueSet.size();
    }
}
