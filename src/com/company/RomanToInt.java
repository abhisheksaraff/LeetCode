package com.company;

/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
I can be placed before V (5) and X (10) to make 4 and 9. P1,2
X can be placed before L (50) and C (100) to make 40 and 90. Q1,2
C can be placed before D (500) and M (1000) to make 400 and 900 R1,2
 */

public class RomanToInt {
    public static void main(String[] args)  {
        String s = "III";
        System.out.println(romantoint(s));
    }

    public static int romantoint(String s) {
        int result= 0;

        /*
        char[] letters = s.toCharArray();
        for(int i = 0; i<= letters.length-1; i++) {
            if(i==letters.length-1)
                result+=intValue(letters[i]);
            else if(intValue(letters[i]) < intValue(letters[i+1])) {
                result += (intValue(letters[i + 1]) - intValue(letters[i]));
                i++;
            }
            else
                result += intValue(letters[i]);
            */

        //char[] letters = s.toCharArray();
        for(int i = 0; i<= s.length()-1; i++) {
            if(i==s.length()-1)
                result+=intValue(s.charAt(i));
            else if(intValue(s.charAt(i)) < intValue(s.charAt(i+1))) {
                result += (intValue(s.charAt(i+1)) - intValue(s.charAt(i)));
                i++;
            }
            else
                result += intValue(s.charAt(i));

        }
        return result;

    }

    public static int intValue(char c)  {
        if(c=='I')
            return 1;
        if(c=='V')
            return 5;
        if(c=='X')
            return 10;
        if(c=='L')
            return 50;
        if(c=='C')
            return 100;
        if(c=='D')
            return 500;
        if(c=='M')
            return 1000;

        return 0;
    }
}
