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
        StringBuilder hayStrBui = new StringBuilder(haystack);
        int i = 0;
        do{
            if(!(needle.charAt(i) == haystack.charAt(i)))   {
                hayStrBui.deleteCharAt(0);
            }   else    {
                i++;
            }
            System.out.println(hayStrBui + " " + i);
        } while(hayStrBui.length() > needle.length() && i != needle.length());

        if(hayStrBui.equals(needle)){
            return hayStrBui.length();
        }   else
            return -1;
    }
}
