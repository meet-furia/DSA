package linkedlist.implementation.circular_linkedlist;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(10);
        circularLinkedList.insertFirst(5);
        circularLinkedList.insertLast(25);
        circularLinkedList.insertLast(30);
        circularLinkedList.insertAtIndex(2, 15);
        circularLinkedList.insertAtIndex(3, 20);

        circularLinkedList.display();


        circularLinkedList.deleteFirst();
        circularLinkedList.deleteLast();
        circularLinkedList.deleteAtIndex(3);

        System.out.println(circularLinkedList.size);
        System.out.println(circularLinkedList.head.value);
        System.out.println(circularLinkedList.tail.value);
        circularLinkedList.display();
    }
}
