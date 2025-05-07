package com;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Test 1: [2,4,3] + [5,6,4] = [7,0,8]
        ListNode l1 = createList(new int[] { 2, 4, 3 });
        ListNode l2 = createList(new int[] { 5, 6, 4 });
        ListNode result1 = addTwoNumbers(l1, l2);
        printList(result1); // Expected: 7 -> 0 -> 8

        // Test 2: [9,9,9,9,9,9,9] + [9,9,9,9] = [8,9,9,9,0,0,0,1]
        ListNode l3 = createList(new int[] { 9, 9, 9, 9, 9, 9, 9 });
        ListNode l4 = createList(new int[] { 9, 9, 9, 9 });
        ListNode result2 = addTwoNumbers(l3, l4);
        printList(result2); // Expected: 8 -> 9 -> 9 -> 9 -> 0 -> 0 -> 0 -> 1
    }

    static ListNode createList(int[] digits) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int d : digits) {
            curr.next = new ListNode(d);
            curr = curr.next;
        }
        return dummy.next;
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersHelper(l1, l2, 0);
    }

    public static ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry) {

        if (l1 == (null) && l2 == (null)) {
            if (carry == 0)
                return null;
            else
                return new ListNode(carry);
        } else if (l1 == (null)) {
            if ((l2.val + carry) < 10)
                return new ListNode((l2.val + carry), addTwoNumbersHelper(l1, l2.next, 0));
            else
                return new ListNode((l2.val + carry - 10), addTwoNumbersHelper(l1, l2.next, 1));
        } else if (l2 == (null)) {
            if ((l1.val + carry) < 10)
                return new ListNode((l1.val + carry), addTwoNumbersHelper(l1.next, l2, 0));
            else
                return new ListNode((l1.val + carry - 10), addTwoNumbersHelper(l1.next, l2, 1));
        } else {
            if ((l1.val + l2.val + carry) < 10)
                return new ListNode((l1.val + l2.val + carry), addTwoNumbersHelper(l1.next, l2.next, 0));
            else
                return new ListNode((l1.val + l2.val + carry - 10), addTwoNumbersHelper(l1.next, l2.next, 1));
        }
    }

    // public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    // return getIntToListNode(getValue(l1, 1) + getValue(l2, 1));
    // }

    // private static int getValue(ListNode l, int multiplier) {
    // if (l.next == null)
    // return l.val * multiplier;
    // else
    // return (l.val * multiplier) + getValue(l.next, multiplier * 10);
    // }

    // private static ListNode getIntToListNode(int i) {
    // if (i / 10 == 0)
    // return new ListNode(i);
    // else
    // return new ListNode((i % 10), getIntToListNode(i / 10));
    // }
}