package linkedlist.implementation;

public class LinkedListSelf {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
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
        size++;
    }

    public void insertAtIndex(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("Index cannot be less than 0 or more than size");
        }
        if (index == size) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        Node temp = traverse(index);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    private Node traverse(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println("Tail: " + tail.value);
        System.out.println("Head: " + head.value);
        System.out.println("Size: " + size);
        System.out.println("------------------------------");
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        head = head.next;
        size--;
    }
    public void deleteLast() {
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        Node temp = traverse(size - 1);
        tail = temp;
        tail.next = null;
        size--;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index cannot be less than 0 or more than size");
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
        Node temp = traverse(index);
        temp.next = temp.next.next;
        size--;
    }
}
