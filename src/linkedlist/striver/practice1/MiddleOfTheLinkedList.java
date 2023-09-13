package linkedlist.striver.practice1;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(25);
        ListNode listNode4 = new ListNode(20, listNode5);
        ListNode listNode3 = new ListNode(15, listNode4);
        ListNode listNode2 = new ListNode(10, listNode3);
        ListNode listNode1 = new ListNode(5, listNode2);
        ListNode listNode = new ListNode(0, listNode1);
        ListNode mid = middleNode(listNode);

        System.out.println(mid.val);
    }
    static public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
