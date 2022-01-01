package com.company;

public class TwoSum
{
    public static void main(String[] args)
    {
        int question[] = {1,3,7,9,23,6};
        solution(question, 10);
        System.out.println();
    }

    static int[] solution(int[] nums, int target) {
        int[] solution = new int[2];

        for(int i = 0; i <= nums.length-1; i++)
        {
            for(int j = 1; j <= nums.length-1; j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    solution [0] = i;
                    solution [1] = j;
                    return solution;
                }
            }
        }
        return solution;
    }
}
