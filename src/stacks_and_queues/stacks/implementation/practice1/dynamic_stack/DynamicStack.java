package stacks_and_queues.stacks.implementation.practice1.dynamic_stack;

import stacks_and_queues.stacks.implementation.practice1.custom_stack.CustomStack;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        super.push(item);
    }
}
