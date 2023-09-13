package stacks_and_queues.stacks.implementation.practice1.custom_stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int ptr = -1;

    public static void main(String[] args) {
    }
    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.data = new int[size ];
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        data[++ptr] = item;
    }
    protected boolean isFull() {
        return ptr == data.length - 1;
    }
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        ptr--;
    }
    private boolean isEmpty() {
        return ptr == -1;
    }

    public void display() {
        for (int i = 0; i <= ptr; i++) {
            System.out.println(data[i]);
        }
        System.out.println("--------------");
    }
}
