package com.wilson688.algorithms.linkedlist;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
    ListNode() {
        this.next = null;
    }
}

public class ReverseLinkedList {

    public static ListNode reverse(ListNode head) {

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        // 2 4 6 8 10
        while (current != null) {
            next = current.next; // 4
            current.next = prev; // null
            prev = current; // 2
            current = next; // 4
        }

      return prev;
    }


    public static ListNode reverseRecussion(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode firstHead = reverseRecussion(head.next);
        head.next.next = head;
        head.next = null;

        return firstHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);

        // 2 4 6 8 10
        // 10 8 6 4 2
        ListNode result = ReverseLinkedList.reverseRecussion(head);
        System.out.print("Nodes of the reversed LinkedList are: ");
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }
}
