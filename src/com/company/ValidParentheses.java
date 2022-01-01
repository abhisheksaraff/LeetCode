package com.company;

import java.util.Locale;

public class ValidParentheses {
    public static void main(String[] args)  {
        String s = "(){}}{", t = "(){}}{";
        System.out.println(isValid(s));
    }

    //  {{[(

    public static boolean isValid(String s) {
        if(s.length()%2 != 0)
            return false;
        //        System.out.println("hi3");
        String tempString="";
        for(int i = 0; i < s.length(); i++) {
            System.out.println(i);
            System.out.println(s);
            if(i == s.length()-1 && tempString!="")    {
                tempString+=s.charAt(i);
                i = 0;
                if(s == tempString)
                    return false;
                s = "" + tempString;
                tempString = "";

            }   else if(((s.charAt(i)=='{' && s.charAt(i+1)=='}') || (s.charAt(i)=='(' && s.charAt(i+1)==')') || (s.charAt(i)=='[' && s.charAt(i+1)==']')) && i != s.length())  {
                {//System.out.println(tempString);
                    i+=1;}
            }   else
                tempString+=s.charAt(i);
            //System.out.println(tempString + " after step " + i + " " + s);
        }
        //System.out.println(tempString + " ans " + s);

        if(tempString.equals(""))
            return true;
        return false;
    }
}

        /*
        for(int i = 0; i < s.length(); i++) {
            if(i==s.length()-1) {
                //System.out.println("End of loop once "+ s + " & " + tempString);
                s=tempString+s.charAt(i);
                tempString="";
                //System.out.println("After switcheroo "+ s + " & " + tempString);
                i=0;
            } else if((s.charAt(i)=='{' && s.charAt(i+1)=='}') || (s.charAt(i)=='(' && s.charAt(i+1)==')') || (s.charAt(i)=='[' && s.charAt(i+1)==']'))  {
                //System.out.println(tempString + " found one " + i);
                i+=1;
            } else
                tempString+=s.charAt(i);
            //System.out.println("After loop "+tempString + " " + i);
        }
        if(s=="")
            return true;
        return false;
        */
