package linkedlist.implementation.doubly_linkedlist;


public class DoublyLinkedList {
    private Node head;
    private Node tail;
    public int size;

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
        public void insertFirst(int value) {
            Node node = new Node(value, head, null);

            if (head == null) {
                tail = node;
            }
            else {
                head.prev = node;
            }
            head = node;
            size++;
        }

        public void insertLast(int value) {
            if (head == null) {
                insertFirst(value);
                return;
            }

            Node node = new Node(value, null, tail);
            tail.next = node;
            tail = node;
            size++;
        }

        public void insertAtIndex(int index, int value) {
            if (index < 0 || index > size) {
                System.out.println("Index cannot be less than zero or more than size");
            }
            if (index == 0) {
                insertFirst(value);
                return;
            }
            if (index == size) {
                insertLast(value);
                return;
            }

            Node temp = traverse(index);
            Node node = new Node(value, temp.next, temp);
            temp.next.prev = node;
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

        public void deleteFirst() {
            if (head == null) {
                System.out.println("Linked List is empty");
                return;
            }
            head = head.next;
            head.prev = null;
            size--;
        }

        public void deleteLast() {
            if (head == null) {
                System.out.println("Linked List is empty");
                return;
            }
            if (head == tail) {
                deleteFirst();
                size--;
                return;
            }

            Node temp = tail.prev;
            temp.next = null;
            tail = temp;
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

            Node temp = traverse(index);
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }


    public void display() {
        Node temp = head;
        System.out.print("Start -> ");
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
        System.out.println("-----------------------------------------");
    }

    public void reverseDisplay() {
        Node temp = tail;
        System.out.print("End -> ");
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("Start");
        System.out.println("-----------------------------------------");
    }

}
