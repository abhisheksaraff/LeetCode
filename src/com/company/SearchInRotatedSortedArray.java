package com.company;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0)); // Expected: 4
        System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3)); // Expected: -1
        System.out.println(search(new int[] { 1 }, 0)); // Expected: -1
        System.out.println(search(new int[] { 1, 3 }, 3));
    }

    public static int search(int[] nums, int target) {
        int start = helperFindStart(0, nums.length - 1, nums);

        if (target <= nums[nums.length - 1])
            return helperFindIndex(start, nums.length - 1, nums, target);
        else
            return helperFindIndex(0, start - 1, nums, target);
    }

    public static int helperFindStart(int left, int right, int[] nums) {
        int middle = (left + right) / 2;

        if (left == right)
            return left;
        else if (nums[middle] > nums[right])
            return helperFindStart(middle + 1, right, nums);
        else
            return helperFindStart(left, middle, nums);
    }

    private static int helperFindIndex(int left, int right, int[] nums, int target) {
        int middle = (left + right) / 2;

        if (left > right)
            return -1;
        else if (nums[middle] == target)
            return middle;
        else if (target < nums[middle])
            return helperFindIndex(left, middle - 1, nums, target);
        else // target > nums[middle]
            return helperFindIndex(middle + 1, right, nums, target);
    }
}