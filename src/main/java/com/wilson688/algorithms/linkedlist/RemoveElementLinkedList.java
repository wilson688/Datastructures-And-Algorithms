package com.wilson688.algorithms.linkedlist;

public class RemoveElementLinkedList {


    static ListNode removeElement(ListNode head, int k) {
       if (head == null || head.next == null) return head;
        ListNode curr = head, next = null, previous = null;


        while (curr != null) {
            if (curr.value == k) {
                next = curr.next;
                if(previous == null) {
                    curr = curr.next;
                } else {
                    curr = previous;
                }
                curr.next = next;
            }
            previous = curr;
            curr = curr.next;
        }

        return head;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);

        // 2 4 6 8 10
        // 10 8 6 4 2
        ListNode result = RemoveElementLinkedList.removeElement(head, 2);
        System.out.print("Nodes of the LinkedList are: ");
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }
}
