package com.company;

/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
IV            4
IX            9
XL            40
XC            90
CD            400
CM            900

I             1
IV            4
V             5
IX            9
X             10
XL            40
L             50
XC            90
C             100
CD            400
D             500
CM            900
M             1000
 */

public class IntToRoman {
    public static void main(String[] args)  {
        System.out.println(intToRoman(58));
    }

    public static String intToRoman(int num) {
        StringBuilder result=new StringBuilder();

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for(int i = 0; i < 13; i++)    {
            while(num%values[i] != num) {
                switch(values[i]) { //Add corresponding Roman Numeral to result
                    case 1000:
                        result.append("M");
                        break;
                    case 900:
                        result.append("CM");
                        break;
                    case 500:
                        result.append("D");
                        break;
                    case 400:
                        result.append("CD");
                        break;
                    case 100:
                        result.append("C");
                        break;
                    case 90:
                        result.append("XC");
                        break;
                    case 50:
                        result.append("L");
                        break;
                    case 40:
                        result.append("XL");
                        break;
                    case 10:
                        result.append("X");
                        break;
                    case 9:
                        result.append("IX");
                        break;
                    case 5:
                        result.append("V");
                        break;
                    case 4:
                        result.append("IV");
                        break;
                    case 1:
                        result.append("I");
                        break;
                }
                num -= values[i];
            }
        }

        return result.toString();
    }
}
