package linkedlist.implementation.doubly_linkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(10);
        doublyLinkedList.insertFirst(5);
        doublyLinkedList.insertLast(25);
        doublyLinkedList.insertLast(30);
        doublyLinkedList.insertAtIndex(2, 15);
        doublyLinkedList.insertAtIndex(3, 20);

        doublyLinkedList.display();
        doublyLinkedList.reverseDisplay();

        doublyLinkedList.deleteLast();
        doublyLinkedList.deleteFirst();
        doublyLinkedList.display();
        doublyLinkedList.deleteAtIndex(3);

        doublyLinkedList.display();
    }
}
