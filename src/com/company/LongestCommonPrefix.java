package com.company;

public class LongestCommonPrefix {
    public static void main(String[] args)  {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        String lcp = "", templcp="";
        int maxLength = strs[0].length();
        boolean containslcp;

        for(int i = 0; i < maxLength; i++)   {
            containslcp = true;
            //System.out.println(templcp);
            templcp+=strs[0].charAt(i);
            //System.out.println(templcp);

            for(int j = 0; j < strs.length; j++)    {
                //System.out.println("Current word " + strs[j]);
                if(strs[j].length() < maxLength)
                    maxLength = strs[j].length();

                if(!strs[j].startsWith(templcp)) {
                    containslcp=false;
                    break;
                }
            }
            if(containslcp)
                lcp = templcp;
            else
                break;

            //System.out.println("Next run " + lcp + " " + maxLength);
        }

        return lcp;
    }
}
