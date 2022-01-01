package com.company;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class LinkedListAdd {

    public static void main(String[] args) {
        int[] al1 = {9,9,9,9,9,9,9};
        int[] al2 = {9,9,9,9};
        LinkedList<Integer> l1 = new LinkedList<>(), l2 = new LinkedList<>();

        for(int i = 0; i<=al1.length-1; i++)
            l1.add(al1[i]);
        for (int i = 0; i<=al2.length-1; i++)
            l2.add(al2[i]);

        int firsthalf = 0; //stores the digit in 10s place
        boolean firsthalfwillbeused = false;
        LinkedList<Integer> result = new LinkedList<>();

        while(!l1.isEmpty() || !l2.isEmpty()) {
            if(!firsthalfwillbeused)
                firsthalf = 0;

            if (!l1.isEmpty() && !l2.isEmpty()) {
                result.add((l1.getLast() + l2.getLast() + firsthalf) % 10);
                firsthalf = (l1.removeLast() + l2.removeLast()) / 10;
            } else if (!l2.isEmpty())    {
                result.add(l2.getLast() + firsthalf);
                firsthalf = (l2.removeLast()+firsthalf)/10;
            } else {
                result.add((l1.getLast() + firsthalf)%10);
                firsthalf = (l1.removeLast()+firsthalf)/10;
            }

            if (firsthalf != 0)
                firsthalfwillbeused = true;
        }

        if(firsthalf != 0)
            result.add(firsthalf);

        for (int i = 0; i<=result.size()-1; i++)
            System.out.println(result.get(i));
    }
}
