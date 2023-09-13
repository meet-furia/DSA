package linkedlist.striver.practice1;

public class DeleteNodeInALinkedList {
    public static void main(String[] args) {
        ListNode listNode4 = new ListNode(9);
        ListNode listNode3 = new ListNode(1, listNode4);
        ListNode listNode2 = new ListNode(5, listNode3);
        ListNode listNode1 = new ListNode(4, listNode2);

        ReverseLinkedList.display(listNode1);
        deleteNode(listNode3);
        ReverseLinkedList.display(listNode1);
    }
    static public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
