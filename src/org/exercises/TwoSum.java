package org.exercises;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        int[] returnArray = twoSum(new Integer[]{3, 2,4}, 6);

        System.out.println(Arrays.toString(returnArray));
    }


    public static int[] twoSum(Integer[] nums, int target) {

        int[] returnArray = new int[2];
        Map<Integer, Integer> indexes = new HashMap<>();
        int toCheckValue = 0;

        for (int x = 0; x < nums.length; x++) {
            System.out.println("  nums[x]  " + nums[x]);



             for (int y= x + 1; y<nums.length;y++){

                 if (nums[y] == target - nums[x]) {
                     return new int[] { x, y };
                 }

//                if ( (nums[x] +nums[y] )== target){
////                if ( (nums[x] +nums[y] )== target){
//                    returnArray[1] = x;
//                    returnArray[0] = y;
//                }

             }
        }

        return returnArray;
    }
}
