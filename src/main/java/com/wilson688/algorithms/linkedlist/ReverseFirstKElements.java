package com.wilson688.algorithms.linkedlist;

public class ReverseFirstKElements {


    public static ListNode reverseKElements(ListNode head, int k) {
        if (k < 2) return head;
        ListNode current = head, prev = null, next = null;


        ListNode lastNodeOfFirstPart = prev;
        ListNode lastNodeOfSubList = current;
        for (int i = 0; current != null && i < k; i++) {
            next = current.next; // 4
            current.next = prev; // null
            prev = current; // 2
            current = next; // 4
        }
//
//       head.next = current;
//
//        return prev;

        // connect with the first part
        if (lastNodeOfFirstPart != null)
            lastNodeOfFirstPart.next = prev; // 'prev' is now the first node of the sub-list
        else // this means p == 1 i.e., we are changing the first node (head) of the LinkedList
            head = prev;

        // connect with the last part
        lastNodeOfSubList.next = current;

        return head;
    }




    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = new ListNode(12);
        head.next.next.next.next.next.next = new ListNode(14);

        // 2 4 6 8 10
        // 10 8 6 4 2
        ListNode result = ReverseFirstKElements.reverseKElements(head, 4);
        System.out.print("Nodes of the reversed LinkedList are: ");
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }
}
