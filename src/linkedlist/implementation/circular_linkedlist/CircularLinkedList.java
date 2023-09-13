package linkedlist.implementation.circular_linkedlist;

public class CircularLinkedList {
    Node head;
    Node tail;
    int size;
     class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        if (head == null) {
            Node node = new Node(value);
            head = node;
            tail = node;
            size++;
            return;
        }
        Node node = new Node(value);
        node.next = head;
        head = node;
        tail.next = node;
        size++;
    }


    public void insertLast(int value) {
        if (head == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        tail.next = head;
        size++;
    }

    public void insertAtIndex(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Index does not exist");
            return;
        }
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = traverse(index - 1);
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public Node traverse(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        head = head.next;
        tail.next = head;
        size--;
    }

    public void deleteLast() {
        if (head == tail) {
            deleteFirst();
            return;
        }

        Node temp = traverse(size - 2);
        System.out.println(temp.value);
        tail = temp;
        tail.next = head;
        size--;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index does not exist");
            return;
        }

        if (index == 0) {
            deleteFirst();
            return;
        }

        if (index == size - 1) {
            deleteLast();
            return;
        }

        Node temp = traverse(index - 1);
        temp.next = temp.next.next;
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != tail) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.value + " -> ");
        System.out.println("End -> ");
        System.out.println("-------------------------------------------------");
    }
}
