package com.company;

/*
* Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
*  or -1 if needle is not part of haystack.
*
* Clarification:
*
* What should we return when needle is an empty string? This is a great question to ask during an interview.
*
* For the purpose of this problem, we will return 0 when needle is an empty string.
* This is consistent to C's strstr() and Java's indexOf()
*/

public class ImplementStrStr {
    public static void main(String[] args)  {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length() || needle.length()==0 || haystack.length()==0 || !(haystack.contains(""+needle.charAt(0))))
            return -1;

        for(int i = haystack.indexOf(needle.charAt(0)); i < haystack.length()-needle.length(); i++)  {
            int needleCounter = 0;
            for(int j = i; j < i+needle.length(); j++) {
                if(j > haystack.length()-1)
                    return -1;
                if(haystack.charAt(i)==needle.charAt(i))  {
                    needleCounter ++;
                }
            }
            if(needleCounter == needle.length())
                return i;
            else
                needleCounter = 0;
        }

        return -1;
    }
}
