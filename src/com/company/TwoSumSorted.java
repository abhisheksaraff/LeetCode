package com.company;

import java.util.HashMap;

public class TwoSumSorted {

    public static void main(String[] args) {
        int[] numbers = new int[]{-1,0};
        int target = -1;

        int[] solution = new int[2];
        HashMap<Integer, Integer> numMap= new HashMap<>();

        for(int i=0; i<=numbers.length-1; i++)
        {
            int complement = target-numbers[i];
            if(numMap.containsKey(complement))
            {
                solution[1]=i+1;
                solution[0]=numMap.get(complement)+1;
            }
            else
            {
                numMap.put(numbers[i], i);
            }

            System.out.println(i + " " + numbers[i] + " " + complement);
        }
        System.out.println();
        System.out.println(solution[0]+" "+solution[1]);
    }
}
