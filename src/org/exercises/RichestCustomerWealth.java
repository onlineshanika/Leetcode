package org.exercises;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
        System.out.println(maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
        System.out.println(maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
    }

    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int currentWealth = 0;
        for (int[] account : accounts) {
            currentWealth = 0;
            for (int i : account) {
                currentWealth += i;
            }
            if (currentWealth > wealth) {
                wealth = currentWealth;
            }
        }
        return wealth;
    }
}
