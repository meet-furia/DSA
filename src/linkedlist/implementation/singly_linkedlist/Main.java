package linkedlist.implementation.singly_linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedListSelf linkedListSelf = new LinkedListSelf();
        linkedListSelf.insertFirst(5);
        linkedListSelf.insertLast(15);
        linkedListSelf.insertAtIndex(10, 1);
        linkedListSelf.insertLast(25);
        linkedListSelf.insertLast(30);
        linkedListSelf.insertFirst(0);
        linkedListSelf.insertAtIndex(20, 4);
        linkedListSelf.display();

        linkedListSelf.deleteFirst();
        linkedListSelf.deleteLast();
        linkedListSelf.display();

        linkedListSelf.deleteAtIndex(2);
        linkedListSelf.display();
    }
}
