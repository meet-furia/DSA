package stacks_and_queues.queues.implementation;

public class CircularQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;
    private int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        front++;
        front = front % data.length;
        size--;
    }
    public int peek() {
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        }
        while (i != end);
        System.out.println("End");
    }

    public void displayArr() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println("Front: " + front);
        System.out.println("End: " + end);

    }
}
