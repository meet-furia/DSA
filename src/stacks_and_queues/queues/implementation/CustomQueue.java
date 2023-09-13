package stacks_and_queues.queues.implementation;

public class CustomQueue {
    private int[] data;
    private int end = 0;

    private static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        data[end++] = item;
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        end--;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " -> ");
        }
        System.out.println("End");
    }

}
