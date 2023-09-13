package linkedlist.striver.practice1;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(25);
        ListNode listNode4 = new ListNode(20, listNode5);
        ListNode listNode3 = new ListNode(15, listNode4);
        ListNode listNode2 = new ListNode(10, listNode3);
        ListNode listNode1 = new ListNode(5, listNode2);

        ReverseLinkedList.display(listNode1);

        ReverseLinkedList.reverseList(listNode1);

        ReverseLinkedList.display(listNode5);
    }


    static public void display(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }


    static public ListNode reverseList(ListNode head) {
        // Base case: if the list is empty or has only one element, return the head
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse the rest of the list recursively
        ListNode reversed = reverseList(head.next);


        System.out.print("Reversed Value: " + reversed.val + "    ");
        System.out.print("Head Value: " + head.val + "    ");
        System.out.print("Head Next Next Value: " + head.next.next + "    ");


        // Adjust the next pointer of the current head
        head.next.next = head;

        System.out.print("Head Next Value: " + head.next.val + "    ");
        System.out.print("Head Next Next Value After Updation: " + head.next.next.val + "    ");
        System.out.println();


        head.next = null;

        return reversed;
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

