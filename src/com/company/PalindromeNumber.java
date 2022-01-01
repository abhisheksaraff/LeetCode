package com.company;

import java.util.LinkedList;

public class PalindromeNumber
{
    public static void main(String[] args)  {
        int x = -121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;

        LinkedList<Integer> xlong= new LinkedList<>();
        do  {
            xlong.add(x%10);
            x/=10;
        } while(x!=0);

        if(xlong.size()%2 == 1)
            xlong.remove(xlong.size()/2);

        while(xlong.peekFirst()!=null) {
            if(!(xlong.pollFirst()==xlong.pollLast()))
                return false;
        }
        return true;
    }
}
