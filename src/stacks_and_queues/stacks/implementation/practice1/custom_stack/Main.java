package stacks_and_queues.stacks.implementation.practice1.custom_stack;

import stacks_and_queues.stacks.implementation.practice1.dynamic_stack.DynamicStack;

public class Main {
    public static void main(String[] args) {
        CustomStack customStack = new DynamicStack();
        customStack.push(5);
        customStack.push(10);
        customStack.push(15);
        customStack.push(20);
        customStack.push(25);
        customStack.push(30);
        customStack.push(35);
        customStack.push(40);
        customStack.push(45);
        customStack.push(50);
        customStack.push(55);
        customStack.push(60);

        customStack.display();

        customStack.pop();
        customStack.pop();
        customStack.pop();

        customStack.display();

        customStack.pop();
        customStack.pop();
        customStack.pop();

        customStack.display();
    }
}
