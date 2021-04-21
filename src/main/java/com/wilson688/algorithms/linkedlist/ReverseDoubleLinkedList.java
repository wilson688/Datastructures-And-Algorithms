package com.wilson688.algorithms.linkedlist;

class DoubleListNode {
    int value;
    DoubleListNode next;
    DoubleListNode prev;

    DoubleListNode(int value) {
        this.value = value;
    }
}


public class ReverseDoubleLinkedList {

    public static DoubleListNode reverse(DoubleListNode head) {

        DoubleListNode current = head;
        DoubleListNode prev = null;
        DoubleListNode next = null;

        // 2 4 6 8 10
        while (current != null) {
            next = current.next; // 4
            current.next = prev; // null
            prev = current; // 2
            current = next; // 4
        }

        return prev;
    }

    public static void main(String[] args) {
        DoubleListNode head = new DoubleListNode(2);
        head.prev = null;
        head.next = new DoubleListNode(4);
        head.next.prev = head;
        head.next.next = new DoubleListNode(6);
        head.next.next.prev = head.next;
        head.next.next.next = new DoubleListNode(8);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new DoubleListNode(10);
        head.next.next.next.next.prev = head.next.next.next;

        // 2 4 6 8 10
        // 10 8 6 4 2
        DoubleListNode result = ReverseDoubleLinkedList.reverse(head);
        System.out.print("Nodes of the reversed LinkedList are: ");
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }
}
