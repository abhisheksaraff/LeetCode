package com.company;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int question[] = { 1, 3, 7, 9, 23, 6 };
        int result[] = twoSum(question, 10);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (complements.get(target - nums[i]) != null)
                return new int[] { complements.get(target - nums[i]), i };
            else
                complements.put(nums[i], i);
        }

        return new int[] {}; // no solution found
    }
}
